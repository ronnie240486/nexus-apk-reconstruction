package android.media.ViviTV.activity;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import android.media.ViviTV.Pre_launcher;

/**
 * Tela substituta do login de usuário e senha.
 *
 * Exibe o identificador que deve ser copiado para o painel. O servidor deve
 * liberar o mesmo valor antes do usuário seguir para o fluxo principal.
 */
public class DeviceMacActivity extends Activity {

    private String mac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.BLACK);
        getWindow().setNavigationBarColor(Color.BLACK);

        mac = DeviceIdentity.getMac(this);
        setContentView(createContentView());
    }

    private View createContentView() {
        int padding = dp(32);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(padding, padding, padding, padding);
        root.setBackgroundColor(Color.rgb(18, 18, 18));

        TextView title = new TextView(this);
        title.setText("Identificação do aparelho");
        title.setTextColor(Color.WHITE);
        title.setTextSize(24);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        root.addView(title, centeredParams());

        TextView description = new TextView(this);
        description.setText("Copie este MAC e cadastre-o no painel para liberar o aparelho.");
        description.setTextColor(Color.LTGRAY);
        description.setTextSize(16);
        description.setGravity(Gravity.CENTER);
        description.setPadding(0, dp(16), 0, dp(16));
        root.addView(description, centeredParams());

        TextView macView = new TextView(this);
        macView.setText(mac);
        macView.setTextColor(Color.WHITE);
        macView.setTextSize(28);
        macView.setTypeface(Typeface.MONOSPACE, Typeface.BOLD);
        macView.setGravity(Gravity.CENTER);
        macView.setContentDescription("MAC do aparelho: " + mac);
        macView.setPadding(dp(16), dp(20), dp(16), dp(20));
        root.addView(macView, centeredParams());

        Button copyButton = new Button(this);
        copyButton.setText("Copiar MAC");
        copyButton.setOnClickListener(view -> copyMac());
        root.addView(copyButton, centeredParams());

        Button continueButton = new Button(this);
        continueButton.setText("Continuar");
        continueButton.setOnClickListener(view -> openOriginalEntryPoint());
        root.addView(continueButton, centeredParams());

        return root;
    }

    private void copyMac() {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        if (clipboard != null) {
            clipboard.setPrimaryClip(ClipData.newPlainText("MAC do aparelho", mac));
            Toast.makeText(this, "MAC copiado", Toast.LENGTH_SHORT).show();
        }
    }

    private void openOriginalEntryPoint() {
        Intent intent = new Intent(this, Pre_launcher.class);
        intent.putExtra(DeviceIdentity.EXTRA_MAC, DeviceIdentity.getCompactMac(this));
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        finish();
    }

    private LinearLayout.LayoutParams centeredParams() {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER_HORIZONTAL;
        params.bottomMargin = dp(10);
        return params;
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }
}
