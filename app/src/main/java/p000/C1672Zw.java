package p000;

import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: Zw */
/* JADX INFO: loaded from: classes.dex */
public class C1672Zw {

    /* JADX INFO: renamed from: a */
    public static int f4156a = 1901;

    /* JADX INFO: renamed from: b */
    public static int[] f4157b = {1887, 5780, 5802, 19157, 2742, 50359, 1198, 2646, 46378, 7466, 3412, 30122, 5482, 67949, 2396, 5294, 43597, 6732, 6954, 36181, 2772, 4954, 18781, 2396, 54427, 5274, 6730, 47781, 5800, 6868, 21210, 4790, 59703, 2350, 5270, 46667, 3402, 3496, 38325, 1388, 4782, 18735, 2350, 52374, 6804, 7498, 44457, 2906, 1388, 29294, 4700, 63789, 6442, 6804, 56138, 5802, 2772, 38235, 1210, 4698, 22827, 5418, 63125, 3476, 5802, 43701, 2484, 5302, 27223, 2646, 70954, 7466, 3412, 54698, 5482, 2412, 38062, 5294, 2636, 32038, 6954, 60245, 2772, 4826, 43357, 2394, 5274, 39501, 6730, 72357, 5800, 5844, 53978, 4790, 2358, 38039, 5270, 87627, 3402, 3496, 54708, 5484, 4782, 43311, 2350, 3222, 27978, 7498, 68965, 2904, 5484, 45677, 4700, 6444, 39573, 6804, 6986, 19285, 2772, 62811, 1210, 4698, 47403, 5418, 5780, 38570, 5546, 76469, 2420, 5302, 51799, 2646, 5414, 36501, 3412, 5546, 18869, 2412, 54446, 5276, 6732, 48422, 6822, 2900, 28010, 4826, 92509, 2394, 5274, 55883, 6730, 6820, 47956, 5812, 2778, 18779, 2358, 62615, 5270, 5450, 46757, 3492, 5556, 27318, 4718, 67887, 2350, 3222, 52554, 7498, 3428, 38252, 5468, 4700, 31022, 6444, 64149, 6804, 6986, 43861, 2772, 5338, 35421, 2650, 70955, 5418, 5780, 54954, 5546, 2740, 38074, 5302, 2646, 29991, 3366, 61011, 3412, 5546, 43445, 2412, 5294, 35406, 6732, 72998, 6820, 6996, 52586, 2778, 2396, 38045, 5274, 6698, 23333, 6820, 64338, 5812, 2746, 43355, 2358, 5270, 39499, 5450, 79525, 3492, 5548};

    /* JADX INFO: renamed from: c */
    public static int[] f4158c = {1887, 966732, 967231, 967733, 968265, 968766, 969297, 969798, 970298, 970829, 971330, 971830, 972362, 972863, 973395, 973896, 974397, 974928, 975428, 975929, 976461, 976962, 977462, 977994, 978494, 979026, 979526, 980026, 980558, 981059, 981559, 982091, 982593, 983124, 983624, 984124, 984656, 985157, 985656, 986189, 986690, 987191, 987722, 988222, 988753, 989254, 989754, 990286, 990788, 991288, 991819, 992319, 992851, 993352, 993851, 994383, 994885, 995385, 995917, 996418, 996918, 997450, 997949, 998481, 998982, 999483, 1000014, 1000515, 1001016, 1001548, 1002047, 1002578, 1003080, 1003580, 1004111, 1004613, 1005113, 1005645, 1006146, 1006645, 1007177, 1007678, 1008209, 1008710, 1009211, 1009743, 1010243, 1010743, 1011275, 1011775, 1012306, 1012807, 1013308, 1013840, 1014341, 1014841, 1015373, 1015874, 1016404, 1016905, 1017405, 1017937, 1018438, 1018939, 1019471, 1019972, 1020471, 1021002, 1021503, 1022035, 1022535, 1023036, 1023568, 1024069, 1024568, 1025100, 1025601, 1026102, 1026633, 1027133, 1027666, 1028167, 1028666, 1029198, 1029699, 1030199, 1030730, 1031231, 1031763, 1032264, 1032764, 1033296, 1033797, 1034297, 1034828, 1035329, 1035830, 1036362, 1036861, 1037393, 1037894, 1038394, 1038925, 1039427, 1039927, 1040459, 1040959, 1041491, 1041992, 1042492, 1043023, 1043524, 1044024, 1044556, 1045057, 1045558, 1046090, 1046590, 1047121, 1047622, 1048122, 1048654, 1049154, 1049655, 1050187, 1050689, 1051219, 1051720, 1052220, 1052751, 1053252, 1053752, 1054284, 1054786, 1055285, 1055817, 1056317, 1056849, 1057349, 1057850, 1058382, 1058883, 1059383, 1059915, 1060415, 1060947, 1061447, 1061947, 1062479, 1062981, 1063480, 1064012, 1064514, 1065014, 1065545, 1066045, 1066577, 1067078, 1067578, 1068110, 1068611, 1069112, 1069642, 1070142, 1070674, 1071175, 1071675, 1072207, 1072709, 1073209, 1073740, 1074241, 1074741, 1075273, 1075773, 1076305, 1076807, 1077308, 1077839, 1078340, 1078840, 1079372, 1079871, 1080403, 1080904};

