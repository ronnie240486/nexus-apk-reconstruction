package android.media.ViviTV;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.HttpSrv.MediaHttpSrv;
import android.media.SoundPool;
import android.media.ViviTV.model.persistent.LiveChannelInfo;
import android.media.ViviTV.model.persistent.RechargeCardInfo;
import android.os.AsyncTask;
import android.os.Build;
import androidx.annotation.NonNull;
import cn.dolit.DLBT.DolitBT;
import com.orm.SugarApp;
import com.p2pengine.core.tracking.TrackerZone;
import com.squareup.picasso.Request;
import com.squareup.picasso.RequestHandler;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC5157p6;
import p000.C0002A1;
import p000.C0038AZ;
import p000.C0116Bn;
import p000.C0124Bv;
import p000.C0259Du;
import p000.C0318Ep;
import p000.C0772Lx;
import p000.C0786MA;
import p000.C0986PH;
import p000.C1265Tf;
import p000.C1313UP;
import p000.C4198d4;
import p000.C4649k2;
import p000.C4898np;
import p000.C5176pP;
import p000.C5236qM;
import p000.C5383sZ;
import p000.C5664wa;
import p000.EnumC4713l2;
import p000.EnumC4779m4;
import p000.EnumC5557v1;
import p000.EnumC5761y2;
import p000.EnumC6006m10;

/* JADX INFO: loaded from: classes.dex */
public class MainApp extends SugarApp {

    /* JADX INFO: renamed from: A */
    public static final String f4325A = "http://update.flvurl.cn/siteparser/rule/custom/dolit.ott/update.json";

    /* JADX INFO: renamed from: A1 */
    public static final boolean f4326A1 = false;

    /* JADX INFO: renamed from: A4 */
    public static final boolean f4329A4;

    /* JADX INFO: renamed from: A5 */
    public static String f4330A5 = null;

    /* JADX INFO: renamed from: A6 */
    public static final String f4331A6 = "OTTClient_20170303_key1";

    /* JADX INFO: renamed from: B */
    public static final String f4332B = "s7jpk92kudijrl4a5kd9j5qg9cpt70p8";

    /* JADX INFO: renamed from: B1 */
    public static final boolean f4333B1 = true;

    /* JADX INFO: renamed from: B4 */
    public static final boolean f4336B4;

    /* JADX INFO: renamed from: B5 */
    public static EnumC6006m10 f4337B5 = null;

    /* JADX INFO: renamed from: B6 */
    public static final String f4338B6;

    /* JADX INFO: renamed from: C */
    public static final String f4339C = "com.cnnho.advertisingplayback.ACTION_SAVE_ME";

    /* JADX INFO: renamed from: C1 */
    public static final boolean f4340C1 = true;

    /* JADX INFO: renamed from: C4 */
    public static final boolean f4343C4;

    /* JADX INFO: renamed from: C5 */
    public static int f4344C5 = 0;

    /* JADX INFO: renamed from: C6 */
    public static int f4345C6 = 0;

    /* JADX INFO: renamed from: D */
    public static String f4346D = "2019013063173662";

    /* JADX INFO: renamed from: D4 */
    public static final boolean f4350D4;

    /* JADX INFO: renamed from: D5 */
    public static int f4351D5 = 0;

    /* JADX INFO: renamed from: D6 */
    public static boolean f4352D6 = false;

    /* JADX INFO: renamed from: E */
    public static String f4353E = "wx5de56c0cea4fd302";

    /* JADX INFO: renamed from: E3 */
    public static final boolean f4356E3;

    /* JADX INFO: renamed from: E4 */
    public static final boolean f4357E4;

    /* JADX INFO: renamed from: E5 */
    public static boolean f4358E5 = false;

    /* JADX INFO: renamed from: E6 */
    public static String f4359E6 = null;

    /* JADX INFO: renamed from: F */
    public static int f4360F = 2;

    /* JADX INFO: renamed from: F1 */
    public static final String f4361F1 = "Android_Land";

    /* JADX INFO: renamed from: F3 */
    public static final boolean f4363F3;

    /* JADX INFO: renamed from: F4 */
    public static final boolean f4364F4;

    /* JADX INFO: renamed from: F5 */
    public static int f4365F5 = 0;

    /* JADX INFO: renamed from: F6 */
    public static String f4366F6 = null;

    /* JADX INFO: renamed from: G */
    public static int f4367G = 1;

    /* JADX INFO: renamed from: G3 */
    public static final boolean f4370G3;

    /* JADX INFO: renamed from: G4 */
    public static final boolean f4371G4;

    /* JADX INFO: renamed from: G5 */
    public static int f4372G5 = 0;

    /* JADX INFO: renamed from: G6 */
    public static String f4373G6 = null;

    /* JADX INFO: renamed from: H */
    public static boolean f4374H = false;

    /* JADX INFO: renamed from: H3 */
    public static final boolean f4377H3;

    /* JADX INFO: renamed from: H4 */
    public static final boolean f4378H4;

    /* JADX INFO: renamed from: H5 */
    public static boolean f4379H5 = false;

    /* JADX INFO: renamed from: H6 */
    public static String f4380H6 = null;

    /* JADX INFO: renamed from: I */
    public static boolean f4381I = false;

    /* JADX INFO: renamed from: I1 */
    public static final boolean f4382I1 = false;

    /* JADX INFO: renamed from: I3 */
    public static final boolean f4384I3;

    /* JADX INFO: renamed from: I4 */
    public static final boolean f4385I4;

    /* JADX INFO: renamed from: I5 */
    public static int f4386I5 = 0;

    /* JADX INFO: renamed from: I6 */
    public static String f4387I6 = null;

    /* JADX INFO: renamed from: J */
    public static boolean f4388J = false;

    /* JADX INFO: renamed from: J1 */
    public static final boolean f4389J1 = false;

    /* JADX INFO: renamed from: J3 */
    public static final String f4391J3;

    /* JADX INFO: renamed from: J4 */
    public static final boolean f4392J4;

    /* JADX INFO: renamed from: J5 */
    public static C0259Du.a f4393J5 = null;

    /* JADX INFO: renamed from: J6 */
    public static int f4394J6 = 0;

    /* JADX INFO: renamed from: K */
    public static boolean f4395K = false;

    /* JADX INFO: renamed from: K3 */
    public static final boolean f4398K3;

    /* JADX INFO: renamed from: K4 */
    public static final int f4399K4;

    /* JADX INFO: renamed from: K5 */
    public static int f4400K5 = 0;

    /* JADX INFO: renamed from: K6 */
    public static int f4401K6 = 0;

    /* JADX INFO: renamed from: L */
    public static boolean f4402L = false;

    /* JADX INFO: renamed from: L3 */
    public static final boolean f4405L3;

    /* JADX INFO: renamed from: L4 */
    public static final boolean f4406L4;

    /* JADX INFO: renamed from: L5 */
    public static int f4407L5 = 0;

    /* JADX INFO: renamed from: M */
    public static boolean f4408M = false;

    /* JADX INFO: renamed from: M3 */
    public static final boolean f4411M3;

    /* JADX INFO: renamed from: M4 */
    public static final boolean f4412M4;

    /* JADX INFO: renamed from: M5 */
    public static SQLiteOpenHelper f4413M5 = null;

    /* JADX INFO: renamed from: N */
    public static boolean f4414N = false;

    /* JADX INFO: renamed from: N3 */
    public static final boolean f4417N3;

    /* JADX INFO: renamed from: N4 */
    public static final boolean f4418N4;

    /* JADX INFO: renamed from: N5 */
    public static SharedPreferences f4419N5 = null;

    /* JADX INFO: renamed from: O */
    public static boolean f4420O = false;

    /* JADX INFO: renamed from: O3 */
    public static final boolean f4423O3;

    /* JADX INFO: renamed from: O4 */
    public static final boolean f4424O4;

    /* JADX INFO: renamed from: O5 */
    public static boolean f4425O5 = false;

    /* JADX INFO: renamed from: P */
    public static boolean f4426P = false;

    /* JADX INFO: renamed from: P3 */
    public static final boolean f4429P3;

    /* JADX INFO: renamed from: P4 */
    public static final boolean f4430P4;

    /* JADX INFO: renamed from: P5 */
    public static boolean f4431P5 = false;

    /* JADX INFO: renamed from: Q */
    public static boolean f4432Q = true;

    /* JADX INFO: renamed from: Q3 */
    public static final boolean f4435Q3;

    /* JADX INFO: renamed from: Q4 */
    public static final boolean f4436Q4;

    /* JADX INFO: renamed from: Q5 */
    public static boolean f4437Q5 = false;

    /* JADX INFO: renamed from: R */
    public static boolean f4438R = false;

    /* JADX INFO: renamed from: R0 */
    public static final boolean f4439R0 = false;

    /* JADX INFO: renamed from: R3 */
    public static final boolean f4442R3;

