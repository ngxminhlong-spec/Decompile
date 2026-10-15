package com.google.android.gms.internal.ads;

import O1.InterfaceC0051a;
import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.internal.measurement.C1509e0;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class BF implements InterfaceC1359x, InterfaceC0277Gc, InterfaceC0513d9, InterfaceC0346Ub, E, Bh {

    /* renamed from: s, reason: collision with root package name */
    public static Cipher f4074s;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4081o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ BF f4071p = new BF(1);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ BF f4072q = new BF(2);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ BF f4073r = new BF(3);

    /* renamed from: t, reason: collision with root package name */
    public static final Object f4075t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static final Object f4076u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ BF f4077v = new BF(5);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ BF f4078w = new BF(6);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ BF f4079x = new BF(7);
    public static final /* synthetic */ BF y = new BF(8);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ BF f4080z = new BF(9);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ BF f4052A = new BF(10);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ BF f4053B = new BF(11);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ BF f4054C = new BF(12);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ BF f4055D = new BF(13);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ BF f4056E = new BF(14);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ BF f4057F = new BF(15);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ BF f4058G = new BF(16);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ BF f4059H = new BF(17);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ BF f4060I = new BF(18);

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ BF f4061J = new BF(19);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ BF f4062K = new BF(20);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ BF f4063L = new BF(21);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ BF f4064M = new BF(22);
    public static final /* synthetic */ BF N = new BF(23);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ BF f4065O = new BF(24);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ BF f4066P = new BF(25);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ BF f4067Q = new BF(26);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ BF f4068R = new BF(27);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ BF f4069S = new BF(28);

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ BF f4070T = new BF(29);

    public /* synthetic */ BF(int i4) {
        this.f4081o = i4;
    }

    public static String d(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f4075t) {
                g().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = g().doFinal(bArr2);
                iv = g().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e4) {
            throw new Exception(e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new Exception(e5);
        } catch (BadPaddingException e6) {
            throw new Exception(e6);
        } catch (IllegalBlockSizeException e7) {
            throw new Exception(e7);
        } catch (NoSuchPaddingException e8) {
            throw new Exception(e8);
        }
    }

    public static byte[] e(String str, byte[] bArr) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] decode = Base64.decode(str, 2);
            if (decode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = decode.length;
            if (length2 <= 16) {
                throw new Exception();
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(decode);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f4075t) {
                g().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = g().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e4) {
            throw new Exception(e4);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new Exception(e5);
        } catch (InvalidKeyException e6) {
            throw new Exception(e6);
        } catch (NoSuchAlgorithmException e7) {
            throw new Exception(e7);
        } catch (BadPaddingException e8) {
            throw new Exception(e8);
        } catch (IllegalBlockSizeException e9) {
            throw new Exception(e9);
        } catch (NoSuchPaddingException e10) {
            throw new Exception(e10);
        }
    }

    public static final Cipher g() {
        Cipher cipher;
        synchronized (f4076u) {
            try {
                if (f4074s == null) {
                    f4074s = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f4074s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0346Ub
    public Object a(InterfaceC0609fe interfaceC0609fe) {
        switch (this.f4081o) {
            case 8:
                BinderC0854l9 binderC0854l9 = (BinderC0854l9) interfaceC0609fe;
                C1509e0 c1509e0 = (C1509e0) binderC0854l9.f9378o.f13386p;
                com.google.android.gms.internal.measurement.D d = new com.google.android.gms.internal.measurement.D();
                c1509e0.b(new com.google.android.gms.internal.measurement.X(c1509e0, d, 3));
                String str = (String) com.google.android.gms.internal.measurement.D.a0(d.Q(500L), String.class);
                if (str != null) {
                    return str;
                }
                C1509e0 c1509e02 = (C1509e0) binderC0854l9.f9378o.f13386p;
                com.google.android.gms.internal.measurement.D d4 = new com.google.android.gms.internal.measurement.D();
                c1509e02.b(new com.google.android.gms.internal.measurement.X(c1509e02, d4, 4));
                String str2 = (String) com.google.android.gms.internal.measurement.D.a0(d4.Q(500L), String.class);
                return str2 != null ? str2 : "";
            case 9:
                return ((C1509e0) ((BinderC0854l9) interfaceC0609fe).f9378o.f13386p).f11910e;
            default:
                C1509e0 c1509e03 = (C1509e0) ((BinderC0854l9) interfaceC0609fe).f9378o.f13386p;
                com.google.android.gms.internal.measurement.D d5 = new com.google.android.gms.internal.measurement.D();
                c1509e03.b(new com.google.android.gms.internal.measurement.X(c1509e03, d5, 0));
                return (String) com.google.android.gms.internal.measurement.D.a0(d5.Q(500L), String.class);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1359x
    public Constructor b() {
        switch (this.f4081o) {
            case 1:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(B.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(B.class).getConstructor(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0277Gc
    /* renamed from: b, reason: collision with other method in class */
    public void mo1b() {
    }

    @Override // com.google.android.gms.internal.ads.E
    public /* synthetic */ B[] c(Uri uri, Map map) {
        switch (this.f4081o) {
            case 11:
                AtomicInteger atomicInteger = C0273Fd.f5018I;
                return new B[]{new C1018p1(), new S0()};
            default:
                AtomicInteger atomicInteger2 = C0273Fd.f5018I;
                return new B[]{new C1018p1(), new S0(), new C0889m1()};
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0513d9
    public Object f(JSONObject jSONObject) {
        Charset charset = AbstractC0598f9.f8689a;
        return new ByteArrayInputStream(jSONObject.toString().getBytes(AbstractC0598f9.f8689a));
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        switch (this.f4081o) {
            case 13:
                ((InterfaceC0051a) obj).D();
                return;
            case 14:
                ((Mg) obj).c();
                return;
            case 15:
                ((Pg) obj).r(Zf.L(11, null, null));
                return;
            case 16:
                ((Sg) obj).p();
                return;
            case 17:
                ((Ig) obj).b();
                return;
            case 18:
                ((Ig) obj).c();
                return;
            case 19:
                ((Ig) obj).e();
                return;
            case 20:
                ((Ig) obj).d();
                return;
            case 21:
                ((Ig) obj).a();
                return;
            case 22:
                ((Yg) obj).M();
                return;
            case 23:
                ((Y1.a) obj).l();
                return;
            case 24:
                ((InterfaceC0612fh) obj).h();
                return;
            case 25:
                ((P1.g) obj).a0();
                return;
            case 26:
                ((P1.g) obj).q1();
                return;
            case 27:
                ((P1.g) obj).y3();
                return;
            case 28:
                ((P1.g) obj).O();
                return;
            default:
                ((P1.g) obj).W2();
                return;
        }
    }
}
