package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: Ai */
/* JADX INFO: loaded from: classes.dex */
public class C0047Ai extends BaseAdapter implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public Context f100a;

    /* JADX INFO: renamed from: b */
    public List<C0111Bi> f101b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, Boolean> f102c;

    /* JADX INFO: renamed from: d */
    public a f103d;

    /* JADX INFO: renamed from: e */
    public int f104e;

    /* JADX INFO: renamed from: Ai$a */
    public interface a {
        /* JADX INFO: renamed from: T */
        void mo215T(C0111Bi c0111Bi);
    }

    /* JADX INFO: renamed from: Ai$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f105a;

        /* JADX INFO: renamed from: b */
        public ImageView f106b;

        /* JADX INFO: renamed from: c */
        public TextView f107c;

        /* JADX INFO: renamed from: d */
        public TextView f108d;

        /* JADX INFO: renamed from: e */
        public ImageView f109e;

        /* JADX INFO: renamed from: f */
        public CheckBox f110f;

        /* JADX INFO: renamed from: g */
        public C0111Bi f111g;
    }

    /* JADX WARN: Invalid debug info offset */
    public C0047Ai(Context context, List<C0111Bi> list, a aVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m213a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m214b(List<C0111Bi> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.Adapter
    public int getCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
    }
}