    /* JADX INFO: renamed from: R4 */
    public static final boolean f4443R4;

    /* JADX INFO: renamed from: R5 */
    public static boolean f4444R5 = false;

    /* JADX INFO: renamed from: S0 */
    public static final boolean f4446S0 = false;

    /* JADX INFO: renamed from: S3 */
    public static final boolean f4449S3;

    /* JADX INFO: renamed from: S4 */
    public static final boolean f4450S4;

    /* JADX INFO: renamed from: S5 */
    public static HashMap<String, Integer> f4451S5 = null;

    /* JADX INFO: renamed from: T3 */
    public static final boolean f4456T3;

    /* JADX INFO: renamed from: T4 */
    public static final boolean f4457T4;

    /* JADX INFO: renamed from: T5 */
    public static SoundPool f4458T5 = null;

    /* JADX INFO: renamed from: U0 */
    public static final boolean f4460U0 = true;

    /* JADX INFO: renamed from: U3 */
    public static final boolean f4463U3;

    /* JADX INFO: renamed from: U4 */
    public static final String f4464U4;

    /* JADX INFO: renamed from: U5 */
    public static boolean f4465U5 = false;

    /* JADX INFO: renamed from: V */
    public static final boolean f4466V = false;

    /* JADX INFO: renamed from: V3 */
    public static final boolean f4470V3;

    /* JADX INFO: renamed from: V4 */
    public static final boolean f4471V4 = false;

    /* JADX INFO: renamed from: V5 */
    public static Context f4472V5 = null;

    /* JADX INFO: renamed from: W */
    public static final boolean f4473W = false;

    /* JADX INFO: renamed from: W0 */
    public static final boolean f4474W0 = false;

    /* JADX INFO: renamed from: W3 */
    public static final boolean f4477W3;

    /* JADX INFO: renamed from: W4 */
    public static boolean f4478W4 = false;

    /* JADX INFO: renamed from: W5 */
    public static long f4479W5 = 0;

    /* JADX INFO: renamed from: X0 */
    public static final boolean f4481X0 = false;

    /* JADX INFO: renamed from: X3 */
    public static final boolean f4484X3;

    /* JADX INFO: renamed from: X4 */
    public static boolean f4485X4 = false;

    /* JADX INFO: renamed from: X5 */
    public static boolean f4486X5 = false;

    /* JADX INFO: renamed from: Y */
    public static final boolean f4487Y = true;

    /* JADX INFO: renamed from: Y0 */
    public static final boolean f4488Y0 = false;

    /* JADX INFO: renamed from: Y3 */
    public static final boolean f4491Y3;

    /* JADX INFO: renamed from: Y4 */
    public static boolean f4492Y4 = false;

    /* JADX INFO: renamed from: Y5 */
    public static boolean f4493Y5 = false;

    /* JADX INFO: renamed from: Z */
    public static final boolean f4494Z = false;

    /* JADX INFO: renamed from: Z3 */
    public static final boolean f4498Z3;

    /* JADX INFO: renamed from: Z4 */
    public static final boolean f4499Z4 = true;

    /* JADX INFO: renamed from: Z5 */
    public static boolean f4500Z5 = false;

    /* JADX INFO: renamed from: a4 */
    public static final boolean f4504a4;

    /* JADX INFO: renamed from: a5 */
    public static final String f4505a5 = "decodetype";

    /* JADX INFO: renamed from: a6 */
    public static ArrayList<C4649k2> f4506a6 = null;

    /* JADX INFO: renamed from: b1 */
    public static final boolean f4507b1 = false;

    /* JADX INFO: renamed from: b4 */
    public static final boolean f4510b4;

    /* JADX INFO: renamed from: b5 */
    public static final String f4511b5 = "scalemod";

    /* JADX INFO: renamed from: b6 */
    public static ArrayList<C4649k2> f4512b6 = null;

    /* JADX INFO: renamed from: c1 */
    public static final boolean f4513c1 = false;

    /* JADX INFO: renamed from: c4 */
    public static final boolean f4516c4;

    /* JADX INFO: renamed from: c5 */
    public static final String f4517c5 = "sharpness";

    /* JADX INFO: renamed from: c6 */
    public static int f4518c6 = 0;

    /* JADX INFO: renamed from: d1 */
    public static final boolean f4519d1 = false;

    /* JADX INFO: renamed from: d4 */
    public static final boolean f4522d4;

    /* JADX INFO: renamed from: d5 */
    public static final String f4523d5 = "livelr";

    /* JADX INFO: renamed from: d6 */
    public static int f4524d6 = 0;

    /* JADX INFO: renamed from: e1 */
    public static final boolean f4525e1 = false;

    /* JADX INFO: renamed from: e4 */
    public static final boolean f4528e4;

    /* JADX INFO: renamed from: e5 */
    public static final String f4529e5 = "liveud";

    /* JADX INFO: renamed from: e6 */
    public static String f4530e6 = null;

    /* JADX INFO: renamed from: f1 */
    public static final boolean f4531f1 = false;

    /* JADX INFO: renamed from: f4 */
    public static final boolean f4534f4;

    /* JADX INFO: renamed from: f5 */
    public static final String f4535f5 = "play_sound";

    /* JADX INFO: renamed from: f6 */
    public static String f4536f6 = null;

    /* JADX INFO: renamed from: g1 */
    public static final boolean f4537g1 = false;

    /* JADX INFO: renamed from: g4 */
    public static final boolean f4540g4;

    /* JADX INFO: renamed from: g5 */
    public static final String f4541g5 = "langID";

    /* JADX INFO: renamed from: g6 */
    public static String f4542g6 = null;

    /* JADX INFO: renamed from: h4 */
    public static final boolean f4546h4;

    /* JADX INFO: renamed from: h5 */
    public static final String f4547h5 = "langTag";

    /* JADX INFO: renamed from: h6 */
    public static String f4548h6 = null;

    /* JADX INFO: renamed from: i1 */
    public static final boolean f4549i1 = true;

    /* JADX INFO: renamed from: i4 */
    public static final boolean f4552i4;

    /* JADX INFO: renamed from: i5 */
    public static final String f4553i5 = "auto_boot";

    /* JADX INFO: renamed from: i6 */
    public static String f4554i6 = null;

    /* JADX INFO: renamed from: j4 */
    public static final boolean f4558j4;

    /* JADX INFO: renamed from: j5 */
    public static final String f4559j5 = "auto_play_live";

    /* JADX INFO: renamed from: j6 */
    public static String f4560j6 = null;

    /* JADX INFO: renamed from: k1 */
    public static final boolean f4561k1 = true;

    /* JADX INFO: renamed from: k4 */
    public static final boolean f4564k4;

    /* JADX INFO: renamed from: k5 */
    public static final String f4565k5 = "can_autoplay_srt";

    /* JADX INFO: renamed from: k6 */
    public static String f4566k6 = null;

    /* JADX INFO: renamed from: l1 */
    public static final boolean f4567l1 = false;

    /* JADX INFO: renamed from: l4 */
    public static final boolean f4570l4;

    /* JADX INFO: renamed from: l5 */
    public static final String f4571l5 = "username";

    /* JADX INFO: renamed from: l6 */
    public static String f4572l6 = null;

    /* JADX INFO: renamed from: m1 */
    public static final boolean f4573m1 = true;

    /* JADX INFO: renamed from: m3 */
    public static final boolean f4575m3 = true;

    /* JADX INFO: renamed from: m4 */
    public static final boolean f4576m4;

    /* JADX INFO: renamed from: m5 */
    public static final String f4577m5 = "userpassword";

    /* JADX INFO: renamed from: m6 */
    public static String f4578m6 = null;

    /* JADX INFO: renamed from: n3 */
    public static final boolean f4581n3 = false;

    /* JADX INFO: renamed from: n4 */
    public static final boolean f4582n4;

    /* JADX INFO: renamed from: n5 */
    public static final String f4583n5 = "upwdn";

    /* JADX INFO: renamed from: n6 */
    public static String f4584n6 = null;

    /* JADX INFO: renamed from: o3 */
    public static final boolean f4587o3 = false;

    /* JADX INFO: renamed from: o4 */
    public static final boolean f4588o4;

    /* JADX INFO: renamed from: o5 */
    public static final String f4589o5 = "hotelPosterImg";

    /* JADX INFO: renamed from: o6 */
    public static String f4590o6 = null;

    /* JADX INFO: renamed from: p3 */
    public static final boolean f4593p3 = false;

    /* JADX INFO: renamed from: p4 */
    public static final boolean f4594p4;

    /* JADX INFO: renamed from: p5 */
    public static final String f4595p5 = "Login";

    /* JADX INFO: renamed from: p6 */
    public static boolean f4596p6 = false;

    /* JADX INFO: renamed from: q3 */
    public static final boolean f4599q3 = true;

    /* JADX INFO: renamed from: q4 */
    public static final boolean f4600q4;

