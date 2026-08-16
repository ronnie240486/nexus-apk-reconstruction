package android.media.ViviTV.viewholders;

import android.content.Context;
import android.media.ViviTV.C1756R;
import android.view.View;
import android.widget.ImageView;
import cn.dolit.twowayviewlib.viewholders.BaseRecyclerViewHolder;
import com.squareup.picasso.RequestCreator;
import java.util.HashMap;
import java.util.Random;
import p000.C4182cp;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseHomeRecyclerViewHolder extends BaseRecyclerViewHolder {

    /* JADX INFO: renamed from: g */
    public static final String f9760g = "android.media.ViviTV.viewholders.BaseHomeRecyclerViewHolder";

    /* JADX INFO: renamed from: h */
    public static final int f9761h = 480;

    /* JADX INFO: renamed from: i */
    public static final int f9762i = 120;

    /* JADX INFO: renamed from: j */
    public static final int f9763j = 30;

    /* JADX INFO: renamed from: k */
    public static Random f9764k = new Random();

    /* JADX INFO: renamed from: l */
    public static int[] f9765l = {C1756R.drawable.drawable_bg_black_half_transparent};

    /* JADX INFO: renamed from: m */
    public static final HashMap<String, Integer> f9766m;

    /* JADX INFO: renamed from: f */
    public C2339a f9767f;

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.BaseHomeRecyclerViewHolder$a */
    public class C2339a {

        /* JADX INFO: renamed from: a */
        public int f9768a;

        /* JADX INFO: renamed from: b */
        public String f9769b;

        /* JADX INFO: renamed from: c */
        public int f9770c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BaseHomeRecyclerViewHolder f9771d;

        /* JADX WARN: Invalid debug info offset */
        public C2339a(BaseHomeRecyclerViewHolder baseHomeRecyclerViewHolder) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m14295a() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public String m14296b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public int m14297c() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m14298d(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public void m14299e(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public void m14300f(int i) {
        }
    }

    static {
        HashMap<String, Integer> map = new HashMap<>();
        f9766m = map;
        map.put("tiny", Integer.valueOf(C1756R.dimen.dimen_12sp_sw_320_dp));
        map.put("very_small", Integer.valueOf(C1756R.dimen.dimen_14sp_sw_320_dp));
        map.put("small", Integer.valueOf(C1756R.dimen.dimen_16sp_sw_320_dp));
        map.put("normal", Integer.valueOf(C1756R.dimen.dimen_18sp_sw_320_dp));
        map.put("big", Integer.valueOf(C1756R.dimen.dimen_20sp_sw_320_dp));
        map.put("large", Integer.valueOf(C1756R.dimen.dimen_22sp_sw_320_dp));
        map.put("extra_large", Integer.valueOf(C1756R.dimen.dimen_24sp_sw_320_dp));
    }

    /* JADX WARN: Invalid debug info offset */
    public BaseHomeRecyclerViewHolder(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: F */
    public static void m14287F(android.content.Context r4, p000.C4182cp r5, com.squareup.picasso.RequestCreator r6, boolean r7, float r8) {
        /*
            return
        L6d:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.viewholders.BaseHomeRecyclerViewHolder.m14287F(android.content.Context, cp, com.squareup.picasso.RequestCreator, boolean, float):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public static void m14288G(Context context, C4182cp c4182cp, boolean z, RequestCreator requestCreator) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static void m14289H(View view, C4182cp c4182cp, boolean z, RequestCreator requestCreator) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public final void m14290A(C4182cp c4182cp) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public void m14291B(ImageView imageView) {
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo14292C(C4182cp c4182cp);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public int m14293D() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: E */
    public final void m14294E(p000.C4182cp r6) {
        /*
            r5 = this;
            return
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.viewholders.BaseHomeRecyclerViewHolder.m14294E(cp):void");
    }
}