    /* JADX INFO: renamed from: d */
    public static char[][] f4159d = {new char[]{'\r', '1', 'U', 'u', 149, 185, 201, 250, 250}, new char[]{'\r', '-', 'Q', 'u', 149, 185, 201, 250, 250}, new char[]{'\r', '0', 'T', 'p', 148, 184, 200, 201, 250}, new char[]{'\r', '-', 'L', 'l', 140, 172, 200, 201, 250}, new char[]{'\r', ',', 'H', 'h', 132, 168, 200, 201, 250}, new char[]{5, '!', 'D', '`', '|', 152, 188, 200, 201}, new char[]{29, '9', 'U', 'x', 148, C1002PX.f2525p, 200, 201, 250}, new char[]{'\r', '0', 'L', 'h', 132, 168, 196, 200, 201}, new char[]{25, C1002PX.f2514e, 'X', 'x', 148, 184, 200, 201, 250}, new char[]{16, ',', 'L', 'l', 144, 172, 200, 201, 250}, new char[]{28, C1002PX.f2514e, '\\', '|', C1002PX.f2516g, 192, 200, 201, 250}, new char[]{17, '5', 'U', '|', 156, 188, 200, 201, 250}};

    /* JADX INFO: renamed from: e */
    public static char[][] f4160e = {new char[]{7, 6, 6, 6, 6, 6, 6, 6, 6, 5, 6, 6, 6, 5, 5, 6, 6, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5}, new char[]{5, 4, 5, 5, 5, 4, 4, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 3, 4, 4, 4, 3, 3, 4, 4, 3, 3, 3}, new char[]{6, 6, 6, 7, 6, 6, 6, 6, 5, 6, 6, 6, 5, 5, 6, 6, 5, 5, 5, 6, 5, 5, 5, 5, 4, 5, 5, 5, 5}, new char[]{5, 5, 6, 6, 5, 5, 5, 6, 5, 5, 5, 5, 4, 5, 5, 5, 4, 4, 5, 5, 4, 4, 4, 5, 4, 4, 4, 4, 5}, new char[]{6, 6, 6, 7, 6, 6, 6, 6, 5, 6, 6, 6, 5, 5, 6, 6, 5, 5, 5, 6, 5, 5, 5, 5, 4, 5, 5, 5, 5}, new char[]{6, 6, 7, 7, 6, 6, 6, 7, 6, 6, 6, 6, 5, 6, 6, 6, 5, 5, 6, 6, 5, 5, 5, 6, 5, 5, 5, 5, 4, 5, 5, 5, 5}, new char[]{7, '\b', '\b', '\b', 7, 7, '\b', '\b', 7, 7, 7, '\b', 7, 7, 7, 7, 6, 7, 7, 7, 6, 6, 7, 7, 6, 6, 6, 7, 7}, new char[]{'\b', '\b', '\b', '\t', '\b', '\b', '\b', '\b', 7, '\b', '\b', '\b', 7, 7, '\b', '\b', 7, 7, 7, '\b', 7, 7, 7, 7, 6, 7, 7, 7, 6, 6, 7, 7, 7}, new char[]{'\b', '\b', '\b', '\t', '\b', '\b', '\b', '\b', 7, '\b', '\b', '\b', 7, 7, '\b', '\b', 7, 7, 7, '\b', 7, 7, 7, 7, 6, 7, 7, 7, 7}, new char[]{'\t', '\t', '\t', '\t', '\b', '\t', '\t', '\t', '\b', '\b', '\t', '\t', '\b', '\b', '\b', '\t', '\b', '\b', '\b', '\b', 7, '\b', '\b', '\b', 7, 7, '\b', '\b', '\b'}, new char[]{'\b', '\b', '\b', '\b', 7, '\b', '\b', '\b', 7, 7, '\b', '\b', 7, 7, 7, '\b', 7, 7, 7, 7, 6, 7, 7, 7, 6, 6, 7, 7, 7}, new char[]{7, '\b', '\b', '\b', 7, 7, '\b', '\b', 7, 7, 7, '\b', 7, 7, 7, 7, 6, 7, 7, 7, 6, 6, 7, 7, 6, 6, 6, 7, 7}};