    /* JADX INFO: renamed from: q5 */
    public static int f4601q5 = 0;

    /* JADX INFO: renamed from: q6 */
    public static boolean f4602q6 = false;

    /* JADX INFO: renamed from: r4 */
    public static final boolean f4606r4;

    /* JADX INFO: renamed from: r5 */
    public static String f4607r5 = null;

    /* JADX INFO: renamed from: r6 */
    public static MediaHttpSrv f4608r6 = null;

    /* JADX INFO: renamed from: s4 */
    public static final boolean f4612s4;

    /* JADX INFO: renamed from: s5 */
    public static String f4613s5 = null;

    /* JADX INFO: renamed from: s6 */
    public static String f4614s6 = null;

    /* JADX INFO: renamed from: t1 */
    public static final boolean f4615t1 = true;

    /* JADX INFO: renamed from: t4 */
    public static final String f4618t4;

    /* JADX INFO: renamed from: t5 */
    public static String f4619t5 = null;

    /* JADX INFO: renamed from: t6 */
    public static String f4620t6 = null;

    /* JADX INFO: renamed from: u1 */
    public static final boolean f4621u1 = false;

    /* JADX INFO: renamed from: u4 */
    public static final int f4624u4;

    /* JADX INFO: renamed from: u5 */
    public static String f4625u5 = null;

    /* JADX INFO: renamed from: u6 */
    public static String f4626u6 = null;

    /* JADX INFO: renamed from: v4 */
    public static final boolean f4630v4;

    /* JADX INFO: renamed from: v5 */
    public static boolean f4631v5 = false;

    /* JADX INFO: renamed from: v6 */
    public static String f4632v6 = null;

    /* JADX INFO: renamed from: w4 */
    public static final boolean f4636w4;

    /* JADX INFO: renamed from: w5 */
    public static AtomicBoolean f4637w5 = null;

    /* JADX INFO: renamed from: w6 */
    public static String f4638w6 = null;

    /* JADX INFO: renamed from: x4 */
    public static final boolean f4642x4;

    /* JADX INFO: renamed from: x5 */
    public static List<String> f4643x5 = null;

    /* JADX INFO: renamed from: x6 */
    public static C0002A1 f4644x6 = null;

    /* JADX INFO: renamed from: y4 */
    public static final int f4648y4;

    /* JADX INFO: renamed from: y5 */
    public static MainApp f4649y5 = null;

    /* JADX INFO: renamed from: y6 */
    public static List<RechargeCardInfo> f4650y6 = null;

    /* JADX INFO: renamed from: z */
    public static final String f4651z = "MainApp";

    /* JADX INFO: renamed from: z1 */
    public static final boolean f4652z1 = true;

    /* JADX INFO: renamed from: z4 */
    public static final boolean f4655z4;

    /* JADX INFO: renamed from: z5 */
    public static ExecutorService f4656z5;

    /* JADX INFO: renamed from: z6 */
    public static String f4657z6;

    /* JADX INFO: renamed from: a */
    public boolean f4658a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public String f4659b;

    /* JADX INFO: renamed from: c */
    public String f4660c;

    /* JADX INFO: renamed from: d */
    public String f4661d;

    /* JADX INFO: renamed from: e */
    public C5236qM f4662e;

    /* JADX INFO: renamed from: f */
    public C5176pP f4663f;

    /* JADX INFO: renamed from: g */
    public String f4664g;

    /* JADX INFO: renamed from: h */
    public String f4665h;

    /* JADX INFO: renamed from: i */
    public DolitBT f4666i;

    /* JADX INFO: renamed from: j */
    public boolean f4667j;

    /* JADX INFO: renamed from: k */
    public C1265Tf f4668k;

    /* JADX INFO: renamed from: l */
    public C0038AZ f4669l;

    /* JADX INFO: renamed from: m */
    public C0318Ep f4670m;

    /* JADX INFO: renamed from: n */
    public C5176pP f4671n;

    /* JADX INFO: renamed from: o */
    public long f4672o;

    /* JADX INFO: renamed from: p */
    public List<C0772Lx> f4673p;

    /* JADX INFO: renamed from: q */
    public TimeZone f4674q;

    /* JADX INFO: renamed from: r */
    public ConcurrentHashMap<String, List<LiveChannelInfo>> f4675r;

    /* JADX INFO: renamed from: s */
    public SimpleDateFormat f4676s;

    /* JADX INFO: renamed from: t */
    public SimpleDateFormat f4677t;

    /* JADX INFO: renamed from: u */
    public SimpleDateFormat f4678u;

    /* JADX INFO: renamed from: v */
    public boolean f4679v;

    /* JADX INFO: renamed from: w */
    public C4898np f4680w;

    /* JADX INFO: renamed from: x */
    public HashMap<String, List<AbstractC5157p6>> f4681x;

    /* JADX INFO: renamed from: y */
    public String f4682y;

    /* JADX INFO: renamed from: S */
    public static final boolean f4445S = C0986PH.m4384a("HOME_PAGE_USE_LEFT_LOGO", false);

    /* JADX INFO: renamed from: T */
    public static final boolean f4452T = C0986PH.m4384a("HOME_PAGE_LEFT_LOGO_SET_DEFAULT", false);

    /* JADX INFO: renamed from: U */
    public static final boolean f4459U = C0986PH.m4384a("HOME_PAGE_USE_LEFT_APP_NAME", false);

    /* JADX INFO: renamed from: X */
    public static final boolean f4480X = C0986PH.m4384a("IS_VIDEO_ITEM_JMP_TO_ALBUM", false);

    /* JADX INFO: renamed from: T0 */
    public static final boolean f4453T0 = C0986PH.m4384a("ALBUM_FOCUS_DEFAULT_RIGHT", true);

    /* JADX INFO: renamed from: V0 */
    public static boolean f4467V0 = C0986PH.m4384a("USE_VIDEO_ALBUM_WITH_INTRODUCE", true);

    /* JADX INFO: renamed from: Z0 */
    public static final boolean f4495Z0 = C0986PH.m4384a("NEED_APP_LIST", false);

    /* JADX INFO: renamed from: a1 */
    public static final boolean f4501a1 = C0986PH.m4384a("NEED_CHECK_TRIAL", false);

    /* JADX INFO: renamed from: h1 */
    public static final boolean f4543h1 = C0986PH.m4384a("USE_VIDEO_DETAIL_V2", true);

    /* JADX INFO: renamed from: j1 */
    public static int f4555j1 = C0986PH.m4385b("SEARCH_ACTIVITY_STYLE", 1);

    /* JADX INFO: renamed from: n1 */
    public static boolean f4579n1 = C0986PH.m4384a("IS_LIVE_PLAYBACK_ENABLED", false);

    /* JADX INFO: renamed from: o1 */
    public static final boolean f4585o1 = C0986PH.m4384a("NEED_AUTO_GET_TRIAL", true);

    /* JADX INFO: renamed from: p1 */
    public static boolean f4591p1 = C0986PH.m4384a("IS_LIVE_PROGRAMME_ENABLED", false);

    /* JADX INFO: renamed from: q1 */
    public static boolean f4597q1 = C0986PH.m4384a("USE_PRE_AD_LIVE", true);

    /* JADX INFO: renamed from: r1 */
    public static boolean f4603r1 = C0986PH.m4384a("USE_PRE_AD_VOD", true);

    /* JADX INFO: renamed from: s1 */
    public static final boolean f4609s1 = C0986PH.m4384a("NEED_CHECK_VIP", false);

    /* JADX INFO: renamed from: v1 */
    public static boolean f4627v1 = C0986PH.m4384a("SHOW_RESOURCE_COUNT", false);

    /* JADX INFO: renamed from: w1 */
    public static final boolean f4633w1 = C0986PH.m4384a("IS_PURE_LIVE", false);

    /* JADX INFO: renamed from: x1 */
    public static final boolean f4639x1 = C0986PH.m4384a("IS_AD_PLAYER", false);

    /* JADX INFO: renamed from: y1 */
    public static final boolean f4645y1 = C0986PH.m4384a("SHOW_VOD_SPEED", true);

    /* JADX INFO: renamed from: D1 */
    public static boolean f4347D1 = C0986PH.m4384a("NEED_SHOW_SEARCH_ON_TYPE_DETAILS", true);

    /* JADX INFO: renamed from: E1 */
    public static boolean f4354E1 = C0986PH.m4384a("IS_LIVE_SHIFTING_ENABLED", false);

    /* JADX INFO: renamed from: G1 */
    public static String f4368G1 = "";

    /* JADX INFO: renamed from: H1 */
    public static boolean f4375H1 = C0986PH.m4384a("USE_VIDEO_ALBUM_V2", false);

    /* JADX INFO: renamed from: K1 */
    public static boolean f4396K1 = C0986PH.m4384a("NEED_SHOW_FAV_ON_TYPE_DETAILS", false);

