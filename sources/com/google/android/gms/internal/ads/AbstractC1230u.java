package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.C1510e1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TimeZone;
import o2.C1893d;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1230u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10763a = 15;

    public static void A(long j4, C1134rq c1134rq, V[] vArr) {
        long j5;
        int m4 = c1134rq.m();
        if ((m4 & 64) != 0) {
            int i4 = m4 & 31;
            c1134rq.f(1);
            int i5 = c1134rq.f10537b;
            int length = vArr.length;
            int i6 = 0;
            while (i6 < length) {
                int i7 = i4 * 3;
                V v4 = vArr[i6];
                c1134rq.e(i5);
                v4.f(i7, c1134rq);
                if (j4 != -9223372036854775807L) {
                    j5 = j4;
                    v4.d(j5, 1, i7, 0, null);
                } else {
                    j5 = j4;
                }
                i6++;
                j4 = j5;
            }
        }
    }

    public static void B(J8 j8, String str, JSONObject jSONObject) {
        StringBuilder n4 = U.a.n("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        Y9.m("Dispatching AFMA event: ".concat(n4.toString()));
        j8.o(n4.toString());
    }

    public static void C(String str, boolean z4) {
        if (!z4) {
            throw C0907md.a(str, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        if (true != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        if (true != r4) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] D(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1230u.D(java.lang.String, boolean):java.lang.String[]");
    }

    public static int E(int i4) {
        if (i4 == 1) {
            return 32;
        }
        if (i4 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(U.a.i("Unknown content digest algorthm: ", i4));
    }

    public static int F(int i4) {
        if (i4 == 513) {
            return 1;
        }
        if (i4 == 514) {
            return 2;
        }
        if (i4 == 769) {
            return 1;
        }
        switch (i4) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i4))));
        }
    }

    public static int G(byte[] bArr, int i4, int i5) {
        int N = N(i4, bArr);
        if (i5 == 0 || i5 == 3) {
            return N;
        }
        while (true) {
            int length = bArr.length;
            if (N >= length - 1) {
                return length;
            }
            int i6 = N + 1;
            if ((N - i4) % 2 == 0 && bArr[i6] == 0) {
                return N;
            }
            N = N(i6, bArr);
        }
    }

    public static M3 H(C1134rq c1134rq, boolean z4, boolean z5) {
        if (z4) {
            T(3, c1134rq, false);
        }
        c1134rq.z((int) c1134rq.s(), AbstractC1480zs.c);
        long s4 = c1134rq.s();
        String[] strArr = new String[(int) s4];
        for (int i4 = 0; i4 < s4; i4++) {
            strArr[i4] = c1134rq.z((int) c1134rq.s(), AbstractC1480zs.c);
        }
        if (z5 && (c1134rq.m() & 1) == 0) {
            throw C0907md.a("framing bit expected to be set", null);
        }
        return new M3(2, strArr);
    }

    public static String I(Context context, String str, boolean z4) {
        String f4;
        C0937n6 c0937n6 = AbstractC1066q6.f10220f0;
        O1.r rVar = O1.r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue() || z4) {
            N1.n nVar = N1.n.f1204A;
            C0356Wb c0356Wb = nVar.f1225w;
            Q1.N n4 = nVar.c;
            C0356Wb c0356Wb2 = nVar.f1225w;
            if (c0356Wb.j(context) && !TextUtils.isEmpty(str) && (f4 = c0356Wb2.f(context)) != null) {
                String str2 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10188Y);
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.f10184X)).booleanValue() && str.contains(str2)) {
                    n4.getClass();
                    if (Q1.N.s(str, n4.f1669a, (String) rVar.c.a(AbstractC1066q6.f10174V))) {
                        c0356Wb2.b(context, "_ac", f4, null);
                        return R(context, str).replace(str2, f4);
                    }
                    n4.getClass();
                    if (Q1.N.s(str, n4.f1670b, (String) rVar.c.a(AbstractC1066q6.f10179W))) {
                        c0356Wb2.b(context, "_ai", f4, null);
                        return R(context, str).replace(str2, f4);
                    }
                } else if (!str.contains("fbs_aeid")) {
                    n4.getClass();
                    if (Q1.N.s(str, n4.f1669a, (String) rVar.c.a(AbstractC1066q6.f10174V))) {
                        c0356Wb2.b(context, "_ac", f4, null);
                        return g(R(context, str), "fbs_aeid", f4).toString();
                    }
                    n4.getClass();
                    if (Q1.N.s(str, n4.f1670b, (String) rVar.c.a(AbstractC1066q6.f10179W))) {
                        c0356Wb2.b(context, "_ai", f4, null);
                        return g(R(context, str), "fbs_aeid", f4).toString();
                    }
                }
            }
        }
        return str;
    }

    public static C1893d J(Context context) {
        try {
            return C1893d.c(context, C1893d.f14315b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e4) {
            throw new Exception(e4);
        }
    }

    public static void K(ArrayList arrayList, J2 j22) {
        String str = (String) j22.r();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static boolean L(C c) {
        C1134rq c1134rq = new C1134rq(8);
        int i4 = C0847l2.a(c, c1134rq).f9358a;
        if (i4 != 1380533830 && i4 != 1380333108) {
            return false;
        }
        ((C1316w) c).E(c1134rq.f10536a, 0, 4, false);
        c1134rq.e(0);
        int h4 = c1134rq.h();
        if (h4 == 1463899717) {
            return true;
        }
        Wj.h("WavHeaderReader", "Unsupported form type: " + h4);
        return false;
    }

    public static boolean M(C1134rq c1134rq, H h4, int i4, F f4) {
        long u2 = c1134rq.u();
        long j4 = u2 >>> 16;
        if (j4 != i4) {
            return false;
        }
        boolean z4 = (j4 & 1) == 1;
        long j5 = u2 >> 12;
        long j6 = u2 >> 8;
        long j7 = u2 >> 4;
        long j8 = u2 >> 1;
        long j9 = u2 & 1;
        int i5 = (int) (j7 & 15);
        if (i5 <= 7) {
            if (i5 != h4.f5358g - 1) {
                return false;
            }
        } else if (i5 > 10 || h4.f5358g != 2) {
            return false;
        }
        int i6 = (int) (j8 & 7);
        if (!(i6 == 0 || i6 == h4.f5360i) || j9 == 1) {
            return false;
        }
        try {
            long w2 = c1134rq.w();
            if (!z4) {
                w2 *= h4.f5355b;
            }
            f4.f4964a = w2;
            int c = c((int) (j5 & 15), c1134rq);
            if (c == -1 || c > h4.f5355b) {
                return false;
            }
            int i7 = h4.f5356e;
            int i8 = (int) (j6 & 15);
            if (i8 != 0) {
                if (i8 <= 11) {
                    if (i8 != h4.f5357f) {
                        return false;
                    }
                } else if (i8 != 12) {
                    if (i8 > 14) {
                        return false;
                    }
                    int q4 = c1134rq.q();
                    if (i8 == 14) {
                        q4 *= 10;
                    }
                    if (q4 != i7) {
                        return false;
                    }
                } else if (c1134rq.m() * 1000 != i7) {
                    return false;
                }
            }
            int m4 = c1134rq.m();
            int i9 = c1134rq.f10537b;
            byte[] bArr = c1134rq.f10536a;
            int i10 = i9 - 1;
            int i11 = 0;
            for (int i12 = c1134rq.f10537b; i12 < i10; i12++) {
                i11 = AbstractC0751is.f9080l[i11 ^ (bArr[i12] & 255)];
            }
            int i13 = AbstractC0751is.f9071a;
            return m4 == i11;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int N(int i4, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i4 >= length) {
                return length;
            }
            if (bArr[i4] == 0) {
                return i4;
            }
            i4++;
        }
    }

    public static final ResolveInfo O(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= queryIntentActivities.size()) {
                        break;
                    }
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i4).activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i4++;
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            N1.n.f1204A.f1209g.h("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th);
            return resolveInfo;
        }
    }

    public static C0847l2 P(int i4, C c, C1134rq c1134rq) {
        C0847l2 a4 = C0847l2.a(c, c1134rq);
        while (true) {
            int i5 = a4.f9358a;
            if (i5 == i4) {
                return a4;
            }
            U.a.p(i5, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j4 = a4.f9359b + 8;
            if (j4 > 2147483647L) {
                throw C0907md.b("Chunk is too large (~2GB+) to skip; id: " + i5);
            }
            ((C1316w) c).f((int) j4);
            a4 = C0847l2.a(c, c1134rq);
        }
    }

    public static String Q(int i4) {
        if (i4 == 1) {
            return "SHA-256";
        }
        if (i4 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(U.a.i("Unknown content digest algorthm: ", i4));
    }

    public static String R(Context context, String str) {
        N1.n nVar = N1.n.f1204A;
        String h4 = nVar.f1225w.h(context);
        String g4 = nVar.f1225w.g(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(h4)) {
            str = g(str, "gmp_app_id", h4).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(g4)) ? str : g(str, "fbs_aiid", g4).toString();
    }

    public static void S(int i4, long j4, String str, int i5, PriorityQueue priorityQueue) {
        L4 l4 = new L4(i5, j4, str);
        if ((priorityQueue.size() != i4 || (((L4) priorityQueue.peek()).c <= i5 && ((L4) priorityQueue.peek()).f6121a <= j4)) && !priorityQueue.contains(l4)) {
            priorityQueue.add(l4);
            if (priorityQueue.size() > i4) {
                priorityQueue.poll();
            }
        }
    }

    public static boolean T(int i4, C1134rq c1134rq, boolean z4) {
        if (c1134rq.g() < 7) {
            if (z4) {
                return false;
            }
            throw C0907md.a("too short header: " + c1134rq.g(), null);
        }
        if (c1134rq.m() != i4) {
            if (z4) {
                return false;
            }
            throw C0907md.a("expected header type ".concat(String.valueOf(Integer.toHexString(i4))), null);
        }
        if (c1134rq.m() == 118 && c1134rq.m() == 111 && c1134rq.m() == 114 && c1134rq.m() == 98 && c1134rq.m() == 105 && c1134rq.m() == 115) {
            return true;
        }
        if (z4) {
            return false;
        }
        throw C0907md.a("expected characters 'vorbis'", null);
    }

    public static int U(int i4, C1134rq c1134rq) {
        byte[] bArr = c1134rq.f10536a;
        int i5 = c1134rq.f10537b;
        int i6 = i5;
        while (true) {
            int i7 = i6 + 1;
            if (i7 >= i5 + i4) {
                return i4;
            }
            if ((bArr[i6] & 255) == 255 && bArr[i7] == 0) {
                System.arraycopy(bArr, i6 + 2, bArr, i7, (i4 - (i6 - i5)) - 2);
                i4--;
            }
            i6 = i7;
        }
    }

    public static long V(int i4, String[] strArr) {
        long d = (d(strArr[0]) + 2147483647L) % 1073807359;
        for (int i5 = 1; i5 < i4; i5++) {
            d = (((d(strArr[i5]) + 2147483647L) % 1073807359) + ((d * 16785407) % 1073807359)) % 1073807359;
        }
        return d;
    }

    public static long W(ByteBuffer byteBuffer) {
        long j4 = byteBuffer.getInt();
        return j4 < 0 ? j4 + 4294967296L : j4;
    }

    public static ByteBuffer X(int i4, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i5 = i4 + position;
        if (i5 < position || i5 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i5);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i5);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static ArrayList Y(byte[] bArr) {
        long j4 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j4 * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static long Z(byte b4, byte b5) {
        int i4;
        int i5 = b4 & 255;
        int i6 = b4 & 3;
        if (i6 != 0) {
            i4 = 2;
            if (i6 != 1 && i6 != 2) {
                i4 = b5 & 63;
            }
        } else {
            i4 = 1;
        }
        int i7 = i5 >> 3;
        return i4 * (i7 >= 16 ? 2500 << r6 : i7 >= 12 ? 10000 << (i7 & 1) : (i7 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static double a(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static long a0(ByteBuffer byteBuffer) {
        long W4 = W(byteBuffer) << 32;
        if (W4 >= 0) {
            return W(byteBuffer) + W4;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static int b(int i4) {
        switch (i4) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static Pair b0(RandomAccessFile randomAccessFile, int i4) {
        int i5;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i4, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        g0(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i6 = capacity2 - 22;
            int min = Math.min(i6, 65535);
            for (int i7 = 0; i7 < min; i7++) {
                i5 = i6 - i7;
                if (allocate.getInt(i5) == 101010256 && ((char) allocate.getShort(i5 + 20)) == i7) {
                    break;
                }
            }
        }
        i5 = -1;
        if (i5 == -1) {
            return null;
        }
        allocate.position(i5);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i5));
    }

    public static int c(int i4, C1134rq c1134rq) {
        switch (i4) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i4 - 2);
            case 6:
                return c1134rq.m() + 1;
            case 7:
                return c1134rq.q() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i4 - 8);
            default:
                return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x026b, code lost:
    
        if (r8 == 67) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04b8 A[Catch: all -> 0x0241, TRY_LEAVE, TryCatch #0 {all -> 0x0241, blocks: (B:56:0x04b8, B:104:0x020f, B:106:0x0232, B:107:0x0239, B:108:0x0235, B:122:0x026d, B:125:0x0280, B:129:0x02c5, B:131:0x02e1, B:132:0x02e8, B:133:0x02e4, B:134:0x02a5, B:136:0x02c1, B:149:0x0306, B:155:0x0347, B:158:0x037b, B:161:0x0388, B:162:0x038e, B:164:0x0392, B:167:0x0399, B:172:0x039d, B:182:0x03be, B:185:0x03e2, B:187:0x03ed, B:189:0x041d, B:190:0x042a, B:192:0x042e, B:195:0x0435, B:200:0x0439, B:204:0x0452, B:213:0x0463, B:215:0x048d, B:217:0x049c, B:218:0x04a7), top: B:46:0x00f0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.F0 c0(int r34, com.google.android.gms.internal.ads.C1134rq r35, boolean r36, com.google.android.gms.internal.ads.BF r37) {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1230u.c0(int, com.google.android.gms.internal.ads.rq, boolean, com.google.android.gms.internal.ads.BF):com.google.android.gms.internal.ads.F0");
    }

    public static int d(String str) {
        byte[] bytes;
        int i4;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        int length = bytes.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = length & (-4);
            if (i5 >= i4) {
                break;
            }
            int i7 = ((bytes[i5] & 255) | ((bytes[i5 + 1] & 255) << 8) | ((bytes[i5 + 2] & 255) << 16) | (bytes[i5 + 3] << 24)) * (-862048943);
            int i8 = i6 ^ (((i7 >>> 17) | (i7 << 15)) * 461845907);
            i6 = (((i8 >>> 19) | (i8 << 13)) * 5) - 430675100;
            i5 += 4;
        }
        int i9 = length & 3;
        if (i9 != 1) {
            if (i9 != 2) {
                r1 = i9 == 3 ? (bytes[i4 + 2] & 255) << 16 : 0;
                int i10 = i6 ^ length;
                int i11 = (i10 ^ (i10 >>> 16)) * (-2048144789);
                int i12 = (i11 ^ (i11 >>> 13)) * (-1028477387);
                return i12 ^ (i12 >>> 16);
            }
            r1 |= (bytes[i4 + 1] & 255) << 8;
        }
        int i13 = ((bytes[i4] & 255) | r1) * (-862048943);
        i6 ^= ((i13 >>> 17) | (i13 << 15)) * 461845907;
        int i102 = i6 ^ length;
        int i112 = (i102 ^ (i102 >>> 16)) * (-2048144789);
        int i122 = (i112 ^ (i112 >>> 13)) * (-1028477387);
        return i122 ^ (i122 >>> 16);
    }

    public static ByteBuffer d0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(U.a.i("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        int i4 = byteBuffer.getInt();
        if (i4 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i4 <= byteBuffer.remaining()) {
            return X(i4, byteBuffer);
        }
        throw new IOException(U.a.g(i4, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
    }

    public static long e(int i4, long j4) {
        if (i4 == 1) {
            return j4;
        }
        int i5 = i4 >> 1;
        long j5 = (j4 * j4) % 1073807359;
        return (i4 & 1) == 0 ? e(i5, j5) % 1073807359 : ((e(i5, j5) % 1073807359) * j4) % 1073807359;
    }

    public static Gt e0(byte[] bArr, int i4, int i5) {
        if (i5 >= bArr.length) {
            return AbstractC1137rt.t("");
        }
        Object[] objArr = new Object[4];
        int G3 = G(bArr, i5, i4);
        int i6 = 0;
        while (i5 < G3) {
            String str = new String(bArr, i5, G3 - i5, k0(i4));
            int i7 = i6 + 1;
            int length = objArr.length;
            if (length < i7) {
                objArr = Arrays.copyOf(objArr, AbstractC0880lt.d(length, i7));
            }
            objArr[i6] = str;
            int s4 = G3 + s(i4);
            i6 = i7;
            i5 = s4;
            G3 = G(bArr, s4, i4);
        }
        Gt q4 = AbstractC1137rt.q(i6, objArr);
        return q4.isEmpty() ? AbstractC1137rt.t("") : q4;
    }

    public static long f(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e4) {
            if ("0".equals(str) || "-1".equals(str)) {
                I2.c("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", I2.d("Unable to parse dateStr: %s, falling back to 0", str), e4);
            return 0L;
        }
    }

    public static void f0(int i4, byte[] bArr) {
        bArr[1] = (byte) (i4 & 255);
        bArr[2] = (byte) ((i4 >>> 8) & 255);
        bArr[3] = (byte) ((i4 >>> 16) & 255);
        bArr[4] = (byte) (i4 >> 24);
    }

    public static Uri g(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i4 = indexOf + 1;
        return Uri.parse(str.substring(0, i4) + str2 + "=" + str3 + "&" + str.substring(i4));
    }

    public static void g0(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static ArrayList h(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C1362x2((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static String h0(byte[] bArr, int i4, int i5, Charset charset) {
        return (i5 <= i4 || i5 > bArr.length) ? "" : new String(bArr, i4, i5 - i4, charset);
    }

    public static HashMap i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            Log.d("u", "decode object failure");
            return null;
        }
    }

    public static String i0(int i4, int i5, int i6, int i7, int i8) {
        return i4 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
    }

    public static void j(long j4, C1134rq c1134rq, V[] vArr) {
        int i4;
        int i5;
        while (true) {
            if (c1134rq.g() <= 1) {
                return;
            }
            int i6 = 0;
            while (true) {
                if (c1134rq.g() == 0) {
                    i4 = -1;
                    break;
                }
                int m4 = c1134rq.m();
                i6 += m4;
                if (m4 != 255) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = 0;
            while (true) {
                if (c1134rq.g() == 0) {
                    i7 = -1;
                    break;
                }
                int m5 = c1134rq.m();
                i7 += m5;
                if (m5 != 255) {
                    break;
                }
            }
            int i8 = c1134rq.f10537b + i7;
            if (i7 == -1 || i7 > c1134rq.g()) {
                Wj.l("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i8 = c1134rq.c;
            } else if (i4 == 4 && i7 >= 8) {
                int m6 = c1134rq.m();
                int q4 = c1134rq.q();
                if (q4 == 49) {
                    i5 = c1134rq.h();
                    q4 = 49;
                } else {
                    i5 = 0;
                }
                int m7 = c1134rq.m();
                if (q4 == 47) {
                    c1134rq.f(1);
                    q4 = 47;
                }
                boolean z4 = m6 == 181 && (q4 == 49 || q4 == 47) && m7 == 3;
                if (q4 == 49) {
                    z4 &= i5 == 1195456820;
                }
                if (z4) {
                    A(j4, c1134rq, vArr);
                }
            }
            c1134rq.e(i8);
        }
    }

    public static byte[] j0(ByteBuffer byteBuffer) {
        int i4 = byteBuffer.getInt();
        if (i4 < 0) {
            throw new IOException("Negative length");
        }
        if (i4 > byteBuffer.remaining()) {
            throw new IOException(U.a.g(i4, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
        }
        byte[] bArr = new byte[i4];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static void k(InterfaceFutureC0239a interfaceFutureC0239a, String str) {
        C0753iv c0753iv = new C0753iv(str, 6);
        interfaceFutureC0239a.a(new Nu(0, interfaceFutureC0239a, c0753iv), AbstractC0266Ec.f4900f);
    }

    public static Charset k0(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? AbstractC1480zs.f11692b : AbstractC1480zs.c : AbstractC1480zs.d : AbstractC1480zs.f11694f;
    }

    public static void l(C1323w6 c1323w6, C1237u6 c1237u6, String... strArr) {
        if (c1237u6 == null) {
            return;
        }
        N1.n.f1204A.f1212j.getClass();
        c1323w6.c(c1237u6, SystemClock.elapsedRealtime(), strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = F(r6);
        r12 = F(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.cert.X509Certificate[] l0(java.nio.ByteBuffer r22, java.util.HashMap r23, java.security.cert.CertificateFactory r24) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1230u.l0(java.nio.ByteBuffer, java.util.HashMap, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    public static void m(String str) {
        if (((Boolean) V6.f7234a.r()).booleanValue()) {
            Y9.m(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m0(com.google.android.gms.internal.ads.C1134rq r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.f10537b
        L6:
            int r3 = r1.g()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La5
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.h()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.u()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.q()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto La9
        L23:
            int r7 = r1.o()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.o()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L20
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L39
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L39
            if (r10 != 0) goto L39
            goto La5
        L39:
            r7 = 4
            if (r0 != r7) goto L69
            if (r24 != 0) goto L69
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L49
        L46:
            r4 = r6
            goto La5
        L49:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L69:
            if (r0 != r7) goto L79
            r3 = r10 & 64
            if (r3 == 0) goto L70
            goto L71
        L70:
            r4 = r6
        L71:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8b
        L79:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L81
            r3 = r4
            goto L82
        L81:
            r3 = r6
        L82:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L87
            goto L8b
        L87:
            r4 = r6
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L95
            goto L46
        L95:
            int r3 = r1.g()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L9f
            goto L46
        L9f:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L20
            r1.f(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        La5:
            r1.e(r2)
            return r4
        La9:
            r1.e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1230u.m0(com.google.android.gms.internal.ads.rq, int, int, boolean):boolean");
    }

    public static boolean n(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !n((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i4 = 0; i4 < length; i4++) {
                        if (!h2.y.m(Array.get(obj, i4), Array.get(obj2, i4))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }

    public static byte[][] n0(int[] iArr, InterfaceC0933n2[] interfaceC0933n2Arr) {
        long j4;
        int i4;
        int length;
        char c;
        int i5 = 0;
        long j5 = 0;
        while (true) {
            j4 = 1048576;
            if (i5 >= 3) {
                break;
            }
            j5 += (interfaceC0933n2Arr[i5].b() + 1048575) / 1048576;
            i5++;
        }
        if (j5 >= 2097151) {
            throw new DigestException("Too many chunks: " + j5);
        }
        byte[][] bArr = new byte[iArr.length];
        int i6 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            if (i6 >= length) {
                break;
            }
            int i7 = (int) j5;
            byte[] bArr2 = new byte[(E(iArr[i6]) * i7) + 5];
            bArr2[0] = 90;
            f0(i7, bArr2);
            bArr[i6] = bArr2;
            i6++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            String Q3 = Q(iArr[i8]);
            try {
                messageDigestArr[i8] = MessageDigest.getInstance(Q3);
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(Q3.concat(" digest not supported"), e4);
            }
        }
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (i4 = 3; i9 < i4; i4 = 3) {
            InterfaceC0933n2 interfaceC0933n2 = interfaceC0933n2Arr[i9];
            int i12 = i9;
            long b4 = interfaceC0933n2.b();
            long j6 = 0;
            while (b4 > 0) {
                char c2 = c;
                int i13 = i10;
                int min = (int) Math.min(b4, j4);
                f0(min, bArr3);
                for (int i14 = 0; i14 < length; i14++) {
                    messageDigestArr[i14].update(bArr3);
                }
                try {
                    interfaceC0933n2.e(messageDigestArr, j6, min);
                    int i15 = 0;
                    while (i15 < iArr.length) {
                        int i16 = iArr[i15];
                        byte[] bArr4 = bArr[i15];
                        int E4 = E(i16);
                        InterfaceC0933n2 interfaceC0933n22 = interfaceC0933n2;
                        MessageDigest messageDigest = messageDigestArr[i15];
                        long j7 = b4;
                        int digest = messageDigest.digest(bArr4, (i13 * E4) + 5, E4);
                        if (digest != E4) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i15++;
                        interfaceC0933n2 = interfaceC0933n22;
                        b4 = j7;
                    }
                    InterfaceC0933n2 interfaceC0933n23 = interfaceC0933n2;
                    long j8 = min;
                    j6 += j8;
                    i10 = i13 + 1;
                    b4 -= j8;
                    c = c2;
                    interfaceC0933n2 = interfaceC0933n23;
                    j4 = 1048576;
                } catch (IOException e5) {
                    throw new DigestException(U.a.g(i13, i11, "Failed to digest chunk #", " of section #"), e5);
                }
            }
            i11++;
            i9 = i12 + 1;
            j4 = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length];
        for (int i17 = 0; i17 < iArr.length; i17++) {
            int i18 = iArr[i17];
            byte[] bArr6 = bArr[i17];
            String Q4 = Q(i18);
            try {
                bArr5[i17] = MessageDigest.getInstance(Q4).digest(bArr6);
            } catch (NoSuchAlgorithmException e6) {
                throw new RuntimeException(Q4.concat(" digest not supported"), e6);
            }
        }
        return bArr5;
    }

    public static /* synthetic */ boolean o(String str, String str2) {
        if (str != str2) {
            return str != null && str.equals(str2);
        }
        return true;
    }

    public static X509Certificate[][] o0(FileChannel fileChannel, C1019p2 c1019p2) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer d02 = d0((ByteBuffer) c1019p2.d);
                int i4 = 0;
                while (d02.hasRemaining()) {
                    i4++;
                    try {
                        arrayList.add(l0(d0(d02), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e4) {
                        throw new SecurityException(U.a.h(i4, "Failed to parse/verify signer #", " block"), e4);
                    }
                }
                if (i4 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j4 = c1019p2.f9900a;
                long j5 = c1019p2.f9901b;
                long j6 = c1019p2.c;
                ByteBuffer byteBuffer = (ByteBuffer) c1019p2.f9902e;
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                Q1.z zVar = new Q1.z(fileChannel, 0L, j4);
                Q1.z zVar2 = new Q1.z(fileChannel, j5, j6 - j5);
                ByteBuffer duplicate = byteBuffer.duplicate();
                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                g0(duplicate);
                int position = duplicate.position() + 16;
                if (j4 < 0 || j4 > 4294967295L) {
                    throw new IllegalArgumentException("uint32 value of out range: " + j4);
                }
                duplicate.putInt(duplicate.position() + position, (int) j4);
                C0874ln c0874ln = new C0874ln(duplicate);
                int size = hashMap.size();
                int[] iArr = new int[size];
                Iterator it = hashMap.keySet().iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    iArr[i5] = ((Integer) it.next()).intValue();
                    i5++;
                }
                try {
                    byte[][] n02 = n0(iArr, new InterfaceC0933n2[]{zVar, zVar2, c0874ln});
                    for (int i6 = 0; i6 < size; i6++) {
                        int i7 = iArr[i6];
                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i7)), n02[i6])) {
                            throw new SecurityException(Q(i7).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                } catch (DigestException e5) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e5);
                }
            } catch (IOException e6) {
                throw new SecurityException("Failed to read list of signers", e6);
            }
        } catch (CertificateException e7) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e7);
        }
    }

    public static X509Certificate[][] p(String str) {
        Pair b02;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                b02 = null;
            } else {
                b02 = b0(randomAccessFile, 0);
                if (b02 == null) {
                    b02 = b0(randomAccessFile, 65535);
                }
            }
            if (b02 == null) {
                throw new Exception("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) b02.first;
            long longValue = ((Long) b02.second).longValue();
            long j4 = longValue - 20;
            if (j4 >= 0) {
                randomAccessFile.seek(j4);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new Exception("ZIP64 APK not supported");
                }
            }
            g0(byteBuffer);
            long j5 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j5 >= longValue) {
                throw new Exception("ZIP Central Directory offset out of range: " + j5 + ". ZIP End of Central Directory offset: " + longValue);
            }
            g0(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j5 != longValue) {
                throw new Exception("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j5 < 32) {
                throw new Exception("APK too small for APK Signing Block. ZIP Central Directory offset: " + j5);
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(j5 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new Exception("No APK Signing Block before ZIP Central Directory");
            }
            long j6 = allocate.getLong(0);
            if (j6 < allocate.capacity() || j6 > 2147483639) {
                throw new Exception("APK Signing Block size out of range: " + j6);
            }
            int i4 = (int) (j6 + 8);
            long j7 = j5 - i4;
            if (j7 < 0) {
                throw new Exception("APK Signing Block offset out of range: " + j7);
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i4);
            allocate2.order(byteOrder);
            randomAccessFile.seek(j7);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j8 = allocate2.getLong(0);
            if (j8 != j6) {
                throw new Exception("APK Signing Block sizes in header and footer do not match: " + j8 + " vs " + j6);
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j7));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                int i5 = 0;
                while (slice.hasRemaining()) {
                    i5++;
                    if (slice.remaining() < 8) {
                        throw new Exception("Insufficient data to read size of APK Signing Block entry #" + i5);
                    }
                    long j9 = slice.getLong();
                    if (j9 < 4 || j9 > 2147483647L) {
                        throw new Exception("APK Signing Block entry #" + i5 + " size out of range: " + j9);
                    }
                    int i6 = (int) j9;
                    int position2 = slice.position() + i6;
                    if (i6 > slice.remaining()) {
                        throw new Exception("APK Signing Block entry #" + i5 + " size out of range: " + i6 + ", available: " + slice.remaining());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] o02 = o0(randomAccessFile.getChannel(), new C1019p2(X(i6 - 4, slice), longValue2, j5, longValue, byteBuffer));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return o02;
                    }
                    long j10 = j5;
                    long j11 = longValue2;
                    ByteBuffer byteBuffer3 = byteBuffer;
                    long j12 = longValue;
                    slice.position(position2);
                    j5 = j10;
                    longValue2 = j11;
                    longValue = j12;
                    byteBuffer = byteBuffer3;
                }
                throw new Exception("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    public static int q(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 != 1) {
            return i4 != 1000 ? 0 : 1001;
        }
        return 2;
    }

    public static double r(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static int s(int i4) {
        return (i4 == 0 || i4 == 3) ? 1 : 2;
    }

    public static long t(C1134rq c1134rq, int i4, int i5) {
        c1134rq.e(i4);
        if (c1134rq.g() < 5) {
            return -9223372036854775807L;
        }
        int h4 = c1134rq.h();
        if ((8388608 & h4) != 0 || ((h4 >> 8) & 8191) != i5 || (h4 & 32) == 0 || c1134rq.m() < 7 || c1134rq.g() < 7 || (c1134rq.m() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c1134rq.a(bArr, 0, 6);
        long j4 = bArr[0];
        long j5 = bArr[1];
        long j6 = bArr[2];
        long j7 = bArr[3] & 255;
        return ((j4 & 255) << 25) | ((j5 & 255) << 17) | ((j6 & 255) << 9) | (j7 + j7) | ((bArr[4] & 255) >> 7);
    }

    public static final Intent u(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static C1190t2 v(B2 b22) {
        long j4;
        boolean z4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = b22.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long f4 = str != null ? f(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i4 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z4 = false;
            j5 = 0;
            j6 = 0;
            while (i4 < split.length) {
                String trim = split[i4].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j6 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j5 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z4 = true;
                }
                i4++;
            }
            j4 = 0;
            i4 = 1;
        } else {
            j4 = 0;
            z4 = false;
            j5 = 0;
            j6 = 0;
        }
        String str3 = (String) map.get("Expires");
        long f5 = str3 != null ? f(str3) : j4;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j7 = currentTimeMillis;
            j8 = f(str4);
        } else {
            j7 = currentTimeMillis;
            j8 = j4;
        }
        String str5 = (String) map.get("ETag");
        if (i4 != 0) {
            long j11 = (j6 * 1000) + j7;
            if (z4) {
                j10 = j11;
            } else {
                Long.signum(j5);
                j10 = (j5 * 1000) + j11;
            }
            j9 = j11;
        } else {
            j9 = (f4 <= j4 || f5 < f4) ? j4 : (f5 - f4) + j7;
            j10 = j9;
        }
        C1190t2 c1190t2 = new C1190t2();
        c1190t2.f10667a = b22.f4023b;
        c1190t2.f10668b = str5;
        c1190t2.f10670f = j9;
        c1190t2.f10669e = j10;
        c1190t2.c = f4;
        c1190t2.d = j8;
        c1190t2.f10671g = map;
        c1190t2.f10672h = b22.d;
        return c1190t2;
    }

    public static C1120rc w(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            String str = (String) list.get(i4);
            int i5 = AbstractC0751is.f9071a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                Wj.l("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C1274v0.a(new C1134rq(Base64.decode(split[1], 0))));
                } catch (RuntimeException e4) {
                    Wj.n("VorbisUtil", "Failed to parse vorbis picture", e4);
                }
            } else {
                arrayList.add(new C1317w0(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1120rc(arrayList);
    }

    public static C1510e1 x(C1134rq c1134rq) {
        c1134rq.f(1);
        int o4 = c1134rq.o();
        long j4 = c1134rq.f10537b;
        long j5 = o4;
        int i4 = o4 / 18;
        long[] jArr = new long[i4];
        long[] jArr2 = new long[i4];
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            long t4 = c1134rq.t();
            if (t4 == -1) {
                jArr = Arrays.copyOf(jArr, i5);
                jArr2 = Arrays.copyOf(jArr2, i5);
                break;
            }
            jArr[i5] = t4;
            jArr2[i5] = c1134rq.t();
            c1134rq.f(2);
            i5++;
        }
        c1134rq.f((int) ((j4 + j5) - c1134rq.f10537b));
        return new C1510e1((Object) jArr, (Object) jArr2, 13, false);
    }

    public static String y(String[] strArr, int i4, int i5) {
        int i6 = i5 + i4;
        if (strArr.length < i6) {
            Y9.p("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i7 = i6 - 1;
            if (i4 >= i7) {
                sb.append(strArr[i7]);
                return sb.toString();
            }
            sb.append(strArr[i4]);
            sb.append(' ');
            i4++;
        }
    }

    public String toString() {
        switch (this.f10763a) {
            case 15:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(z());
                    objectOutputStream.close();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException unused) {
                    return null;
                }
            default:
                return super.toString();
        }
    }

    public abstract HashMap z();
}
