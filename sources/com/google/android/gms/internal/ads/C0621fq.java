package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import l2.AbstractC1799b;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fq */
/* loaded from: classes.dex */
public final class C0621fq implements InterfaceC0570ei, InterfaceC1313vx {

    /* renamed from: s */
    public static C0621fq f8745s;

    /* renamed from: o */
    public int f8746o;

    /* renamed from: p */
    public final Object f8747p;

    /* renamed from: q */
    public final Object f8748q;

    /* renamed from: r */
    public Object f8749r;

    public C0621fq(Context context) {
        this.f8747p = new Handler(Looper.getMainLooper());
        this.f8748q = new CopyOnWriteArrayList();
        this.f8749r = new Object();
        this.f8746o = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new Q1.E(4, this), intentFilter);
    }

    public C0621fq(Context context, int i4) {
        this.f8749r = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        Zf.p(dir, false);
        this.f8747p = dir;
        File dir2 = context.getDir("tmppccache", 0);
        Zf.p(dir2, true);
        this.f8748q = dir2;
        this.f8746o = i4;
    }

    public C0621fq(InterfaceC1399xx interfaceC1399xx, RC rc) {
        UC uc = new UC(12);
        this.f8747p = interfaceC1399xx;
        this.f8748q = rc;
        this.f8749r = uc;
        this.f8746o = 1048576;
    }

    public C0621fq(C1434yp c1434yp, V9 v9, int i4) {
        this.f8749r = null;
        this.f8747p = c1434yp;
        this.f8748q = v9;
        this.f8746o = i4;
    }

    public C0621fq(String str, SecretKeySpec secretKeySpec) {
        int i4;
        Wy wy = new Wy(this);
        this.f8747p = wy;
        if (!Bs.q(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f8748q = str;
        this.f8749r = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    i4 = 20;
                    this.f8746o = i4;
                    wy.get();
                    return;
                }
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    i4 = 28;
                    this.f8746o = i4;
                    wy.get();
                    return;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    i4 = 32;
                    this.f8746o = i4;
                    wy.get();
                    return;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    i4 = 48;
                    this.f8746o = i4;
                    wy.get();
                    return;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    i4 = 64;
                    this.f8746o = i4;
                    wy.get();
                    return;
                }
                break;
        }
        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
    }

    public static synchronized C0621fq d(Context context) {
        C0621fq c0621fq;
        synchronized (C0621fq.class) {
            try {
                if (f8745s == null) {
                    f8745s = new C0621fq(context);
                }
                c0621fq = f8745s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0621fq;
    }

    public static /* synthetic */ void e(C0621fq c0621fq, int i4) {
        synchronized (c0621fq.f8749r) {
            try {
                if (c0621fq.f8746o == i4) {
                    return;
                }
                c0621fq.f8746o = i4;
                Iterator it = ((CopyOnWriteArrayList) c0621fq.f8748q).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C1032pF c1032pF = (C1032pF) weakReference.get();
                    if (c1032pF != null) {
                        C1075qF.b(c1032pF.f9966a, i4);
                    } else {
                        ((CopyOnWriteArrayList) c0621fq.f8748q).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int a() {
        int i4;
        synchronized (this.f8749r) {
            i4 = this.f8746o;
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (r11 == false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(com.google.android.gms.internal.ads.C0978o4 r10, com.google.android.gms.internal.ads.C1016p r11) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0621fq.b(com.google.android.gms.internal.ads.o4, com.google.android.gms.internal.ads.p):boolean");
    }

    public C1064q4 c(int i4) {
        String string;
        int i5 = this.f8746o;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f8749r;
        if (i4 == 1) {
            StringBuilder sb = new StringBuilder("LATMTD");
            sb.append(i5 - 1);
            string = sharedPreferences.getString(sb.toString(), null);
        } else {
            StringBuilder sb2 = new StringBuilder("FBAMTD");
            sb2.append(i5 - 1);
            string = sharedPreferences.getString(sb2.toString(), null);
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] k3 = AbstractC1799b.k(string);
                C1064q4 A3 = C1064q4.A(AbstractC0886lz.A(k3, 0, k3.length));
                String D4 = A3.D();
                File w2 = Zf.w(D4, "pcam.jar", f());
                if (!w2.exists()) {
                    w2 = Zf.w(D4, "pcam", f());
                }
                File w4 = Zf.w(D4, "pcbc", f());
                if (w2.exists()) {
                    if (w4.exists()) {
                        return A3;
                    }
                }
            } catch (Oz unused) {
            }
        }
        return null;
    }

    public File f() {
        File file = new File((File) this.f8747p, Integer.toString(this.f8746o - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1313vx
    public byte[] h(int i4, byte[] bArr) {
        Wy wy = (Wy) this.f8747p;
        if (i4 > this.f8746o) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) wy.get()).update(bArr);
        return Arrays.copyOf(((Mac) wy.get()).doFinal(), i4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570ei
    public void j(boolean z4, Context context, Og og) {
        boolean X4;
        V9 v9 = (V9) this.f8748q;
        try {
            int b4 = Z.e.b(this.f8746o);
            if (b4 == 1) {
                X4 = v9.X(new BinderC1813b(context));
            } else {
                if (b4 != 2) {
                    if (b4 == 6) {
                        X4 = v9.f0(new BinderC1813b(context));
                    }
                    throw new Exception("Adapter failed to show.");
                }
                X4 = v9.w2(new BinderC1813b(context));
            }
            if (X4) {
                if (((Qg) this.f8749r) == null) {
                    return;
                }
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10241j1)).booleanValue() || ((C1434yp) this.f8747p).f11498Y != 2) {
                    return;
                }
                ((Qg) this.f8749r).b();
                return;
            }
            throw new Exception("Adapter failed to show.");
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }
}