    /* JADX INFO: renamed from: L1 */
    public static boolean f4403L1 = C0986PH.m4384a("NEED_REPORT_MODULE", false);

    /* JADX INFO: renamed from: M1 */
    public static boolean f4409M1 = C0986PH.m4384a("NEED_AUTH_ACCOUNT_ACTIVE", false);

    /* JADX INFO: renamed from: N1 */
    public static boolean f4415N1 = C0986PH.m4384a("NEED_AUTH_ACCOUNT_NONE", false);

    /* JADX INFO: renamed from: O1 */
    public static boolean f4421O1 = C0986PH.m4384a("NEED_AUTH_ACCOUNT", true);

    /* JADX INFO: renamed from: P1 */
    public static boolean f4427P1 = C0986PH.m4384a("NEED_APP_STORE", true);

    /* JADX INFO: renamed from: Q1 */
    public static boolean f4433Q1 = true;

    /* JADX INFO: renamed from: R1 */
    public static boolean f4440R1 = C0986PH.m4384a("NEED_SHOW_LIKE_VD", false);

    /* JADX INFO: renamed from: S1 */
    public static boolean f4447S1 = C0986PH.m4384a("GLOBAL_CONFIG_ENABLED", false);

    /* JADX INFO: renamed from: T1 */
    public static boolean f4454T1 = C0986PH.m4384a("IS_SETTING_AUTH_NEED_HOTEL_NUM", false);

    /* JADX INFO: renamed from: U1 */
    public static boolean f4461U1 = false;

    /* JADX INFO: renamed from: V1 */
    public static boolean f4468V1 = C0986PH.m4384a("NEED_SHOW_LIVE_PLAYING_MARK", false);

    /* JADX INFO: renamed from: W1 */
    public static boolean f4475W1 = false;

    /* JADX INFO: renamed from: X1 */
    public static boolean f4482X1 = C0986PH.m4384a("NEED_SHOW_LIVE_CH_FAV", false);

    /* JADX INFO: renamed from: Y1 */
    public static boolean f4489Y1 = C0986PH.m4384a("NEED_CLEAR_POSTER_CORNER_RADIUS", false);

    /* JADX INFO: renamed from: Z1 */
    public static boolean f4496Z1 = C0986PH.m4384a("USE_CACHED_HOME_DATA_IF_EMPTY", false);

    /* JADX INFO: renamed from: a2 */
    public static boolean f4502a2 = C0986PH.m4384a("CAN_CHANGE_SRV_ADDR", false);

    /* JADX INFO: renamed from: b2 */
    public static boolean f4508b2 = C0986PH.m4384a("ABOUT_US_LOGO_USE_TEXT", true);

    /* JADX INFO: renamed from: c2 */
    public static boolean f4514c2 = C0986PH.m4384a("ABOUT_US_SUMMARY_NEUTRAL", false);

    /* JADX INFO: renamed from: d2 */
    public static boolean f4520d2 = C0986PH.m4384a("NEED_APP_POSTER_MARGIN", false);

    /* JADX INFO: renamed from: e2 */
    public static boolean f4526e2 = C0986PH.m4384a("NEED_EXTRA_SERVICE", false);

    /* JADX INFO: renamed from: f2 */
    public static boolean f4532f2 = C0986PH.m4384a("NEED_APP_SETTING_ENTRY", false);

    /* JADX INFO: renamed from: g2 */
    public static boolean f4538g2 = C0986PH.m4384a("JMP_APP_LIST_KEY_DOWN_BOTTOM_POSTER", false);

    /* JADX INFO: renamed from: h2 */
    public static boolean f4544h2 = C0986PH.m4384a("ABOUT_US_TEXT_EMPTY", false);

    /* JADX INFO: renamed from: i2 */
    public static boolean f4550i2 = C0986PH.m4384a("ABOUT_US_TEXT_SET_BY_SERVER", false);

    /* JADX INFO: renamed from: j2 */
    public static boolean f4556j2 = C0986PH.m4384a("ABOUT_US_SUMMARY_ALIGN_CENTER", false);

    /* JADX INFO: renamed from: k2 */
    public static boolean f4562k2 = C0986PH.m4384a("ABOUT_US_HIDDEN_LOGO_OR_TEXT", false);

    /* JADX INFO: renamed from: l2 */
    public static boolean f4568l2 = C0986PH.m4384a("ABOUT_US_AUTHENTICATION_STATUS", false);

    /* JADX INFO: renamed from: m2 */
    public static boolean f4574m2 = C0986PH.m4384a("IS_SHOW_RECHARGE_WORDS", true);

    /* JADX INFO: renamed from: n2 */
    public static boolean f4580n2 = C0986PH.m4384a("VIDEO_ALBUM_HIDE_DIRECTOR_AND_ACTOR", false);

    /* JADX INFO: renamed from: o2 */
    public static boolean f4586o2 = C0986PH.m4384a("NEED_PASSWORD_ENTER_SETTING", false);

    /* JADX INFO: renamed from: p2 */
    public static boolean f4592p2 = C0986PH.m4384a("SHOW_EPISODE_TITLE_FIRST", false);

    /* JADX INFO: renamed from: q2 */
    public static boolean f4598q2 = C0986PH.m4384a("NEED_PRE_LAUNCHER_WAIT_NET", false);

    /* JADX INFO: renamed from: r2 */
    public static int f4604r2 = C0986PH.m4385b("PRE_LAUNCHER_WAIT_NET_TIMEOUT", 30000);

    /* JADX INFO: renamed from: s2 */
    public static int f4610s2 = C0986PH.m4385b("VIDEO_LIST_FRAGMENT_COLUMN_COUNT", 6);

    /* JADX INFO: renamed from: t2 */
    public static boolean f4616t2 = C0986PH.m4384a("NEED_LIVE_MODULE", true);

    /* JADX INFO: renamed from: u2 */
    public static boolean f4622u2 = C0986PH.m4384a("VH_APP_MARQUEE_ENABLED", false);

    /* JADX INFO: renamed from: v2 */
    public static boolean f4628v2 = C0986PH.m4384a("P2P_LIVE_ENABLED", false);

    /* JADX INFO: renamed from: w2 */
    public static String f4634w2 = C0986PH.m4387d("P2P_LIVE_AUTH", "");

    /* JADX INFO: renamed from: x2 */
    public static boolean f4640x2 = C0986PH.m4384a("USER_PRE_LOAD_CACHE_STRATEGY", false);

    /* JADX INFO: renamed from: y2 */
    public static String f4646y2 = C0986PH.m4387d("P2P_TRACKER_IP", "");

    /* JADX INFO: renamed from: z2 */
    public static String f4653z2 = C0986PH.m4387d("P2P_TRACKER_PORT", "");

    /* JADX INFO: renamed from: A2 */
    public static final boolean f4327A2 = C0986PH.m4384a("HOME_PAGE_USE_LEFT_LOGO_COMPLEX", false);

    /* JADX INFO: renamed from: B2 */
    public static final boolean f4334B2 = C0986PH.m4384a("USE_DEFAULT_VOLUME", false);

    /* JADX INFO: renamed from: C2 */
    public static final boolean f4341C2 = C0986PH.m4384a("SHOW_DOLIT_RIGHT_INFO", true);

    /* JADX INFO: renamed from: D2 */
    public static final boolean f4348D2 = C0986PH.m4384a("HTTP_REQUEST_DIRECTLY", false);

    /* JADX INFO: renamed from: E2 */
    public static final boolean f4355E2 = C0986PH.m4384a("USER_AUTH_SET_USER_TIP", false);

    /* JADX INFO: renamed from: F2 */
    public static final boolean f4362F2 = C0986PH.m4384a("IS_SHOW_SPEED", true);

    /* JADX INFO: renamed from: G2 */
    public static final boolean f4369G2 = C0986PH.m4384a("SHOW_LEFT_TOP_IMG_IS_SHOW_SEARCH", false);

    /* JADX INFO: renamed from: H2 */
    public static final boolean f4376H2 = C0986PH.m4384a("IS_NEED_TOP_MASK", true);

    /* JADX INFO: renamed from: I2 */
    public static final boolean f4383I2 = C0986PH.m4384a("IS_CUSTOM_MAC_IDENTIFICATION", false);

    /* JADX INFO: renamed from: J2 */
    public static final boolean f4390J2 = C0986PH.m4384a("IS_CONFIG_ENABLE_CNDBYE", false);

    /* JADX INFO: renamed from: K2 */
    public static final boolean f4397K2 = C0986PH.m4384a("IS_CONFIG_GLOBAL_AD", false);

    /* JADX INFO: renamed from: L2 */
    public static final boolean f4404L2 = C0986PH.m4384a("IS_APPLY_LOCAL_SERVER_COEXIST", false);

    /* JADX INFO: renamed from: M2 */
    public static int f4410M2 = C0986PH.m4385b("DEFAULT_MOVIE_DETAIL_STYLE", 1);