    /* JADX INFO: renamed from: f */
    public static char[][] f4161f = {new char[]{'\r', '-', 'Q', 'q', 149, 185, 201}, new char[]{21, '9', ']', MessageFormatter.f17214b, 161, 193, 201}, new char[]{21, '8', 'X', 'x', 152, 188, 200, 201}, new char[]{21, '1', 'Q', 't', 144, C1002PX.f2525p, 200, 201}, new char[]{17, '1', 'M', 'p', 140, 168, 200, 201}, new char[]{28, C1002PX.f2514e, 'X', 't', 148, 180, 200, 201}, new char[]{25, '5', 'T', 'p', 144, 172, 200, 201}, new char[]{29, '9', 'Y', 'x', 148, 180, 200, 201}, new char[]{17, '-', 'I', 'l', 140, 168, 200, 201}, new char[]{28, C1002PX.f2514e, '\\', '|', C1002PX.f2516g, 192, 200, 201}, new char[]{16, ',', 'P', 'p', 148, 180, 200, 201}, new char[]{17, '5', 'X', 'x', 156, 188, 200, 201}};

    /* JADX INFO: renamed from: g */
    public static char[][] f4162g = {new char[]{21, 21, 21, 21, 21, 20, 21, 21, 21, 20, 20, 21, 21, 20, 20, 20, 20, 20, 20, 20, 20, 19, 20, 20, 20, 19, 19, 20}, new char[]{20, 19, 19, 20, 20, 19, 19, 19, 19, 19, 19, 19, 19, 18, 19, 19, 19, 18, 18, 19, 19, 18, 18, 18, 18, 18, 18, 18}, new char[]{21, 21, 21, 22, 21, 21, 21, 21, 20, 21, 21, 21, 20, 20, 21, 21, 20, 20, 20, 21, 20, 20, 20, 20, 19, 20, 20, 20, 20}, new char[]{20, 21, 21, 21, 20, 20, 21, 21, 20, 20, 20, 21, 20, 20, 20, 20, 19, 20, 20, 20, 19, 19, 20, 20, 19, 19, 19, 20, 20}, new char[]{21, 22, 22, 22, 21, 21, 22, 22, 21, 21, 21, 22, 21, 21, 21, 21, 20, 21, 21, 21, 20, 20, 21, 21, 20, 20, 20, 21, 21}, new char[]{22, 22, 22, 22, 21, 22, 22, 22, 21, 21, 22, 22, 21, 21, 21, 22, 21, 21, 21, 21, 20, 21, 21, 21, 20, 20, 21, 21, 21}, new char[]{23, 23, 24, 24, 23, 23, 23, 24, 23, 23, 23, 23, 22, 23, 23, 23, 22, 22, 23, 23, 22, 22, 22, 23, 22, 22, 22, 22, 23}, new char[]{23, 24, 24, 24, 23, 23, 24, 24, 23, 23, 23, 24, 23, 23, 23, 23, 22, 23, 23, 23, 22, 22, 23, 23, 22, 22, 22, 23, 23}, new char[]{23, 24, 24, 24, 23, 23, 24, 24, 23, 23, 23, 24, 23, 23, 23, 23, 22, 23, 23, 23, 22, 22, 23, 23, 22, 22, 22, 23, 23}, new char[]{24, 24, 24, 24, 23, 24, 24, 24, 23, 23, 24, 24, 23, 23, 23, 24, 23, 23, 23, 23, 22, 23, 23, 23, 22, 22, 23, 23, 23}, new char[]{23, 23, 23, 23, 22, 23, 23, 23, 22, 22, 23, 23, 22, 22, 22, 23, 22, 22, 22, 22, 21, 22, 22, 22, 21, 21, 22, 22, 22}, new char[]{22, 22, 23, 23, 22, 22, 22, 23, 22, 22, 22, 22, 21, 22, 22, 22, 21, 21, 22, 22, 21, 21, 21, 22, 21, 21, 21, 21, 22}};

