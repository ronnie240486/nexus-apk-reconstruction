package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: renamed from: qP */
/* JADX INFO: loaded from: classes.dex */
public class C5239qP extends ContextWrapper {

    /* JADX INFO: renamed from: qP$b */
    public static class b implements WindowManager {

        /* JADX INFO: renamed from: a */
        public final WindowManager f18520a;

        /* JADX WARN: Invalid debug info offset */
        public b(WindowManager windowManager) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ b(WindowManager windowManager, a aVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewManager
        public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.WindowManager
        public Display getDefaultDisplay() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewManager
        public void removeView(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.WindowManager
        public void removeViewImmediate(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewManager
        public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C5239qP(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        return null;
    }
}
