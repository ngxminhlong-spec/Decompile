package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Bs {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4203o;

    public /* synthetic */ Bs(int i4) {
        this.f4203o = i4;
    }

    public static String B(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e4) {
                    String i6 = n0.a.i(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(i6), (Throwable) e4);
                    str2 = "<" + i6 + " threw " + e4.getClass().getName() + ">";
                }
            }
            objArr[i5] = str2;
            i5++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i7 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = str.indexOf("%s", i7)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i7, indexOf);
            sb.append(objArr[i4]);
            i4++;
            i7 = indexOf + 2;
        }
        sb.append((CharSequence) str, i7, str.length());
        if (i4 < length2) {
            sb.append(" [");
            sb.append(objArr[i4]);
            for (int i8 = i4 + 1; i8 < objArr.length; i8++) {
                sb.append(", ");
                sb.append(objArr[i8]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void C(int i4, int i5) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(l0(i4, i5, "index"));
        }
    }

    public static void D(int i4, Object[] objArr) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException(U.a.i("at index ", i5));
            }
        }
    }

    public static void F(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(U.a.k("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static final void G(StringBuilder sb, Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    Object next2 = it.next();
                    next2.getClass();
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public static void H(List list, Es es, int i4, int i5) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i5) {
                break;
            } else if (es.l(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i5--;
            if (i5 < i4) {
                return;
            } else {
                list.remove(i5);
            }
        }
    }

    public static boolean I(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static byte[] J(byte[]... bArr) {
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= bArr.length) {
                byte[] bArr2 = new byte[i5];
                int i6 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i6, length);
                    i6 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i4].length;
            if (i5 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i5 += length2;
            i4++;
        }
    }

    public static int K(int i4, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i4] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i4] : ((int[]) obj)[i4];
    }

    public static int L(long j4) {
        if (j4 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j4 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j4;
    }

    public static long M(int i4, byte[] bArr) {
        int i5 = bArr[i4] & 255;
        int i6 = bArr[i4 + 1] & 255;
        int i7 = bArr[i4 + 2] & 255;
        return (((bArr[i4 + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16)) & 4294967295L;
    }

    public static long N(long j4, long j5) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j5) + Long.numberOfLeadingZeros(j5) + Long.numberOfLeadingZeros(~j4) + Long.numberOfLeadingZeros(j4);
        if (numberOfLeadingZeros > 65) {
            return j4 * j5;
        }
        long j6 = j4 ^ j5;
        long j7 = (j6 >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j5 == Long.MIN_VALUE) & (j4 < 0)))) {
            long j8 = j4 * j5;
            if (j4 == 0 || j8 / j4 == j5) {
                return j8;
            }
        }
        return j7;
    }

    public static String O(String str) {
        int i4 = Ds.f4802a;
        return str == null ? "" : str;
    }

    public static Executor P(Executor executor, Ju ju) {
        executor.getClass();
        return executor == Iu.f5747o ? executor : new Tu(executor, ju);
    }

    public static void S(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean T(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static Object U(int i4) {
        if (i4 < 2 || i4 > 1073741824 || Integer.highestOneBit(i4) != i4) {
            throw new IllegalArgumentException(U.a.i("must be power of 2 between 2^1 and 2^30: ", i4));
        }
        return i4 <= 256 ? new byte[i4] : i4 <= 65536 ? new short[i4] : new int[i4];
    }

    public static void W(byte[] bArr, long j4, int i4) {
        for (int i5 = 0; i5 < 4; i5++) {
            bArr[i4 + i5] = (byte) (255 & j4);
            j4 >>= 8;
        }
    }

    public static boolean X(Qt qt, Collection collection) {
        collection.getClass();
        if (collection instanceof Dt) {
            collection = ((Dt) collection).b();
        }
        boolean z4 = false;
        if (!(collection instanceof Set) || collection.size() <= qt.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z4 |= qt.remove(it.next());
            }
            return z4;
        }
        Iterator<E> it2 = qt.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z4 = true;
            }
        }
        return z4;
    }

    public static final byte[] Y(byte[] bArr, int i4, byte[] bArr2, int i5, int i6) {
        if (bArr.length - i6 < i4 || bArr2.length - i6 < i5) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            bArr3[i7] = (byte) (bArr[i7 + i4] ^ bArr2[i7 + i5]);
        }
        return bArr3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.du, com.google.android.gms.internal.ads.eu, com.google.android.gms.internal.ads.Ju, java.lang.Runnable] */
    public static C0539du Z(InterfaceFutureC0239a interfaceFutureC0239a, Class cls, As as, Executor executor) {
        ?? abstractRunnableC0582eu = new AbstractRunnableC0582eu(interfaceFutureC0239a, cls, as);
        interfaceFutureC0239a.a(abstractRunnableC0582eu, P(executor, abstractRunnableC0582eu));
        return abstractRunnableC0582eu;
    }

    public static void a0(int i4, int i5, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i4] = (byte) i5;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i4] = (short) i5;
        } else {
            ((int[]) obj)[i4] = i5;
        }
    }

    public static int b(int i4) {
        return (int) (Integer.rotateLeft((int) (i4 * (-862048943)), 15) * 461845907);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.cu, com.google.android.gms.internal.ads.eu, com.google.android.gms.internal.ads.Ju, java.lang.Runnable] */
    public static C0497cu c0(InterfaceFutureC0239a interfaceFutureC0239a, Class cls, Du du, Executor executor) {
        ?? abstractRunnableC0582eu = new AbstractRunnableC0582eu(interfaceFutureC0239a, cls, du);
        interfaceFutureC0239a.a(abstractRunnableC0582eu, P(executor, abstractRunnableC0582eu));
        return abstractRunnableC0582eu;
    }

    public static int d(Set set) {
        Iterator it = set.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i4 += next != null ? next.hashCode() : 0;
        }
        return i4;
    }

    public static void d0(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static long e(long j4, long j5, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j6 = j4 / j5;
        long j7 = j4 - (j5 * j6);
        if (j7 == 0) {
            return j6;
        }
        int i4 = ((int) ((j4 ^ j5) >> 63)) | 1;
        switch (AbstractC0455bu.f8303a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return j6;
            case 3:
                if (i4 >= 0) {
                    return j6;
                }
                break;
            case 4:
                break;
            case 5:
                if (i4 <= 0) {
                    return j6;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j7);
                long abs2 = abs - (Math.abs(j5) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j6) == 0)) {
                        return j6;
                    }
                } else if (abs2 <= 0) {
                    return j6;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j6 + i4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Ou, com.google.android.gms.internal.ads.ru, java.lang.Object] */
    public static Ou f0(Throwable th) {
        th.getClass();
        ?? obj = new Object();
        obj.g(th);
        return obj;
    }

    public static final AbstractC1054pv g(AbstractC1054pv abstractC1054pv) {
        if (abstractC1054pv != null) {
            return abstractC1054pv;
        }
        try {
            return h(((Uw) Iw.f5771b.b(null)).f7210b.e());
        } catch (GeneralSecurityException e4) {
            throw new RuntimeException("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e4);
        }
    }

    public static AbstractC1054pv h(byte[] bArr) {
        try {
            C1142ry x4 = C1142ry.x(bArr, C1315vz.f11096b);
            Iw iw = Iw.f5771b;
            String A3 = x4.A();
            int i4 = AbstractC0415ax.f8180a;
            byte[] bArr2 = new byte[A3.length()];
            for (int i5 = 0; i5 < A3.length(); i5++) {
                char charAt = A3.charAt(i5);
                if (charAt < '!' || charAt > '~') {
                    throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
                }
                bArr2[i5] = (byte) charAt;
            }
            Zy a4 = Zy.a(bArr2);
            Uw uw = new Uw(x4, a4);
            Zw zw = (Zw) iw.f5772a.get();
            zw.getClass();
            Class<Uw> cls = Uw.class;
            if (!zw.d.containsKey(new Xw(cls, a4))) {
                return new Bw(uw);
            }
            Zw zw2 = (Zw) iw.f5772a.get();
            zw2.getClass();
            Xw xw = new Xw(cls, a4);
            HashMap hashMap = zw2.d;
            if (hashMap.containsKey(xw)) {
                return ((Jw) hashMap.get(xw)).f5941b.c(uw);
            }
            throw new GeneralSecurityException(U.a.k("No Parameters Parser for requested key type ", xw.toString(), " available"));
        } catch (IOException e4) {
            throw new GeneralSecurityException("Failed to parse proto", e4);
        }
    }

    public static Pu h0(Object obj) {
        return obj == null ? Pu.f6608p : new Pu(obj);
    }

    public static void i0(int i4, int i5, int i6) {
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            throw new IndexOutOfBoundsException((i4 < 0 || i4 > i6) ? l0(i4, i6, "start index") : (i5 < 0 || i5 > i6) ? l0(i5, i6, "end index") : B("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4)));
        }
    }

    public static void j0(String str, boolean z4) {
        if (!z4) {
            throw new IllegalStateException(str);
        }
    }

    public static String k(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b4 : bArr) {
            sb.append("0123456789abcdef".charAt((b4 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b4 & 15));
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.cv, java.lang.Object, java.lang.Runnable] */
    public static RunnableFutureC0498cv k0(Cu cu, Executor executor) {
        ?? obj = new Object();
        obj.f8428v = new C0413av((RunnableFutureC0498cv) obj, cu);
        executor.execute(obj);
        return obj;
    }

    public static void l(int i4, int i5) {
        String B4;
        if (i4 < 0 || i4 >= i5) {
            if (i4 < 0) {
                B4 = B("%s (%s) must not be negative", "index", Integer.valueOf(i4));
            } else {
                if (i5 < 0) {
                    throw new IllegalArgumentException(U.a.i("negative size: ", i5));
                }
                B4 = B("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
            }
            throw new IndexOutOfBoundsException(B4);
        }
    }

    public static String l0(int i4, int i5, String str) {
        if (i4 < 0) {
            return B("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return B("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(U.a.i("negative size: ", i5));
    }

    public static void m(C0882lv c0882lv) {
        C0753iv c0753iv;
        ArrayList arrayList = new ArrayList();
        C1227tx c1227tx = C1227tx.f10760b;
        Iterator it = ((ConcurrentMap) c0882lv.f9507q).values().iterator();
        while (it.hasNext()) {
            for (C1097qv c1097qv : (List) it.next()) {
                int i4 = c1097qv.f10431h - 2;
                if (i4 == 1) {
                    c0753iv = C0753iv.f9088q;
                } else if (i4 == 2) {
                    c0753iv = C0753iv.f9089r;
                } else {
                    if (i4 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    c0753iv = C0753iv.f9090s;
                }
                int i5 = c1097qv.f10428e;
                String str = c1097qv.f10429f;
                if (str.startsWith("type.googleapis.com/google.crypto.")) {
                    str = str.substring(34);
                }
                arrayList.add(new C1270ux(c0753iv, i5, str, c1097qv.d.name()));
            }
        }
        C1097qv c1097qv2 = (C1097qv) c0882lv.f9508r;
        Integer valueOf = c1097qv2 != null ? Integer.valueOf(c1097qv2.f10428e) : null;
        if (valueOf != null) {
            try {
                int intValue = valueOf.intValue();
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    int i7 = ((C1270ux) arrayList.get(i6)).f10957b;
                    i6++;
                    if (i7 == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e4) {
                throw new IllegalStateException(e4);
            }
        }
        Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.vu, com.google.android.gms.internal.ads.wu, com.google.android.gms.internal.ads.Ju, java.lang.Runnable] */
    public static C1310vu m0(InterfaceFutureC0239a interfaceFutureC0239a, As as, Executor executor) {
        ?? abstractRunnableC1353wu = new AbstractRunnableC1353wu(interfaceFutureC0239a, as);
        interfaceFutureC0239a.a(abstractRunnableC1353wu, P(executor, abstractRunnableC1353wu));
        return abstractRunnableC1353wu;
    }

    public static void n(String str, int i4) {
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.uu, com.google.android.gms.internal.ads.wu, com.google.android.gms.internal.ads.Ju, java.lang.Runnable] */
    public static C1267uu n0(InterfaceFutureC0239a interfaceFutureC0239a, Du du, Executor executor) {
        int i4 = AbstractRunnableC1353wu.f11219x;
        executor.getClass();
        ?? abstractRunnableC1353wu = new AbstractRunnableC1353wu(interfaceFutureC0239a, du);
        interfaceFutureC0239a.a(abstractRunnableC1353wu, P(executor, abstractRunnableC1353wu));
        return abstractRunnableC1353wu;
    }

    public static void o(String str, long j4) {
        if (j4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j4 + ") must be >= 0");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.ads.Zu, c3.a] */
    public static InterfaceFutureC0239a o0(InterfaceFutureC0239a interfaceFutureC0239a, long j4, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (interfaceFutureC0239a.isDone()) {
            return interfaceFutureC0239a;
        }
        ?? obj = new Object();
        obj.f8061v = interfaceFutureC0239a;
        RunnableC0744il runnableC0744il = new RunnableC0744il();
        runnableC0744il.f9056p = obj;
        obj.f8062w = scheduledExecutorService.schedule(runnableC0744il, j4, timeUnit);
        interfaceFutureC0239a.a(runnableC0744il, Iu.f5747o);
        return obj;
    }

    public static final void p(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i4) {
        if (i4 < 0 || byteBuffer2.remaining() < i4 || byteBuffer3.remaining() < i4 || byteBuffer.remaining() < i4) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static Object p0(Future future) {
        Object obj;
        boolean z4 = false;
        if (!future.isDone()) {
            throw new IllegalStateException(B("Future was expected to be done: %s", future));
        }
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static boolean q(int i4) {
        Boolean bool;
        if (i4 - 1 == 0) {
            return !AbstractC1140rw.a();
        }
        if (AbstractC1140rw.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                AbstractC1140rw.f10552a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static Object q0(C0272Fc c0272Fc) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                try {
                    obj = c0272Fc.get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof Error) {
                    throw new Error((Error) cause);
                }
                throw new RuntimeException(cause);
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static boolean r(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static /* synthetic */ boolean s(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AbstractC1138ru abstractC1138ru, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC1138ru, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC1138ru) != obj && atomicReferenceFieldUpdater.get(abstractC1138ru) != obj) {
                return false;
            }
        }
        return true;
    }

    public static byte[] t(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i4 = 0;
        while (i4 < 16) {
            int i5 = i4 + 1;
            byte b4 = bArr[i4];
            byte b5 = (byte) ((b4 + b4) & 254);
            bArr2[i4] = b5;
            if (i4 < 15) {
                bArr2[i4] = (byte) (((bArr[i5] >> 7) & 1) | b5);
            }
            i4 = i5;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static byte[] u(byte[] bArr, byte[] bArr2) {
        long M4 = M(0, bArr) & 67108863;
        int i4 = 3;
        long M5 = (M(3, bArr) >> 2) & 67108611;
        long M6 = (M(6, bArr) >> 4) & 67092735;
        long M7 = (M(9, bArr) >> 6) & 66076671;
        long M8 = (M(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        int i5 = 0;
        while (true) {
            int length = bArr2.length;
            if (i5 >= length) {
                long j9 = j4 + (j5 >> 26);
                long j10 = j9 & 67108863;
                long j11 = j6 + (j9 >> 26);
                long j12 = j11 & 67108863;
                long j13 = j7 + (j11 >> 26);
                long j14 = j13 & 67108863;
                long j15 = ((j13 >> 26) * 5) + j8;
                long j16 = j15 >> 26;
                long j17 = j15 & 67108863;
                long j18 = j17 + 5;
                long j19 = (j5 & 67108863) + j16;
                long j20 = j19 + (j18 >> 26);
                long j21 = j10 + (j20 >> 26);
                long j22 = j12 + (j21 >> 26);
                long j23 = (j14 + (j22 >> 26)) - 67108864;
                long j24 = j23 >> 63;
                long j25 = ~j24;
                long j26 = (j19 & j24) | (j20 & 67108863 & j25);
                long j27 = (j10 & j24) | (j21 & 67108863 & j25);
                long j28 = (j12 & j24) | (j22 & 67108863 & j25);
                long j29 = (j14 & j24) | (j23 & j25);
                long M9 = M(16, bArr) + (((j18 & 67108863 & j25) | (j17 & j24) | (j26 << 26)) & 4294967295L);
                long M10 = M(20, bArr) + (((j26 >> 6) | (j27 << 20)) & 4294967295L);
                long M11 = M(24, bArr);
                long M12 = M(28, bArr) + (((j28 >> 18) | (j29 << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                W(bArr4, M9 & 4294967295L, 0);
                long j30 = M10 + (M9 >> 32);
                W(bArr4, j30 & 4294967295L, 4);
                long j31 = M11 + (((j28 << 14) | (j27 >> 12)) & 4294967295L) + (j30 >> 32);
                W(bArr4, j31 & 4294967295L, 8);
                W(bArr4, (M12 + (j31 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i5);
            System.arraycopy(bArr2, i5, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, 17, (byte) 0);
            }
            long j32 = M8 * 5;
            long j33 = M7 * 5;
            long j34 = M6 * 5;
            long M13 = j8 + (M(0, bArr3) & 67108863);
            long M14 = j5 + ((M(i4, bArr3) >> 2) & 67108863);
            long M15 = j4 + ((M(6, bArr3) >> 4) & 67108863);
            long M16 = j6 + ((M(9, bArr3) >> 6) & 67108863);
            long j35 = M5;
            long M17 = j7 + (((M(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j36 = M14 * M4;
            long j37 = M14 * j35;
            long j38 = M15 * M4;
            long j39 = M14 * M6;
            long j40 = M15 * j35;
            long j41 = M16 * M4;
            long j42 = M14 * M7;
            long j43 = M15 * M6;
            long j44 = M16 * j35;
            long j45 = M17 * M4;
            long j46 = (M5 * 5 * M17) + (M16 * j34) + (M15 * j33) + (M14 * j32) + (M13 * M4);
            long j47 = j46 & 67108863;
            long j48 = M16 * j33;
            long j49 = j34 * M17;
            long j50 = j49 + j48 + (M15 * j32) + (M13 * j35) + j36 + (j46 >> 26);
            long j51 = j33 * M17;
            long j52 = j51 + (M16 * j32) + (M13 * M6) + j37 + j38 + (j50 >> 26);
            long j53 = (M17 * j32) + (M13 * M7) + j39 + j40 + j41 + (j52 >> 26);
            long j54 = (M13 * M8) + j42 + j43 + j44 + j45 + (j53 >> 26);
            long j55 = ((j54 >> 26) * 5) + j47;
            j5 = (j50 & 67108863) + (j55 >> 26);
            i5 += 16;
            j4 = j52 & 67108863;
            j6 = j53 & 67108863;
            j7 = j54 & 67108863;
            j8 = j55 & 67108863;
            M5 = j35;
            i4 = 3;
        }
    }

    public static int v(Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        a0(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(java.lang.Object r8, java.lang.Object r9, int r10, java.lang.Object r11, int[] r12, java.lang.Object[] r13, java.lang.Object[] r14) {
        /*
            int r0 = v(r8)
            r1 = r0 & r10
            int r2 = K(r1, r11)
            r3 = -1
            if (r2 == 0) goto L3e
            int r4 = ~r10
            r0 = r0 & r4
            r5 = r3
        L10:
            int r2 = r2 + r3
            r6 = r12[r2]
            r7 = r6 & r10
            r6 = r6 & r4
            if (r6 != r0) goto L39
            r6 = r13[r2]
            boolean r6 = r(r8, r6)
            if (r6 == 0) goto L39
            if (r14 == 0) goto L2a
            r6 = r14[r2]
            boolean r6 = r(r9, r6)
            if (r6 == 0) goto L39
        L2a:
            if (r5 != r3) goto L30
            a0(r1, r7, r11)
            return r2
        L30:
            r8 = r12[r5]
            r8 = r8 & r4
            r9 = r7 & r10
            r8 = r8 | r9
            r12[r5] = r8
            return r2
        L39:
            if (r7 == 0) goto L3e
            r5 = r2
            r2 = r7
            goto L10
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Bs.w(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static long x(long j4, long j5) {
        o("a", j4);
        o("b", j5);
        if (j4 == 0) {
            return j5;
        }
        if (j5 == 0) {
            return j4;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
        long j6 = j4 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j5);
        long j7 = j5 >> numberOfTrailingZeros2;
        while (j6 != j7) {
            long j8 = j6 - j7;
            long j9 = (j8 >> 63) & j8;
            long j10 = (j8 - j9) - j9;
            j6 = j10 >> Long.numberOfTrailingZeros(j10);
            j7 += j9;
        }
        return j6 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static Ot y(Set set, Es es) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof Ot)) {
                return new Ot(set2, es);
            }
            Ot ot = (Ot) set2;
            Es es2 = ot.f6537p;
            es2.getClass();
            return new Ot((SortedSet) ot.f6536o, new Fs(Arrays.asList(es2, es)));
        }
        if (!(set instanceof Ot)) {
            set.getClass();
            return new Ot(set, es);
        }
        Ot ot2 = (Ot) set;
        Es es3 = ot2.f6537p;
        es3.getClass();
        return new Ot(ot2.f6536o, new Fs(Arrays.asList(es3, es)));
    }

    public abstract AbstractC0417az A(AbstractC0886lz abstractC0886lz);

    public abstract void E(AbstractC1439yu abstractC1439yu, Set set);

    public abstract void Q(C1096qu c1096qu, C1096qu c1096qu2);

    public abstract void R(AbstractC0417az abstractC0417az);

    public abstract void V(C1096qu c1096qu, Thread thread);

    public abstract boolean b0(AbstractC1138ru abstractC1138ru, C0752iu c0752iu, C0752iu c0752iu2);

    public abstract int c(AbstractC1439yu abstractC1439yu);

    public abstract boolean e0(AbstractC1138ru abstractC1138ru, Object obj, Object obj2);

    public abstract C0752iu f(AbstractC1138ru abstractC1138ru);

    public abstract boolean g0(AbstractC1138ru abstractC1138ru, C1096qu c1096qu, C1096qu c1096qu2);

    public abstract AbstractC0417az i(AbstractC0417az abstractC0417az);

    public abstract Object j();

    public String toString() {
        switch (this.f4203o) {
            case 6:
                return j().toString();
            default:
                return super.toString();
        }
    }

    public abstract C1096qu z(AbstractC1138ru abstractC1138ru);
}
