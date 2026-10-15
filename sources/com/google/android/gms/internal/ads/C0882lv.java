package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.lv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882lv implements InterfaceC1313vx, PD {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9505o;

    /* renamed from: p, reason: collision with root package name */
    public Object f9506p;

    /* renamed from: q, reason: collision with root package name */
    public Object f9507q;

    /* renamed from: r, reason: collision with root package name */
    public Object f9508r;

    public /* synthetic */ C0882lv() {
        this.f9505o = 6;
        this.f9507q = null;
        this.f9508r = null;
        this.f9506p = Iv.f5759K;
    }

    public /* synthetic */ C0882lv(int i4) {
        this.f9505o = i4;
    }

    public C0882lv(Context context, C1332wF c1332wF, CF cf) {
        this.f9505o = 13;
        this.f9507q = context;
        this.f9506p = c1332wF;
    }

    public /* synthetic */ C0882lv(MediaCodec mediaCodec) {
        this.f9505o = 11;
        this.f9507q = mediaCodec;
        if (AbstractC0751is.f9071a < 21) {
            this.f9508r = mediaCodec.getInputBuffers();
            this.f9506p = mediaCodec.getOutputBuffers();
        }
    }

    public C0882lv(E e4) {
        this.f9505o = 12;
        this.f9507q = e4;
    }

    public C0882lv(C1330wD c1330wD) {
        this.f9505o = 10;
        this.f9506p = c1330wD;
        this.f9507q = new Handler(Looper.myLooper());
        this.f9508r = new C1287vD(this);
    }

    public C0882lv(C1357wy c1357wy, List list) {
        this.f9505o = 0;
        this.f9507q = c1357wy;
        this.f9508r = list;
        this.f9506p = C1227tx.f10760b;
    }

    public C0882lv(C1357wy c1357wy, List list, C1227tx c1227tx) {
        this.f9505o = 0;
        this.f9507q = c1357wy;
        this.f9508r = list;
        this.f9506p = c1227tx;
    }

    public /* synthetic */ C0882lv(ConcurrentMap concurrentMap, C1097qv c1097qv, C1227tx c1227tx, Class cls) {
        this.f9505o = 1;
        this.f9507q = concurrentMap;
        this.f9508r = c1097qv;
        this.f9506p = c1227tx;
    }

    public C0882lv(byte[] bArr) {
        this.f9505o = 8;
        Yy.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f9507q = secretKeySpec;
        if (!Bs.q(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) Uy.f7211b.f7212a.o("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] t4 = Bs.t(cipher.doFinal(new byte[16]));
        this.f9508r = t4;
        this.f9506p = Bs.t(t4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.gl, java.lang.Object, com.google.android.gms.internal.ads.zD] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.tl, java.lang.Object] */
    public C0882lv(InterfaceC0403al[] interfaceC0403alArr) {
        this.f9505o = 9;
        ?? abstractC0659gl = new AbstractC0659gl();
        byte[] bArr = AbstractC0751is.f9074f;
        abstractC0659gl.f11578k = bArr;
        abstractC0659gl.f11579l = bArr;
        ?? obj = new Object();
        obj.c = 1.0f;
        obj.d = 1.0f;
        Fk fk = Fk.f5070e;
        obj.f10724e = fk;
        obj.f10725f = fk;
        obj.f10726g = fk;
        obj.f10727h = fk;
        ByteBuffer byteBuffer = InterfaceC0403al.f8159a;
        obj.f10730k = byteBuffer;
        obj.f10731l = byteBuffer.asShortBuffer();
        obj.f10732m = byteBuffer;
        obj.f10723b = -1;
        this.f9507q = r2;
        System.arraycopy(interfaceC0403alArr, 0, r2, 0, 0);
        this.f9508r = abstractC0659gl;
        this.f9506p = obj;
        InterfaceC0403al[] interfaceC0403alArr2 = {abstractC0659gl, obj};
    }

    public static List B(C1357wy c1357wy) {
        ArrayList arrayList = new ArrayList(c1357wy.v());
        for (C1314vy c1314vy : c1357wy.A()) {
            c1314vy.getClass();
            try {
                try {
                    Bs a4 = Iw.f5771b.a(Tw.x(c1314vy.w().z(), c1314vy.w().y(), c1314vy.w().w(), c1314vy.y(), c1314vy.y() == Jy.f5945s ? null : Integer.valueOf(c1314vy.v())));
                    int D4 = c1314vy.D() - 2;
                    if (D4 != 1 && D4 != 2 && D4 != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                        break;
                    }
                    arrayList.add(new C0839kv(a4));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e4) {
                throw new RuntimeException("Creating a protokey serialization failed", e4);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static final C0882lv q(AbstractC1054pv abstractC1054pv) {
        int i4;
        HashSet hashSet;
        C1057py g4;
        char c = '\b';
        A2.o oVar = new A2.o(8);
        C0796jv c0796jv = new C0796jv(abstractC1054pv);
        c0796jv.c = C1475zn.f11658F;
        char c2 = 1;
        c0796jv.f9230a = true;
        ArrayList arrayList = (ArrayList) oVar.f36q;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((C0796jv) obj).f9230a = false;
        }
        ((ArrayList) oVar.f36q).add(c0796jv);
        if (oVar.f35p) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        oVar.f35p = true;
        ArrayList arrayList2 = (ArrayList) oVar.f36q;
        C1228ty x4 = C1357wy.x();
        int i7 = 0;
        while (i7 < arrayList2.size() - 1) {
            int i8 = i7 + 1;
            C1475zn c1475zn = ((C0796jv) arrayList2.get(i7)).c;
            C1475zn c1475zn2 = C1475zn.f11658F;
            if (c1475zn == c1475zn2 && ((C0796jv) arrayList2.get(i8)).c != c1475zn2) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i7 = i8;
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList3 = (ArrayList) oVar.f36q;
        int size2 = arrayList3.size();
        Integer num = null;
        int i9 = 0;
        while (i9 < size2) {
            Object obj2 = arrayList3.get(i9);
            i9++;
            C0796jv c0796jv2 = (C0796jv) obj2;
            c0796jv2.getClass();
            C1475zn c1475zn3 = c0796jv2.c;
            if (c1475zn3 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i10 = 3;
            if (c1475zn3 == C1475zn.f11658F) {
                i4 = i5;
                while (true) {
                    if (i4 != 0 && !hashSet2.contains(Integer.valueOf(i4))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i11 = i5;
                    while (i11 == 0) {
                        secureRandom.nextBytes(bArr);
                        i11 = ((bArr[c2] & 255) << 16) | ((bArr[i5] & 255) << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                        c = c;
                        c2 = 1;
                        i5 = 0;
                    }
                    i4 = i11;
                }
            } else {
                i4 = 0;
            }
            char c4 = c;
            Integer valueOf = Integer.valueOf(i4);
            if (hashSet2.contains(valueOf)) {
                throw new GeneralSecurityException(U.a.h(i4, "Id ", " is used twice in the keyset"));
            }
            hashSet2.add(valueOf);
            AbstractC1054pv abstractC1054pv2 = c0796jv2.f9231b;
            Object obj3 = C0753iv.f9088q;
            if (!obj3.equals(obj3)) {
                if (C0753iv.f9089r.equals(obj3)) {
                    i10 = 4;
                } else {
                    if (!C0753iv.f9090s.equals(obj3)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i10 = 5;
                }
            }
            Uw uw = (Uw) (abstractC1054pv2 instanceof Bw ? ((Bw) abstractC1054pv2).f4209a : Iw.f5771b.b(abstractC1054pv2));
            C1142ry c1142ry = uw.f7210b;
            AtomicReference atomicReference = AbstractC1311vv.f11094a;
            synchronized (AbstractC1311vv.class) {
                AtomicReference atomicReference2 = AbstractC1311vv.f11094a;
                AbstractC1441yw abstractC1441yw = ((C1226tw) atomicReference2.get()).b(c1142ry.A()).f10653a;
                hashSet = hashSet2;
                Xj xj = new Xj(abstractC1441yw, abstractC1441yw.c);
                if (!((Boolean) ((C1226tw) atomicReference2.get()).f10759b.get(c1142ry.A())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(c1142ry.A())));
                }
                g4 = xj.g(c1142ry.z());
            }
            C1271uy x5 = C1314vy.x();
            x5.d();
            ((C1314vy) x5.f4561p).zzg = i4;
            x5.d();
            C1314vy.E((C1314vy) x5.f4561p, i10);
            x5.d();
            C1314vy.z((C1314vy) x5.f4561p, g4);
            Jy y = uw.f7210b.y();
            x5.d();
            ((C1314vy) x5.f4561p).zzh = y.a();
            C1314vy c1314vy = (C1314vy) x5.b();
            x4.d();
            C1357wy.C((C1357wy) x4.f4561p, c1314vy);
            if (!c0796jv2.f9230a) {
                c = c4;
            } else {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                c = c4;
                num = valueOf;
            }
            hashSet2 = hashSet;
            c2 = 1;
            i5 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        int intValue = num.intValue();
        x4.d();
        C1357wy.B((C1357wy) x4.f4561p, intValue);
        C1357wy c1357wy = (C1357wy) x4.b();
        C1227tx c1227tx = (C1227tx) oVar.f37r;
        if (c1357wy.v() > 0) {
            return new C0882lv(c1357wy, B(c1357wy), c1227tx);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public List A(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.f9507q).get(new C1139rv(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.ads.PD
    public void a(int i4) {
        ((MediaCodec) this.f9507q).setVideoScalingMode(i4);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public int b() {
        return ((MediaCodec) this.f9507q).dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public void c(int i4, boolean z4) {
        ((MediaCodec) this.f9507q).releaseOutputBuffer(i4, z4);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public ByteBuffer d(int i4) {
        return AbstractC0751is.f9071a >= 21 ? ((MediaCodec) this.f9507q).getInputBuffer(i4) : ((ByteBuffer[]) this.f9508r)[i4];
    }

    @Override // com.google.android.gms.internal.ads.PD
    public MediaFormat e() {
        return ((MediaCodec) this.f9507q).getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public void f(Bundle bundle) {
        ((MediaCodec) this.f9507q).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public void g() {
        ((MediaCodec) this.f9507q).flush();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1313vx
    public byte[] h(int i4, byte[] bArr) {
        byte[] Y4;
        if (i4 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKeySpec secretKeySpec = (SecretKeySpec) this.f9507q;
        if (!Bs.q(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) Uy.f7211b.f7212a.o("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        int length = bArr.length;
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        int i5 = max - 1;
        int i6 = i5 * 16;
        if (max * 16 == length) {
            Y4 = Bs.Y(bArr, i6, (byte[]) this.f9508r, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i6, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = Byte.MIN_VALUE;
            byte[] bArr2 = (byte[]) this.f9506p;
            int length3 = copyOf.length;
            if (length3 != bArr2.length) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            Y4 = Bs.Y(copyOf, 0, bArr2, 0, length3);
        }
        byte[] bArr3 = new byte[16];
        for (int i7 = 0; i7 < i5; i7++) {
            bArr3 = cipher.doFinal(Bs.Y(bArr3, 0, bArr, i7 * 16, 16));
        }
        int length4 = Y4.length;
        if (length4 == bArr3.length) {
            return Arrays.copyOf(cipher.doFinal(Bs.Y(Y4, 0, bArr3, 0, length4)), i4);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    @Override // com.google.android.gms.internal.ads.PD
    public void i(int i4, int i5, int i6, long j4) {
        ((MediaCodec) this.f9507q).queueInputBuffer(i4, 0, i5, j4, i6);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public void j(Surface surface) {
        ((MediaCodec) this.f9507q).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public int k(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        MediaCodec mediaCodec = (MediaCodec) this.f9507q;
        do {
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (AbstractC0751is.f9071a < 21) {
                    this.f9506p = mediaCodec.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.PD
    public void l() {
        this.f9508r = null;
        this.f9506p = null;
        ((MediaCodec) this.f9507q).release();
    }

    @Override // com.google.android.gms.internal.ads.PD
    public void m(int i4, long j4) {
        ((MediaCodec) this.f9507q).releaseOutputBuffer(i4, j4);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public void n(int i4, PB pb, long j4) {
        ((MediaCodec) this.f9507q).queueSecureInputBuffer(i4, 0, pb.f6578i, j4, 0);
    }

    public void o(int i4) {
        if (i4 != 16 && i4 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i4 * 8)));
        }
        this.f9507q = Integer.valueOf(i4);
    }

    public void p(int i4) {
        if (i4 < 10 || i4 > 16) {
            throw new GeneralSecurityException(U.a.i("Invalid tag size for AesCmacParameters: ", i4));
        }
        this.f9508r = Integer.valueOf(i4);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [com.google.android.gms.internal.ads.Bs, com.google.android.gms.internal.ads.Mv] */
    public Mv r() {
        Xj xj;
        Ov ov = (Ov) this.f9507q;
        if (ov == null || (xj = (Xj) this.f9508r) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ov.f6538a != ((Zy) xj.f7687p).f8067a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ov.a() && ((Integer) this.f9506p) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((Ov) this.f9507q).a() && ((Integer) this.f9506p) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        Iv iv = ((Ov) this.f9507q).c;
        if (iv == Iv.f5767x) {
            Zy.a(new byte[0]);
        } else if (iv == Iv.f5766w) {
            Zy.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9506p).intValue()).array());
        } else {
            if (iv != Iv.f5765v) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(((Ov) this.f9507q).c)));
            }
            Zy.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9506p).intValue()).array());
        }
        return new Bs(20);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [com.google.android.gms.internal.ads.Qv, com.google.android.gms.internal.ads.Bs] */
    public Qv s() {
        Xj xj;
        Rv rv = (Rv) this.f9507q;
        if (rv == null || (xj = (Xj) this.f9508r) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (rv.f6866a != ((Zy) xj.f7687p).f8067a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (rv.a() && ((Integer) this.f9506p) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((Rv) this.f9507q).a() && ((Integer) this.f9506p) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C0753iv c0753iv = ((Rv) this.f9507q).f6867b;
        if (c0753iv == C0753iv.y) {
            Zy.a(new byte[0]);
        } else if (c0753iv == C0753iv.f9095x) {
            Zy.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9506p).intValue()).array());
        } else {
            if (c0753iv != C0753iv.f9094w) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(((Rv) this.f9507q).f6867b)));
            }
            Zy.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9506p).intValue()).array());
        }
        return new Bs(20);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [com.google.android.gms.internal.ads.Bs, com.google.android.gms.internal.ads.Tv] */
    public Tv t() {
        Xj xj;
        Uv uv = (Uv) this.f9507q;
        if (uv == null || (xj = (Xj) this.f9508r) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (uv.f7207a != ((Zy) xj.f7687p).f8067a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (uv.a() && ((Integer) this.f9506p) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((Uv) this.f9507q).a() && ((Integer) this.f9506p) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        Iv iv = ((Uv) this.f9507q).f7208b;
        if (iv == Iv.f5749A) {
            Zy.a(new byte[0]);
        } else if (iv == Iv.f5768z) {
            Zy.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9506p).intValue()).array());
        } else {
            if (iv != Iv.y) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(((Uv) this.f9507q).f7208b)));
            }
            Zy.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9506p).intValue()).array());
        }
        return new Bs(20);
    }

    public String toString() {
        switch (this.f9505o) {
            case 0:
                int i4 = AbstractC1397xv.f11310a;
                C1357wy c1357wy = (C1357wy) this.f9507q;
                C1400xy v4 = Ay.v();
                int w2 = c1357wy.w();
                v4.d();
                ((Ay) v4.f4561p).zzd = w2;
                for (C1314vy c1314vy : c1357wy.A()) {
                    C1443yy v5 = C1486zy.v();
                    String z4 = c1314vy.w().z();
                    v5.d();
                    C1486zy.w((C1486zy) v5.f4561p, z4);
                    int D4 = c1314vy.D();
                    v5.d();
                    C1486zy.z((C1486zy) v5.f4561p, D4);
                    Jy y = c1314vy.y();
                    v5.d();
                    ((C1486zy) v5.f4561p).zzg = y.a();
                    int v6 = c1314vy.v();
                    v5.d();
                    ((C1486zy) v5.f4561p).zzf = v6;
                    C1486zy c1486zy = (C1486zy) v5.b();
                    v4.d();
                    Ay.x((Ay) v4.f4561p, c1486zy);
                }
                return ((Ay) v4.b()).toString();
            default:
                return super.toString();
        }
    }

    public C0458bx u() {
        Xj xj;
        Zy a4;
        C0542dx c0542dx = (C0542dx) this.f9507q;
        if (c0542dx == null || (xj = (Xj) this.f9508r) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c0542dx.f8527a != ((Zy) xj.f7687p).f8067a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c0542dx.a() && ((Integer) this.f9506p) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C0542dx) this.f9507q).a() && ((Integer) this.f9506p) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        Iv iv = ((C0542dx) this.f9507q).c;
        if (iv == Iv.f5759K) {
            a4 = Zy.a(new byte[0]);
        } else if (iv == Iv.f5758J || iv == Iv.f5757I) {
            a4 = Zy.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9506p).intValue()).array());
        } else {
            if (iv != Iv.f5756H) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(((C0542dx) this.f9507q).c)));
            }
            a4 = Zy.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9506p).intValue()).array());
        }
        return new C0458bx((C0542dx) this.f9507q, (Xj) this.f9508r, a4);
    }

    @Override // com.google.android.gms.internal.ads.PD
    public ByteBuffer v(int i4) {
        return AbstractC0751is.f9071a >= 21 ? ((MediaCodec) this.f9507q).getOutputBuffer(i4) : ((ByteBuffer[]) this.f9506p)[i4];
    }

    public C0542dx w() {
        Integer num = (Integer) this.f9507q;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f9508r) != null) {
            return new C0542dx(num.intValue(), ((Integer) this.f9508r).intValue(), (Iv) this.f9506p);
        }
        throw new GeneralSecurityException("tag size not set");
    }

    public C0671gx x() {
        Xj xj;
        Zy a4;
        C0841kx c0841kx = (C0841kx) this.f9507q;
        if (c0841kx == null || (xj = (Xj) this.f9508r) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c0841kx.f9336a != ((Zy) xj.f7687p).f8067a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c0841kx.a() && ((Integer) this.f9506p) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C0841kx) this.f9507q).a() && ((Integer) this.f9506p) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C0798jx c0798jx = ((C0841kx) this.f9507q).c;
        if (c0798jx == C0798jx.f9234e) {
            a4 = Zy.a(new byte[0]);
        } else if (c0798jx == C0798jx.d || c0798jx == C0798jx.c) {
            a4 = Zy.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9506p).intValue()).array());
        } else {
            if (c0798jx != C0798jx.f9233b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(((C0841kx) this.f9507q).c)));
            }
            a4 = Zy.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9506p).intValue()).array());
        }
        return new C0671gx((C0841kx) this.f9507q, (Xj) this.f9508r, a4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0041, code lost:
    
        if (r1.f11100r != r11) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0045, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006a, code lost:
    
        if (r1.f11100r != r11) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(com.google.android.gms.internal.ads.Px r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.GE r15) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.w r1 = new com.google.android.gms.internal.ads.w
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.f9506p = r1
            java.lang.Object r8 = r7.f9508r
            com.google.android.gms.internal.ads.B r8 = (com.google.android.gms.internal.ads.B) r8
            if (r8 == 0) goto L11
            return
        L11:
            java.lang.Object r8 = r7.f9507q
            com.google.android.gms.internal.ads.E r8 = (com.google.android.gms.internal.ads.E) r8
            com.google.android.gms.internal.ads.B[] r8 = r8.c(r9, r10)
            int r9 = r8.length
            r10 = 1
            r11 = 0
            if (r9 != r10) goto L24
            r8 = r8[r11]
            r7.f9508r = r8
            goto Lab
        L24:
            r12 = r11
        L25:
            if (r12 >= r9) goto L70
            r13 = r8[r12]
            boolean r14 = r13.d(r1)     // Catch: java.lang.Throwable -> L34 java.io.EOFException -> L60
            if (r14 == 0) goto L37
            r7.f9508r = r13     // Catch: java.lang.Throwable -> L34 java.io.EOFException -> L60
            r1.f11102t = r11
            goto L70
        L34:
            r0 = move-exception
            r8 = r0
            goto L4c
        L37:
            java.lang.Object r13 = r7.f9508r
            com.google.android.gms.internal.ads.B r13 = (com.google.android.gms.internal.ads.B) r13
            if (r13 != 0) goto L43
            long r13 = r1.f11100r
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 != 0) goto L45
        L43:
            r13 = r10
            goto L46
        L45:
            r13 = r11
        L46:
            com.google.android.gms.internal.ads.Zf.X(r13)
            r1.f11102t = r11
            goto L6d
        L4c:
            java.lang.Object r9 = r7.f9508r
            com.google.android.gms.internal.ads.B r9 = (com.google.android.gms.internal.ads.B) r9
            if (r9 != 0) goto L5a
            long r12 = r1.f11100r
            int r9 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r9 != 0) goto L59
            goto L5a
        L59:
            r10 = r11
        L5a:
            com.google.android.gms.internal.ads.Zf.X(r10)
            r1.f11102t = r11
            throw r8
        L60:
            java.lang.Object r13 = r7.f9508r
            com.google.android.gms.internal.ads.B r13 = (com.google.android.gms.internal.ads.B) r13
            if (r13 != 0) goto L43
            long r13 = r1.f11100r
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 != 0) goto L45
            goto L43
        L6d:
            int r12 = r12 + 1
            goto L25
        L70:
            java.lang.Object r9 = r7.f9508r
            com.google.android.gms.internal.ads.B r9 = (com.google.android.gms.internal.ads.B) r9
            if (r9 != 0) goto Lab
            com.google.android.gms.internal.ads.o0 r9 = new com.google.android.gms.internal.ads.o0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r13 = r11
        L7e:
            int r14 = r8.length
            if (r13 >= r14) goto L9a
            r15 = r8[r13]
            java.lang.Class r15 = r15.getClass()
            java.lang.String r15 = r15.getSimpleName()
            r12.append(r15)
            int r14 = r14 + (-1)
            if (r13 >= r14) goto L97
            java.lang.String r14 = ", "
            r12.append(r14)
        L97:
            int r13 = r13 + 1
            goto L7e
        L9a:
            java.lang.String r8 = r12.toString()
            java.lang.String r12 = "None of the available extractors ("
            java.lang.String r13 = ") could read the stream."
            java.lang.String r8 = U.a.k(r12, r8, r13)
            r12 = 0
            r9.<init>(r8, r12, r11, r10)
            throw r9
        Lab:
            java.lang.Object r8 = r7.f9508r
            com.google.android.gms.internal.ads.B r8 = (com.google.android.gms.internal.ads.B) r8
            r8.g(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0882lv.y(com.google.android.gms.internal.ads.Px, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.GE):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z() {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0882lv.z():java.lang.Object");
    }
}