    /* JADX INFO: renamed from: N2 */
    public static final String f4416N2 = C0986PH.m4387d("INIT_HOTEL_PW", "");

    /* JADX INFO: renamed from: O2 */
    public static final String f4422O2 = C0986PH.m4387d("CONFIG_CDN_BYE_KEY", "");

    /* JADX INFO: renamed from: P2 */
    public static final String f4428P2 = C0986PH.m4387d("CONFIG_CDN_BYE_REGION", "0");

    /* JADX INFO: renamed from: Q2 */
    public static final String f4434Q2 = C0986PH.m4387d("LIVE_ENC_ENC_KEY", "KLp1+nVu/fIaS2O2qZHUJQ==");

    /* JADX INFO: renamed from: R2 */
    public static final boolean f4441R2 = C0986PH.m4384a("EXIT_APP_ENABLE", true);

    /* JADX INFO: renamed from: S2 */
    public static final boolean f4448S2 = C0986PH.m4384a("NEED_SYNC_ADS_PLAYER", false);

    /* JADX INFO: renamed from: T2 */
    public static final boolean f4455T2 = C0986PH.m4384a("NEED_SYSTEM_SETTING", false);

    /* JADX INFO: renamed from: U2 */
    public static final boolean f4462U2 = C0986PH.m4384a("IS_LIVE_CHANNEL_LONG_PRESS_COLLECT", false);

    /* JADX INFO: renamed from: V2 */
    public static final String f4469V2 = C0986PH.m4387d("PG_STRING", "");

    /* JADX INFO: renamed from: W2 */
    public static final boolean f4476W2 = C0986PH.m4384a("SHOW_VIDEO_FILTER_AREA", true);

    /* JADX INFO: renamed from: X2 */
    public static final boolean f4483X2 = C0986PH.m4384a("SHOW_VIDEO_FILTER_ITEM", true);

    /* JADX INFO: renamed from: Y2 */
    public static final boolean f4490Y2 = C0986PH.m4384a("SHOW_VIDEO_FILTER_YEAR", true);

    /* JADX INFO: renamed from: Z2 */
    public static final boolean f4497Z2 = C0986PH.m4384a("SHOW_VIDEO_FILTER_SORT_ORDER", true);

    /* JADX INFO: renamed from: a3 */
    public static final boolean f4503a3 = C0986PH.m4384a("SHOW_VIDEO_FILTER_SORT", true);

    /* JADX INFO: renamed from: b3 */
    public static final boolean f4509b3 = C0986PH.m4384a("SHOW_VIDEO_FILTER_MAIN_CATEGORY", true);

    /* JADX INFO: renamed from: c3 */
    public static final boolean f4515c3 = C0986PH.m4384a("SHOW_VIDEO_FILTER_SUB_CATEGORY", true);

    /* JADX INFO: renamed from: d3 */
    public static final boolean f4521d3 = C0986PH.m4384a("IS_ALLOW_MULTIPLE_ACCOUNT_LOGIN", true);

    /* JADX INFO: renamed from: e3 */
    public static final boolean f4527e3 = C0986PH.m4384a("SHOW_USER_EXPIRE_TIME", false);

    /* JADX INFO: renamed from: f3 */
    public static final boolean f4533f3 = C0986PH.m4384a("IS_HOME_AD_MARQUEE", false);

    /* JADX INFO: renamed from: g3 */
    public static final boolean f4539g3 = C0986PH.m4384a("SHOW_CUSTOMER_VOD_USER_AGENT", false);

    /* JADX INFO: renamed from: h3 */
    public static final boolean f4545h3 = C0986PH.m4384a("IS_CUSTOM_EPG_REVIEW", false);

    /* JADX INFO: renamed from: i3 */
    public static final boolean f4551i3 = C0986PH.m4384a("IS_CUSTOM_SHUTDOWN_TIME", false);

    /* JADX INFO: renamed from: j3 */
    public static final boolean f4557j3 = C0986PH.m4384a("IS_CHANGE_ACCOUNT_POP", false);

    /* JADX INFO: renamed from: k3 */
    public static final int f4563k3 = C0986PH.m4385b("OKHTTP_READ_TIMEOUT", 6);

    /* JADX INFO: renamed from: l3 */
    public static final boolean f4569l3 = C0986PH.m4384a("IS_BELONG_BAXI_CHARACTERISTIC", false);

    /* JADX INFO: renamed from: r3 */
    public static final boolean f4605r3 = C0986PH.m4384a("NEED_BT_MODULE", false);

    /* JADX INFO: renamed from: s3 */
    public static final boolean f4611s3 = C0986PH.m4384a("P2P_VOD_FILE_ENCRYPTED", true);

    /* JADX INFO: renamed from: t3 */
    public static String f4617t3 = C0986PH.m4387d("BT_AUTH", "");

    /* JADX INFO: renamed from: u3 */
    public static String f4623u3 = C0986PH.m4387d("BT_PRIV_PROTO", "ott_trunk-p2p");

    /* JADX INFO: renamed from: v3 */
    public static String f4629v3 = C0986PH.m4387d("BT_PRODUCT_NUM", "{XPMA3C15-WBXL-SVQL-RH2H-KHX6BLGHHE84}");

    /* JADX INFO: renamed from: w3 */
    public static String f4635w3 = C0986PH.m4387d("BT_PD", "");

    /* JADX INFO: renamed from: x3 */
    public static final boolean f4641x3 = C0986PH.m4384a("SHOW_EPISODE_MARK_ON_POSTER", false);

    /* JADX INFO: renamed from: y3 */
    public static final boolean f4647y3 = C0986PH.m4384a("IS_LIVE_FAV_ENABLED", true);

    /* JADX INFO: renamed from: z3 */
    public static final boolean f4654z3 = C0986PH.m4384a("IS_CUSTOM_LIVE_BACK", true);

    /* JADX INFO: renamed from: A3 */
    public static boolean f4328A3 = false;

    /* JADX INFO: renamed from: B3 */
    public static final boolean f4335B3 = C0986PH.m4384a("ACCESS_USB_NEED_PWD", false);

    /* JADX INFO: renamed from: C3 */
    public static final String f4342C3 = C0986PH.m4387d("ACCESS_STR_FOR_USB_DEV", "11836823");

    /* JADX INFO: renamed from: D3 */
    public static final boolean f4349D3 = C0986PH.m4384a("VERIFY_USB_ACCESS_ONLINE", true);

