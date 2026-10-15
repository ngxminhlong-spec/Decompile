package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.is, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0751is {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9071a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f9072b;
    public static final String c;
    public static final String d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f9073e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f9074f;

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f9075g;

    /* renamed from: h, reason: collision with root package name */
    public static HashMap f9076h;

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f9077i;

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f9078j;

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f9079k;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f9080l;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f9071a = i4;
        String str = Build.DEVICE;
        f9072b = str;
        String str2 = Build.MANUFACTURER;
        c = str2;
        String str3 = Build.MODEL;
        d = str3;
        f9073e = str + ", " + str3 + ", " + str2 + ", " + i4;
        f9074f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f9075g = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f9077i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f9078j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f9079k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f9080l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String i4 = Zf.i(str);
        int i5 = 0;
        String str2 = i4.split("-", 2)[0];
        if (f9076h == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f9077i;
            int length2 = strArr.length;
            HashMap hashMap = new HashMap(length + 88);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i6 = 0; i6 < 88; i6 += 2) {
                hashMap.put(strArr[i6], strArr[i6 + 1]);
            }
            f9076h = hashMap;
        }
        String str4 = (String) f9076h.get(str2);
        if (str4 != null) {
            i4 = str4.concat(String.valueOf(i4.substring(str2.length())));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return i4;
        }
        while (true) {
            String[] strArr2 = f9078j;
            int length3 = strArr2.length;
            if (i5 >= 18) {
                return i4;
            }
            if (i4.startsWith(strArr2[i5])) {
                return String.valueOf(strArr2[i5 + 1]).concat(String.valueOf(i4.substring(strArr2[i5].length())));
            }
            i5 += 2;
        }
    }

    public static void b(long[] jArr, long j4) {
        long j5;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i4 = 0;
        if (j4 >= 1000000 && j4 % 1000000 == 0) {
            long e4 = Bs.e(j4, 1000000L, RoundingMode.UNNECESSARY);
            while (i4 < jArr.length) {
                jArr[i4] = Bs.e(jArr[i4], e4, roundingMode);
                i4++;
            }
            return;
        }
        if (j4 < 1000000 && 1000000 % j4 == 0) {
            long e5 = Bs.e(1000000L, j4, RoundingMode.UNNECESSARY);
            while (i4 < jArr.length) {
                jArr[i4] = Bs.N(jArr[i4], e5);
                i4++;
            }
            return;
        }
        int i5 = 0;
        while (i5 < jArr.length) {
            long j6 = jArr[i5];
            if (j6 != 0) {
                if (j4 >= j6 && j4 % j6 == 0) {
                    jArr[i5] = Bs.e(1000000L, Bs.e(j4, j6, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j4 >= j6 || j6 % j4 != 0) {
                    j5 = j4;
                    jArr[i5] = h(j6, 1000000L, j5, roundingMode);
                    i5++;
                    j4 = j5;
                } else {
                    jArr[i5] = Bs.N(1000000L, Bs.e(j6, j4, RoundingMode.UNNECESSARY));
                }
            }
            j5 = j4;
            i5++;
            j4 = j5;
        }
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean d(int i4) {
        return i4 == 3 || i4 == 2 || i4 == 268435456 || i4 == 536870912 || i4 == 1342177280 || i4 == 805306368 || i4 == 1610612736 || i4 == 4;
    }

    public static boolean e(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static void f(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static Object[] g(int i4, Object[] objArr) {
        Zf.O(i4 <= objArr.length);
        return Arrays.copyOf(objArr, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (java.lang.Math.abs(r11 - r2) == 0.5d) goto L58;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x007f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long h(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0751is.h(long, long, long, java.math.RoundingMode):long");
    }

    public static String i(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e4) {
            Wj.i("Util", "Failed to read system property ".concat(str), e4);
            return null;
        }
    }

    public static int j(int[] iArr, int i4, boolean z4, boolean z5) {
        int i5;
        int i6;
        int binarySearch = Arrays.binarySearch(iArr, i4);
        if (binarySearch < 0) {
            i6 = -(binarySearch + 2);
        } else {
            while (true) {
                i5 = binarySearch - 1;
                if (i5 < 0 || iArr[i5] != i4) {
                    break;
                }
                binarySearch = i5;
            }
            i6 = z4 ? binarySearch : i5;
        }
        return z5 ? Math.max(0, i6) : i6;
    }

    public static int k(long[] jArr, long j4, boolean z4) {
        int i4;
        int binarySearch = Arrays.binarySearch(jArr, j4);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                int i5 = binarySearch - 1;
                if (i5 < 0 || jArr[i5] != j4) {
                    break;
                }
                binarySearch = i5;
            }
            i4 = binarySearch;
        }
        return z4 ? Math.max(0, i4) : i4;
    }

    public static int l(int i4, int i5, int i6, byte[] bArr) {
        while (i4 < i5) {
            i6 = f9079k[(i6 >>> 24) ^ (bArr[i4] & 255)] ^ (i6 << 8);
            i4++;
        }
        return i6;
    }

    public static int m(int i4) {
        if (i4 == 20) {
            return 30;
        }
        if (i4 == 30) {
            return 34;
        }
        if (i4 == 805306368) {
            return 31;
        }
        switch (i4) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i4) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int n(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0751is.n(int):int");
    }

    public static int o(int i4) {
        if (i4 == 2 || i4 == 4) {
            return 6005;
        }
        if (i4 == 10) {
            return 6004;
        }
        if (i4 == 7) {
            return 6005;
        }
        if (i4 == 8) {
            return 6003;
        }
        switch (i4) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i4) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int p(String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z4 = length >= 3 && "neg".equals(split[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int parseInt = Integer.parseInt(str2);
            return z4 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int q(int i4) {
        if (i4 == 8) {
            return 3;
        }
        if (i4 == 16) {
            return 2;
        }
        if (i4 != 24) {
            return i4 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int r(int i4, int i5) {
        if (i4 != 2) {
            if (i4 == 3) {
                return i5;
            }
            if (i4 != 4) {
                if (i4 != 268435456) {
                    if (i4 != 536870912) {
                        if (i4 != 805306368) {
                            if (i4 != 1342177280) {
                                if (i4 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                    return i5 * 3;
                }
            }
            return i5 * 4;
        }
        return i5 + i5;
    }

    public static long s(long j4, float f4) {
        return f4 == 1.0f ? j4 : Math.round(j4 * f4);
    }

    public static long t(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 * 1000;
    }

    public static long u(int i4, long j4) {
        return v(j4, 1000000L, i4, RoundingMode.FLOOR);
    }

    public static long v(long j4, long j5, long j6, RoundingMode roundingMode) {
        if (j4 == 0 || j5 == 0) {
            return 0L;
        }
        return (j6 < j5 || j6 % j5 != 0) ? (j6 >= j5 || j5 % j6 != 0) ? (j6 < j4 || j6 % j4 != 0) ? (j6 >= j4 || j4 % j6 != 0) ? h(j4, j5, j6, roundingMode) : Bs.N(j5, Bs.e(j4, j6, RoundingMode.UNNECESSARY)) : Bs.e(j5, Bs.e(j6, j4, RoundingMode.UNNECESSARY), roundingMode) : Bs.N(j4, Bs.e(j5, j6, RoundingMode.UNNECESSARY)) : Bs.e(j4, Bs.e(j6, j5, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long w(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 / 1000;
    }

    public static AudioFormat x(int i4, int i5, int i6) {
        return new AudioFormat.Builder().setSampleRate(i4).setChannelMask(i5).setEncoding(i6).build();
    }

    public static Handler y() {
        Looper myLooper = Looper.myLooper();
        Zf.C(myLooper);
        return new Handler(myLooper, null);
    }
}