    /* JADX INFO: renamed from: h */
    public static final String[] f4163h = {"0101*元旦", "0214 情人节", "0308 妇女节", "0312 植树节", "0315 消费者权益日", "0401 愚人节", "0501*劳动节", "0504 青年节", "0509 郝维节", "0512 护士节", "0601 儿童节", "0701 建党节", "0801 建军节", "0808 父亲节", "0816 燕衔泥节", "0910 教师节", "0928 孔子诞辰", "1001*国庆节", "1006 老人节", "1024 联合国日", "1111 光棍节", "1225 圣诞节"};

    /* JADX INFO: renamed from: i */
    public static final String[] f4164i = {"0101*春节、弥勒佛诞", "0106 定光佛诞", "0115 元宵节", "0208 释迦牟尼佛出家", "0215 释迦牟尼佛涅槃", "0209 海空上师诞", "0219 观世音菩萨诞", "0221 普贤菩萨诞", "0316 准提菩萨诞", "0404 文殊菩萨诞", "0408 释迦牟尼佛诞", "0415 佛吉祥日", "0505*端午节", "0513 伽蓝菩萨诞", "0603 护法韦驮尊天菩萨诞", "0619 观世音菩萨成道——此日放生、念佛，功德殊胜", "0707 七夕情人节", "0713 大势至菩萨诞", "0715 中元节", "0724 龙树菩萨诞", "0730 地藏菩萨诞", "0815*中秋节", "0822 燃灯佛诞", "0909 重阳节", "0919 观世音菩萨出家纪念日", "0930 药师琉璃光如来诞", "1005 达摩祖师诞", "1107 阿弥陀佛诞", "1208 释迦如来成道日，腊八节", "1224 小年", "1229 华严菩萨诞", "0100*除夕"};

    /* JADX INFO: renamed from: j */
    public static String[] f4165j = {"大寒", "雨水", "春分", "谷雨", "小满", "夏至", "大暑", "处暑", "秋分", "霜降", "小雪", "冬至"};

    /* JADX INFO: renamed from: k */
    public static String[] f4166k = {"小寒", "立春", "惊蛰", "清明", "立夏", "芒种", "小暑", "立秋", "白露", "寒露", "立冬", "大雪"};

    /* JADX INFO: renamed from: l */
    public static final int[] f4167l = {0, 21208, 42467, 63836, 85337, 107014, 128867, 150921, 173149, 195551, 218072, 240693, 263343, 285989, 308563, 331033, 353350, 375494, 397447, 419210, 440795, 462224, 483532, 504758};

    /* JADX INFO: renamed from: m */
    public static final Pattern f4168m = Pattern.compile("^(\\d{2})(\\d{2})([\\s\\*])(.+)$");

    /* JADX INFO: renamed from: n */
    public static GregorianCalendar f4169n = null;

    /* JADX INFO: renamed from: Zw$a */
    public static class a {

        /* JADX INFO: renamed from: g */
        public static final String[] f4170g = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"};

        /* JADX INFO: renamed from: a */
        public boolean f4171a;

        /* JADX INFO: renamed from: b */
        public int f4172b;

        /* JADX INFO: renamed from: c */
        public int f4173c;

        /* JADX INFO: renamed from: d */
        public int f4174d;

        /* JADX INFO: renamed from: e */
        public boolean f4175e;

        /* JADX INFO: renamed from: f */
        public String f4176f;

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static String m8828a(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }
    }

    /* JADX INFO: renamed from: Zw$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f4177a;

        /* JADX INFO: renamed from: b */
        public int f4178b;

        /* JADX INFO: renamed from: c */
        public int f4179c;

        /* JADX INFO: renamed from: d */
        public boolean f4180d;

        /* JADX INFO: renamed from: e */
        public String f4181e;

        /* JADX INFO: renamed from: f */
        public String f4182f;

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static int m8812a(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static b m8813b(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static long m8814c(int i, int i2, int i3) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    public static synchronized long m8815d(int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r0 = 0
            return r0
        L22:
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1672Zw.m8815d(int, int, int, int, int, int):long");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public static synchronized void m8816e(p000.C1672Zw.b r9, p000.C1672Zw.a r10) {
        /*
            return
        L3c:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1672Zw.m8816e(Zw$b, Zw$a):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static int m8817f(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static String m8818g(int i, int i2, int i3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static String m8819h(b bVar) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i */
    public static synchronized int m8820i(java.util.Date r5) {
        /*
            r0 = 0
            return r0
        L21:
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1672Zw.m8820i(java.util.Date):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static b m8821j(a aVar) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static String m8822k(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: l */
    public static synchronized void m8823l() {
        /*
            return
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1672Zw.m8823l():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static int m8824m(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static int m8825n(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static a m8826o(b bVar) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static int m8827p(String str) {
        return 0;
    }
}