    /* JADX INFO: renamed from: android.media.ViviTV.MainApp$a */
    public class AsyncTaskC1730a extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MainApp f4683a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1730a(MainApp mainApp) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m9406a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9407b(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.MainApp$b */
    public class AsyncTaskC1731b extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f4684a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MainApp f4685b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1731b(MainApp mainApp, Activity activity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m9408a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9409b(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.MainApp$c */
    public class AsyncTaskC1732c extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MainApp f4686a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1732c(MainApp mainApp) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m9410a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.MainApp$d */
    public class AsyncTaskC1733d extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f4687a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1733d(Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m9411a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9412b(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onCancelled() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.MainApp$e */
    public class C1734e extends RequestHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MainApp f4688a;

        /* JADX WARN: Invalid debug info offset */
        public C1734e(MainApp mainApp) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.squareup.picasso.RequestHandler
        /* JADX INFO: renamed from: c */
        public boolean mo9413c(Request request) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.squareup.picasso.RequestHandler
        /* JADX INFO: renamed from: f */
        public RequestHandler.Result mo9414f(Request request, int i) throws IOException {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.MainApp$f */
    public class C1735f implements C0116Bn.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MainApp f4689a;

        /* JADX WARN: Invalid debug info offset */
        public C1735f(MainApp mainApp) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C0116Bn.c
        /* JADX INFO: renamed from: a */
        public void mo715a(C4198d4 c4198d4) {
        }

        @Override // p000.C0116Bn.c
        /* JADX INFO: renamed from: b */
        public void mo716b(int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.MainApp$g */
    public class AsyncTaskC1736g extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MainApp f4690a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1736g(MainApp mainApp) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m9415a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9416b(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.MainApp$h */
    public class AsyncTaskC1737h extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MainApp f4691a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1737h(MainApp mainApp) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.lang.Boolean m9417a(java.lang.Void... r4) {
            /*
                r3 = this;
                r0 = 0
                return r0
            L1b:
            L1d:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.AsyncTaskC1737h.m9417a(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9418b(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.MainApp$i */
    public class AsyncTaskC1738i extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MainApp f4692a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1738i(MainApp mainApp) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m9419a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.MainApp$j */
    public class AsyncTaskC1739j extends AsyncTask<Collection<File>, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MainApp f4693a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1739j(MainApp mainApp) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0034
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.lang.Boolean m9420a(java.util.Collection<java.io.File>... r6) {
            /*
                r5 = this;
                r0 = 0
                return r0
            L38:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.AsyncTaskC1739j.m9420a(java.util.Collection[]):java.lang.Boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Collection<File>[] collectionArr) {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.MainApp$k */
    public class C1740k implements SoundPool.OnLoadCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MainApp f4694a;

        /* JADX WARN: Invalid debug info offset */
        public C1740k(MainApp mainApp) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.SoundPool.OnLoadCompleteListener
        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.MainApp$l */
    public class RunnableC1741l implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f4695a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1741l(Activity activity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.MainApp$m */
    public class C1742m extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f4696a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MainApp f4697b;

        /* JADX WARN: Invalid debug info offset */
        public C1742m(MainApp mainApp, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    static {
        boolean zM4384a = C0986PH.m4384a("IS_OTT_DLDRM_COMBINE_VER", false);
        f4356E3 = zM4384a;
        f4363F3 = C0986PH.m4384a("IS_ONLY_HIDE_HOME_CATEGORY", zM4384a);
        f4370G3 = C0986PH.m4384a("VOD_FASTER_SEEK", false);
        f4377H3 = C0986PH.m4384a("SHOW_VOD_VOLUME_CONTROL", false);
        f4384I3 = C0986PH.m4384a("IS_NEED_START_MATCH_SUBSCRIBE_CHECK", false);
        f4391J3 = C0986PH.m4387d("EPG_TIME_ZONE", "");
        f4398K3 = C0986PH.m4384a("IS_SHOW_VOD_PLAYBACK_NUM", false);
        f4405L3 = C0986PH.m4384a("CUSTOMIZE_TS_BLOCK_SIZE", false);
        f4411M3 = C0986PH.m4384a("LIVE_HLS_USE_MULTIPLE_WORKER", false);
        f4417N3 = C0986PH.m4384a("SHOW_PLAYER_DEBUG_SPEED", false);
        f4423O3 = C0986PH.m4384a("REVIEW_INCLUDE_NEXT_DAY", false);
        f4429P3 = C0986PH.m4384a("USE_EPG_GLOBAL_CACHE", false);
        f4435Q3 = C0986PH.m4384a("EPG_ALL_DAYS_IN_ONE_LIST", false);
        f4442R3 = C0986PH.m4384a("NAME_VIDEO_LIST_SINGLE_LINE", false);
        f4449S3 = C0986PH.m4384a("ANIM_VIDEO_LIST_DISABLED", false);
        f4456T3 = C0986PH.m4384a("VIDEO_LIST_SHOW_BORDER", false);
        f4463U3 = C0986PH.m4384a("VIDEO_LIST_DISABLE_BG_CHANGE", false);
        f4470V3 = C0986PH.m4384a("VIDEO_LIST_ITEM_FULL_DISPLAY", false);
        f4477W3 = C0986PH.m4384a("FOCUSED_CHANNEL_EPG_CENTER_SCREEN", false);
        f4484X3 = C0986PH.m4384a("PROMPT_WHEN_PLAY_VOD_NEXT", false);
        f4491Y3 = C0986PH.m4384a("PROMPT_CONTINUE_PLAY_FOR_VOD", false);
        f4498Z3 = C0986PH.m4384a("ABOUT_US_SHOW_DOWNLOAD_QR_CODE", false);
        f4504a4 = C0986PH.m4384a("DISABLE_EXIT_TWICE_CONFIRM", false);
        f4510b4 = C0986PH.m4384a("VOD_SEEK_USE_YOUTUBE_STYLE_UI", false);
        f4516c4 = C0986PH.m4384a("VOD_PAUSE_SHOW_YOUTUBE_STYLE_UI", false);
        f4522d4 = C0986PH.m4384a("VOD_WIN_DISMISS_AUTO_PLAY", true);
        f4528e4 = C0986PH.m4384a("DISABLE_LIVE_LR_ADJUST_VOL", false);
        f4534f4 = C0986PH.m4384a("ENABLE_CHECK_LOGIN_STATUS", false);
        f4540g4 = C0986PH.m4384a("MEDIA_ENC_QUICK_CLEAN_UP", false);
        f4546h4 = C0986PH.m4384a("MEDIA_ENC_SMALL_CACHE_SIZE", false);
        f4552i4 = C0986PH.m4384a("HOME_TIME_ENABLE_OFFSET_OF_EPG", false);
        f4558j4 = C0986PH.m4384a("ENABLE_OKHTTP_RETRY", true);
        f4564k4 = C0986PH.m4384a("LIVE_VOD_PWD_DIALOG_CAN_MODIFY", false);
        f4570l4 = C0986PH.m4384a("CHECK_E_ENABLED", false);
        f4576m4 = C0986PH.m4384a("HOME_REACH_END_ANIMATION_ENABLED", true);
        f4582n4 = C0986PH.m4384a("CUSTOM_EPG_REVIEW_MODE_VIEW_WIDTH_AUTO", true);
        f4588o4 = C0986PH.m4384a("CUSTOM_EPG_WEB_GARBLED_CODE", false);
        f4594p4 = C0986PH.m4384a("REVIEW_SEEK_WITH_PROGRESS_BAR", false);
        f4600q4 = C0986PH.m4384a("NO_SWITCH_SOURCE_IF_ONLY_SINGLE", false);
        f4606r4 = C0986PH.m4384a("VOD_UPDATE_PROGRESS_IGNORE_PLAYING", false);
        f4612s4 = C0986PH.m4384a("VIDEO_LIST_PAGE_NUM_ENABLED", false);
        f4618t4 = C0986PH.m4387d("LIVE_LANG_ID_SUPPORT", "");
        f4624u4 = C0986PH.m4385b("PRE_LAUNCH_DURATION_FOR_LIVE", 3000);
        f4630v4 = C0986PH.m4384a("FORCE_EPG_BTN_HIDE", false);
        f4636w4 = C0986PH.m4384a("MQTT_ENABLED", false);
        f4642x4 = C0986PH.m4384a("NEED_LIVE_CATEGORY_ALL", false);
        f4648y4 = C0986PH.m4385b("REVIEW_DAY_COUNT", 7);
        f4655z4 = C0986PH.m4384a("UPLOAD_LOGCAT_LOG_WHEN_START", false);
        f4329A4 = C0986PH.m4384a("VOD_HLS_OPTIMIZE_ENABLED", true);
        f4336B4 = C0986PH.m4384a("NEED_ERROR_VERIFY_NETWORK", true);
        f4343C4 = C0986PH.m4384a("USE_SMALL_HOME_BG", true);
        f4350D4 = C0986PH.m4384a("FORCE_UPLOAD_LOG", false);
        f4357E4 = C0986PH.m4384a("FORBIDDEN_EXIT_APP", false);
        boolean zM4384a2 = C0986PH.m4384a("SOUND_ENABLED_DEFAULT", true);
        f4364F4 = zM4384a2;
        f4371G4 = C0986PH.m4384a("USE_X5_INSTEAD_WEBVIEW", false);
        f4378H4 = C0986PH.m4384a("HIDE_HOME_LIVE_FRAG_FULLSCREEN", true);
        f4385I4 = C0986PH.m4384a("SETTING_LOGIN_VERTICAL", false);
        f4392J4 = C0986PH.m4384a("SETTING_NO_ABOUT_US", false);
        f4399K4 = C0986PH.m4385b("NEXT_EPG_ITEM_COUNT", 2);
        f4406L4 = C0986PH.m4384a("CLEAR_LOGIN_INFO_AFTER_FORCE_LOGOUT", true);
        f4412M4 = C0986PH.m4384a("ENABLED_HOME_PAGE_BG_SWITCH", true);
        f4418N4 = C0986PH.m4384a("VIDEO_SHOW_CIRCLE_PROGRESS", false);
        f4424O4 = C0986PH.m4384a("TYPE_DETAIL_SHOW_CATEGORY_NAME", true);
        f4430P4 = C0986PH.m4384a("NEED_REPORT_BUTTONS", false);
        f4436Q4 = C0986PH.m4384a("USE_NEW_HOME_PAGE_MODE", true);
        f4443R4 = C0986PH.m4384a("USE_HOME_DATA_RELOAD", true);
        f4450S4 = C0986PH.m4384a("SHOW_KEYBOARD_HINT", false);
        f4457T4 = C0986PH.m4384a("ITV_TOAST_HIDE_ICON", true);
        f4464U4 = C0986PH.m4387d("VERSION_TAG", "");
        f4478W4 = false;
        f4485X4 = false;
        f4492Y4 = false;
        f4601q5 = 1;
        f4607r5 = C5664wa.f19314i;
        f4613s5 = C5664wa.f19314i;
        f4625u5 = "";
        f4631v5 = false;
        f4637w5 = new AtomicBoolean(false);
        ArrayList arrayList = new ArrayList();
        f4643x5 = arrayList;
        arrayList.add("com.android.settings");
        f4643x5.add("com.android.tv.settings");
        f4643x5.add("com.btf.settings");
        f4643x5.add("com.toumei.toumeisettings");
        f4656z5 = null;
        f4330A5 = C5383sZ.m28221k();
        f4351D5 = 0;
        f4358E5 = true;
        f4379H5 = zM4384a2;
        C0259Du.a aVar = C0259Du.a.FOLLOW_SYS;
        f4393J5 = aVar;
        f4400K5 = C0986PH.m4385b("APP_DEFAULT_LANGUAGE_TAG", aVar.getTagId());
        f4407L5 = 0;
        f4425O5 = true;
        f4431P5 = true;
        f4437Q5 = false;
        f4444R5 = false;
        f4465U5 = false;
        f4486X5 = false;
        f4493Y5 = false;
        f4500Z5 = false;
        f4518c6 = -1;
        f4524d6 = -1;
        f4530e6 = "";
        f4536f6 = "0";
        f4542g6 = "-";
        f4548h6 = "-";
        f4554i6 = "-";
        f4560j6 = "";
        f4566k6 = "ViviTV/range";
        f4572l6 = "ViviTV/user/|support|android-tvbox";
        f4578m6 = "";
        f4584n6 = C0786MA.m3668a(new StringBuilder("Media1-0/ViviTV ("), Build.MODEL, C1313UP.f3459l);
        f4590o6 = "Mozilla/5.0 (Linux; U; Android 0.5; en-us) AppleWebKit/522+ (KHTML, like Gecko) Safari/419.3";
        f4596p6 = false;
        f4602q6 = false;
        f4608r6 = null;
        f4614s6 = "";
        f4620t6 = "video__";
        f4626u6 = "";
        f4632v6 = "";
        f4638w6 = "";
        f4657z6 = "F1D36226BC575EC8FBEB0FFB346CEECC901A5578DB163AD17877C2867EE728FE78F08366BFDB019B9695D47268094D30CCD24759846713AD54C427773E965B9220F1D7E81B65765AA42F993C334BCD70A3ECA230AAE0C7FC692927C6B03C061931DD6EBF3E80D60F6DDB178BEC144285E1E2BA47074A680B3240666B9868268ABF635AE67148B037DCBA60A79DCD03D58F4B84119F13C3DF5F757010DEF1FFB6983EF8836A2695619E2DA15930C053D40B27CC1DE3B665BAE28559128723A9E6FB08FEC01E539D73D57B34C8C3DC01E40523827F7E50783F46B7B4466249A8B9057FC818EF34E365D8763680AE68308FD15593827091E81A8CD53CF54D0F07CA8F925526C86823DCFEBE0CFD772AEDBFF26A4439EC4573DE295EC58F39B54DBD0BA1D567B8D9019ADF9ED770380F4835968A1755D43B45AE5190732469965BC67EB581EF1E34715EA561CF3D641F9B73ADBDFE35AEB0C5A16F2B2B95BB68501637DB73B56586D30F6A8D528AB64213D7B5EDBF410F126956691A3768996E2DDFE9645AF8711BB538D6BE63EA96CA57D08B1C84449E18CE895E24231388F3A3B39B3AF0D377779060C97CAF58759757D75176CF14E5E065BDE0D75641DF25FCB5AE0FFA901C1B9E72D57C6490C59406B80022D12D25557F6B17B1BF453B4BF3BF077A9C14BB33A930DE703684F2697588825797827593E71F88D53FF94A0A5896D99B0A77C8387F90FCEB5BFF2129BFF2F5661360EF427587790B95856BBB4DEB09A1D661BD8F069D91C0852F3409183888D81650D13410A5519475703F9B0BC77EE88DBD4D357008A529C93F661CCC22F7A7FF60AEB6C0FA6C2824C3E33B051F608177E430D5810B6E8818DAE44716DEB8E8A01706196C5A6741666D9A6D70D7EF675AA2774AB9378DB237F7CA9956D7DB1B840C9114988806242040DFA1FFB49C6CA284217492339B2EFC0B38C00FD70A7BCC4EACE739EBE0D70213DF26FDE6FA5EA3C24E1BC924892F649594D950ED5225DE26741D2E6842E4B4466048A8ED042B9B13B632AB628B776681F8356C8D8A50C3837195AC";
        f4338B6 = C0986PH.m4387d("MNC_KEY", "F1D36226BC575EC8FBEB0FFB346CEECC901A5578DB163AD17877C2867EE728FE78F08366BFDB019B9695D47268094D30CCD24759846713AD54C427773E965B9220F1D7E81B65765AA42F993C334BCD70A3ECA230AAE0C7FC692927C6B03C061931DD6EBF3E80D60F6DDB178BEC144285E1E2BA47074A680B3240666B9868268ABF635AE67148B037DCBA60A79DCD03D58F4B84119F13C3DF5F757010DEF1FFB6983EF8836A2695619E2DA15930C053D40B27CC1DE3B665BAE28559128723A9E6FB08FEC01E539D73D57B34C8C3DC01E40523827F7E50783F46B7B4466249A8B9057FC818EF34E365D8763680AE68308FD15593827091E81A8CD53CF54D0F07CA8F925526C86823DCFEBE0CFD772AEDBFF26A4439EC4573DE295EC58F39B54DBD0BA1D567B8D9019ADF9ED770380F4835968A1755D43B45AE5190732469965BC67EB581EF1E34715EA561CF3D641F9B73ADBDFE35AEB0C5A16F2B2B95BB68501637DB73B56586D30F6A8D528AB64213D7B5EDBF410F126956691A3768996E2DDFE9645AF8711BB538D6BE63EA96CA57D08B1C84449E18CE895E24231388F3A3B39B3AF0D377779060C97CAF58759757D75176CF14E5E065BDE0D75641DF25FCB5AE0FFA901C1B9E72D57C6490C59406B80022D12D25557F6B17B1BF453B4BF3BF077A9C14BB33A930DE703684F2697588825797827593E71F88D53FF94A0A5896D99B0A77C8387F90FCEB5BFF2129BFF2F5661360EF427587790B95856BBB4DEB09A1D661BD8F069D91C0852F3409183888D81650D13410A5519475703F9B0BC77EE88DBD4D357008A529C93F661CCC22F7A7FF60AEB6C0FA6C2824C3E33B051F608177E430D5810B6E8818DAE44716DEB8E8A01706196C5A6741666D9A6D70D7EF675AA2774AB9378DB237F7CA9956D7DB1B840C9114988806242040DFA1FFB49C6CA284217492339B2EFC0B38C00FD70A7BCC4EACE739EBE0D70213DF26FDE6FA5EA3C24E1BC924892F649594D950ED5225DE26741D2E6842E4B4466048A8ED042B9B13B632AB628B776681F8356C8D8A50C3837195AC");
        f4345C6 = -4;
        f4352D6 = true;
        f4359E6 = "android.media.ViviTV.ACTION.HotRecommendUpdate";
        f4366F6 = "android.media.ViviTV.ACTION.MainCategoryUpdate";
        f4394J6 = 4;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A3 */
    public static void m9163A3(ArrayList<C4649k2> arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B2 */
    public static void m9164B2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B3 */
    public static void m9165B3(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public static boolean m9166C() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C0 */
    public static int m9167C0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public static boolean m9168D() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D2 */
    public static void m9169D2(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static String m9170E0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public static final void m9171F() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public static String m9172F0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F2 */
    public static void m9173F2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public static MainApp m9174G0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G2 */
    public static void m9175G2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public static final int m9176H0(String str, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H2 */
    public static void m9177H2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H3 */
    public static final void m9178H3(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public static int m9179I0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I2 */
    public static void m9180I2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I3 */
    public static final void m9181I3(String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public static void m9182J(Activity activity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public static int m9183J0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J1 */
    public static boolean m9184J1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J2 */
    public static void m9185J2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static void m9186K() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static int m9187K0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: K1 */
    public static boolean m9188K1() {
        /*
            r0 = 0
            return r0
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9188K1():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K2 */
    public static void m9189K2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: L */
    public static void m9190L() {
        /*
            return
        Lb:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9190L():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static int m9191L0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L1 */
    public static boolean m9192L1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L2 */
    public static void m9193L2(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public static void m9194M() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public static int m9195M0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M2 */
    public static void m9196M2(List<String> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public static void m9197N() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public static List<String> m9198N0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N2 */
    public static void m9199N2(ArrayList<C4649k2> arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public static String m9200O0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O2 */
    public static void m9201O2(String str) {
    }

    /* JADX INFO: renamed from: P0 */
    public static C4649k2 m9202P0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P1 */
    public static boolean m9203P1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P2 */
    public static void m9204P2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static String m9205Q0(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q1 */
    public static boolean m9206Q1(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q2 */
    public static void m9207Q2(String str) {
    }

    /* JADX INFO: renamed from: R0 */
    public static final String m9208R0(String str, String str2) {
        return str;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R2 */
    public static void m9209R2(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static Locale m9210S0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S2 */
    public static void m9211S2(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static String m9212T0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ void m9213T1(Thread thread, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T2 */
    public static void m9214T2(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static String m9215U0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: U1 */
    public static synchronized void m9216U1(java.lang.String r5) {
        /*
            return
        L38:
        L3a:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9216U1(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U2 */
    public static void m9217U2(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V2 */
    public static void m9218V2(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static String m9219W0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W1 */
    public static void m9220W1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W2 */
    public static void m9221W2(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public static MainApp m9222X() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X2 */
    public static void m9223X2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public static C0002A1 m9224Y() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static String m9225Y0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y1 */
    public static final boolean m9226Y1(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y2 */
    public static void m9227Y2(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public static String m9228Z() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static String m9229Z0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z2 */
    public static void m9230Z2(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9231a(Thread thread, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public static String m9232a0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a3 */
    public static void m9233a3(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static String m9234b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public static long m9235b0() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static int[] m9236b1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b3 */
    public static void m9237b3(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static String m9238c(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public static Context m9239c0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public static int m9240c1() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c3 */
    public static void m9241c3(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static String m9242d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public static EnumC4779m4 m9243d0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public static int m9244d1() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d2 */
    public static void m9245d2(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d3 */
    public static void m9246d3(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static String m9247e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public static int m9248e0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e3 */
    public static void m9249e3(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static String m9250f(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public static int m9251f0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public static String m9252f1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f3 */
    public static void m9253f3(boolean z) {
    }

    /* JADX INFO: renamed from: g */
    public static String m9254g(String str, int i) {
        return str;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public static final boolean m9255g0(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public static boolean m9256g1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g3 */
    public static void m9257g3(boolean z) {
    }

    /* JADX INFO: renamed from: h */
    public static String m9258h(String str, int i) {
        return str;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h0 */
    public static final boolean m9259h0(String str, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public static final String m9260h1(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h2 */
    public static void m9261h2(String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h3 */
    public static void m9262h3(String str) {
    }

    /* JADX INFO: renamed from: i */
    public static String m9263i(String str, String str2) {
        return str;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public static String m9264i1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i2 */
    public static void m9265i2(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i3 */
    public static void m9266i3(String str) {
    }

    /* JADX INFO: renamed from: j */
    public static String m9267j(String str, String str2) {
        return str;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public static boolean m9268j0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j2 */
    public static void m9269j2(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j3 */
    public static void m9270j3(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static String m9271k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public static boolean m9272k0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public static int m9273k1() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k2 */
    public static void m9274k2(EnumC5557v1 enumC5557v1) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k3 */
    public static void m9275k3(int[] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static String m9276l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public static List<RechargeCardInfo> m9277l0() {
        return null;
    }

    /* JADX INFO: renamed from: l1 */
    public static C4649k2 m9278l1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l2 */
    public static void m9279l2(C0002A1 c0002a1) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l3 */
    public static void m9280l3(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static void m9281m(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public static int m9282m0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public static boolean m9283m1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m2 */
    public static void m9284m2(EnumC4713l2 enumC4713l2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m3 */
    public static void m9285m3(EnumC6006m10 enumC6006m10) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n2 */
    public static void m9286n2(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n3 */
    public static void m9287n3(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static void m9288o() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    public static final C0259Du.a m9289o0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o2 */
    public static void m9290o2(EnumC5761y2 enumC5761y2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o3 */
    public static void m9291o3(String str) {
    }

    /* JADX INFO: renamed from: p */
    public static boolean m9292p() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public static String m9293p1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p2 */
    public static void m9294p2(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p3 */
    public static void m9295p3(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Context m9296q() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q2 */
    public static void m9297q2(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q3 */
    public static void m9298q3(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m9299r(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public static int m9300r0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r2 */
    public static void m9301r2(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r3 */
    public static void m9302r3(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m9303s(MainApp mainApp) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s2 */
    public static void m9304s2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s3 */
    public static void m9305s3(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m9306t(MainApp mainApp) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: t2 */
    public static void m9307t2(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t3 */
    public static void m9308t3(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ long m9309u(MainApp mainApp, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u2 */
    public static void m9310u2(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u3 */
    public static void m9311u3(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ AtomicBoolean m9312v() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v2 */
    public static void m9313v2(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w2 */
    public static void m9314w2(List<RechargeCardInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x2 */
    public static void m9315x2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x3 */
    public static void m9316x3(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y2 */
    public static void m9317y2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y3 */
    public static void m9318y3(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z0 */
    public static int m9319z0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z2 */
    public static void m9320z2(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z3 */
    public static void m9321z3(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m9322A(String str, List<AbstractC5157p6> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A0 */
    public List<AbstractC5157p6> m9323A0(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A1 */
    public final void m9324A1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A2 */
    public void m9325A2(C4898np c4898np) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: B */
    public final void m9326B() {
        /*
            r10 = this;
            return
        L4a:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9326B():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B0 */
    public C4898np m9327B0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B1 */
    public final void m9328B1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public final void m9329C1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C2 */
    public void m9330C2(C0318Ep c0318Ep) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: C3 */
    public final void m9331C3() {
        /*
            r2 = this;
            return
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9331C3():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public C0318Ep m9332D0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D1 */
    public final void m9333D1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D3 */
    public final void m9334D3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public final void m9335E() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E1 */
    public final void m9336E1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E2 */
    public void m9337E2(C0318Ep c0318Ep) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E3 */
    public void m9338E3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F1 */
    public final void m9339F1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F3 */
    public void m9340F3() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public void m9341G(Activity activity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G1 */
    public final void m9342G1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G3 */
    public void m9343G3(List<String> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: H */
    public final void m9344H() {
        /*
            r2 = this;
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9344H():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H1 */
    public final void m9345H1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public final void m9346I() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x00ae
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: I1 */
    public final void m9347I1() {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9347I1():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: M1 */
    public final boolean m9348M1() {
        /*
            r5 = this;
            r0 = 0
            return r0
        L2f:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9348M1():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: N1 */
    public final boolean m9349N1() {
        /*
            r5 = this;
            r0 = 0
            return r0
        L2f:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9349N1():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public String m9350O(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: O1 */
    public final boolean m9351O1() {
        /*
            r8 = this;
            r0 = 0
            return r0
        L36:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9351O1():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public final void m9352P() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public final void m9353Q() {
    }

    /* JADX INFO: renamed from: R */
    public final void m9354R() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R1 */
    public boolean m9355R1(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public String m9356S(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S1 */
    public boolean m9357S1() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public String m9358T(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public String m9359U() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public final String m9360V() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public SimpleDateFormat m9361V0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V1 */
    public final void m9362V1(TrackerZone trackerZone) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public final String m9363W() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public String m9364X0() {
        return null;
    }

    /* JADX INFO: renamed from: X1 */
    public final void m9365X1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z1 */
    public final void m9366Z1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public C5236qM m9367a1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a2 */
    public void m9368a2() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b2 */
    public void m9369b2(String str, List<LiveChannelInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c2 */
    public final String m9370c2() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public String m9371e1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e2 */
    public void m9372e2(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f2 */
    public final synchronized void m9373f2() {
        /*
            r3 = this;
            return
        L31:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9373f2():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g2 */
    public void m9374g2() {
        /*
            r7 = this;
            return
        L4f:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9374g2():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: i0 */
    public final String m9375i0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public C0038AZ m9376j1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public void m9377n() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n0 */
    public Map<String, List<LiveChannelInfo>> m9378n0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public SimpleDateFormat m9379n1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    public SimpleDateFormat m9380o1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.orm.SugarApp, android.app.Application
    public void onCreate() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.orm.SugarApp, android.app.Application
    public void onTerminate() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p0 */
    public Date m9381p0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q0 */
    public Date m9382q0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public final void m9383q1() {
    }

    /* JADX INFO: renamed from: r1 */
    public final void m9384r1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s0 */
    public String m9385s0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s1 */
    public final void m9386s1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t0 */
    public String m9387t0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t1 */
    public void m9388t1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u0 */
    public String m9389u0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u1 */
    public final void m9390u1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v0 */
    public final String m9391v0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v1 */
    public void m9392v1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v3 */
    public void m9393v3(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final void m9394w() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w0 */
    public C1265Tf m9395w0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: w1 */
    public final void m9396w1() {
        /*
            r2 = this;
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9396w1():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w3 */
    public void m9397w3(C0038AZ c0038az) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public final void m9398x() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x0 */
    public TimeZone m9399x0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x1 */
    public final void m9400x1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public final void m9401y(C0124Bv c0124Bv) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: y0 */
    public java.lang.String m9402y0() {
        /*
            r8 = this;
            r0 = 0
            return r0
        L2c:
        L60:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9402y0():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y1 */
    public final void m9403y1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0026
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: z */
    public int m9404z(boolean r8) {
        /*
            r7 = this;
            r0 = 0
            return r0
        L6c:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.MainApp.m9404z(boolean):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z1 */
    public void m9405z1() {
    }
}
