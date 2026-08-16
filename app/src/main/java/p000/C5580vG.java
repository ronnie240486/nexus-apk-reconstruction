package p000;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

/* JADX INFO: renamed from: vG */
/* JADX INFO: loaded from: classes.dex */
public class C5580vG extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public Context f19112a;

    /* JADX INFO: renamed from: b */
    public List<C5509uG> f19113b;

    /* JADX INFO: renamed from: c */
    public c f19114c;

    /* JADX INFO: renamed from: vG$a */
    public class a implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5580vG f19115a;

        /* JADX WARN: Invalid debug info offset */
        public a(C5580vG c5580vG) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: vG$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f19116a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C5509uG f19117b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C5580vG f19118c;

        /* JADX WARN: Invalid debug info offset */
        public b(C5580vG c5580vG, View view, C5509uG c5509uG) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: vG$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void m28798a(View view, C5509uG c5509uG);
    }

    /* JADX WARN: Invalid debug info offset */
    public C5580vG(Context context, List<C5509uG> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ c m28796a(C5580vG c5580vG) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m28797b(c cVar) {
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
}
