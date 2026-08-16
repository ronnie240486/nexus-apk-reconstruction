package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: j00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5984j00 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: A */
    public static final String f14603A = "lastsource";

    /* JADX INFO: renamed from: B */
    public static final String f14604B = "sourcetext";

    /* JADX INFO: renamed from: C */
    public static final String f14605C = "updatetime";

    /* JADX INFO: renamed from: D */
    public static final String f14606D = "info_id";

    /* JADX INFO: renamed from: E */
    public static final String f14607E = "channel_id";

    /* JADX INFO: renamed from: F */
    public static final String f14608F = "play_date";

    /* JADX INFO: renamed from: G */
    public static final String f14609G = "play_time";

    /* JADX INFO: renamed from: H */
    public static final String f14610H = "program_name";

    /* JADX INFO: renamed from: I */
    public static final String f14611I = "favorite_tid";

    /* JADX INFO: renamed from: J */
    public static final String f14612J = "custom_tid";

    /* JADX INFO: renamed from: K */
    public static final String f14613K = "我的收藏";

    /* JADX INFO: renamed from: L */
    public static final String f14614L = "自定义";

    /* JADX INFO: renamed from: M */
    public static final String f14615M = "all_channel_tid";

    /* JADX INFO: renamed from: N */
    public static final String f14616N = "CREATE TABLE IF NOT EXISTS channel_info(  vid integer NOT NULL,  num integer ,vname text NOT\u3000NULL ,tid text , sourcetext text , epgid text , huibo text , quality text , pinyin text , viptype integer, sortnum integer )";

    /* JADX INFO: renamed from: O */
    public static final String f14617O = "CREATE TABLE IF NOT EXISTS channel_info_net(  vid integer NOT NULL,  num integer ,vname text NOT\u3000NULL ,tid text , sourcetext text , epgid text , huibo text , quality text , pinyin text ) ";

    /* JADX INFO: renamed from: P */
    public static final String f14618P = "DROP TABLE IF EXISTS channel_info";

    /* JADX INFO: renamed from: Q */
    public static final String f14619Q = "DROP TABLE IF EXISTS channel_info_net";

    /* JADX INFO: renamed from: R */
    public static final String f14620R = "CREATE TABLE IF NOT EXISTS live_recode( vid integer NOT NULL, duration integer default 0 ,lastsource  integer default 0 ,favorit integer DEFAULT 0 ) ";

    /* JADX INFO: renamed from: R0 */
    public static final String f14621R0 = "DROP TABLE IF EXISTS type_info_net";

    /* JADX INFO: renamed from: S */
    public static final String f14622S = "DROP TABLE IF EXISTS live_recode";

    /* JADX INFO: renamed from: S0 */
    public static final String f14623S0 = "vod_info";

    /* JADX INFO: renamed from: T */
    public static final String f14624T = "CREATE VIEW IF NOT EXISTS channel_info_view AS select * from channel_info LEFT JOIN  live_recode ON channel_info.vid=live_recode.vid";

    /* JADX INFO: renamed from: T0 */
    public static final String f14625T0 = "id";

    /* JADX INFO: renamed from: U */
    public static final String f14626U = "CREATE VIEW IF NOT EXISTS channel_info_net_view AS select * from channel_info_net LEFT JOIN  live_recode ON channel_info_net.vid=live_recode.vid";

    /* JADX INFO: renamed from: U0 */
    public static final String f14627U0 = "title";

    /* JADX INFO: renamed from: V */
    public static final String f14628V = "DROP VIEW IF EXISTS channel_info_view";

    /* JADX INFO: renamed from: V0 */
    public static final String f14629V0 = "banben";

    /* JADX INFO: renamed from: W */
    public static final String f14630W = "DROP VIEW IF EXISTS channel_info_net_view";

    /* JADX INFO: renamed from: W0 */
    public static final String f14631W0 = "image";

    /* JADX INFO: renamed from: X */
    public static final String f14632X = "CREATE TABLE IF NOT EXISTS type_info ( tid text NOT NULL , passowrd text , tname text,sortnum integer );";

    /* JADX INFO: renamed from: X0 */
    public static final String f14633X0 = "updatetime";

    /* JADX INFO: renamed from: Y */
    public static final String f14634Y = "CREATE TABLE IF NOT EXISTS type_info_net ( tid text NOT NULL , passowrd text , tname text );";

    /* JADX INFO: renamed from: Y0 */
    public static final String f14635Y0 = "setIndex";

    /* JADX INFO: renamed from: Z */
    public static final String f14636Z = "DROP TABLE IF EXISTS type_info";

    /* JADX INFO: renamed from: Z0 */
    public static final String f14637Z0 = "sourceIndex";

    /* JADX INFO: renamed from: a */
    public static final String f14638a = "dViviTV.db3";

    /* JADX INFO: renamed from: a1 */
    public static final String f14639a1 = "position";

    /* JADX INFO: renamed from: b */
    public static final int f14640b = 17;

    /* JADX INFO: renamed from: b1 */
    public static final String f14641b1 = "crashTime";

    /* JADX INFO: renamed from: c */
    public static C5984j00 f14642c = null;

    /* JADX INFO: renamed from: c1 */
    public static final String f14643c1 = "type";

    /* JADX INFO: renamed from: d */
    public static final String f14644d = "channel_info";

    /* JADX INFO: renamed from: d1 */
    public static final String f14645d1 = "qxd";

    /* JADX INFO: renamed from: e */
    public static final String f14646e = "channel_info_net";

    /* JADX INFO: renamed from: e1 */
    public static final String f14647e1 = "source_sets";

    /* JADX INFO: renamed from: f */
    public static final String f14648f = "type_info";

    /* JADX INFO: renamed from: f1 */
    public static final String f14649f1 = "source";

    /* JADX INFO: renamed from: g */
    public static final String f14650g = "type_info_net";

    /* JADX INFO: renamed from: g1 */
    public static final String f14651g1 = "languageId";

    /* JADX INFO: renamed from: h */
    public static final String f14652h = "live_recode";

    /* JADX INFO: renamed from: h1 */
    public static final String f14653h1 = "create table if not exists vod_info ( id Integer not null ,title text  not null ,banben text not null ,image text not null ,type Integer not null ,updatetime long not null , sourceIndex Integer  ,setIndex Integer ,position Integer ,qxd text,source_sets Integer ,crashTime long not null,source text ,languageId Integer) ";

    /* JADX INFO: renamed from: i */
    public static final String f14654i = "channel_info_view";

    /* JADX INFO: renamed from: i1 */
    public static final String f14655i1 = "DROP TABLE IF EXISTS vod_info";

    /* JADX INFO: renamed from: j */
    public static final String f14656j = "channel_info_net_view";

    /* JADX INFO: renamed from: k */
    public static final String f14657k = "Epg";

    /* JADX INFO: renamed from: l */
    public static final String f14658l = "vid";

    /* JADX INFO: renamed from: m */
    public static final String f14659m = "vname";

    /* JADX INFO: renamed from: n */
    public static final String f14660n = "num";

    /* JADX INFO: renamed from: o */
    public static final String f14661o = "epgid";

    /* JADX INFO: renamed from: p */
    public static final String f14662p = "area";

    /* JADX INFO: renamed from: q */
    public static final String f14663q = "quality";

    /* JADX INFO: renamed from: r */
    public static final String f14664r = "huibo";

    /* JADX INFO: renamed from: s */
    public static final String f14665s = "pinyin";

    /* JADX INFO: renamed from: t */
    public static final String f14666t = "viptype";

    /* JADX INFO: renamed from: u */
    public static final String f14667u = "sortnum";

    /* JADX INFO: renamed from: v */
    public static final String f14668v = "tid";

    /* JADX INFO: renamed from: w */
    public static final String f14669w = "tname";

    /* JADX INFO: renamed from: x */
    public static final String f14670x = "passowrd";

    /* JADX INFO: renamed from: y */
    public static final String f14671y = "favorit";

    /* JADX INFO: renamed from: z */
    public static final String f14672z = "duration";

    /* JADX WARN: Invalid debug info offset */
    public C5984j00(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public static synchronized p000.C5984j00 m21478k(android.content.Context r2) {
        /*
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5984j00.m21478k(android.content.Context):j00");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public final void m21479j(android.database.sqlite.SQLiteDatabase r10) {
        /*
            r9 = this;
            return
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5984j00.m21479j(android.database.sqlite.SQLiteDatabase):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: p */
    public final boolean m21480p(android.database.sqlite.SQLiteDatabase r12, java.lang.String r13, java.lang.String r14) throws java.lang.Exception {
        /*
            r11 = this;
            r0 = 0
            return r0
        L45:
        L47:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5984j00.m21480p(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }
}
