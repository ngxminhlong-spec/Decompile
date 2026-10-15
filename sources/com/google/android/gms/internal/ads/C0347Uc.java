package com.google.android.gms.internal.ads;

import O1.C0081p;
import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import android.webkit.WebView;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.measurement.C1510e1;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Uc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347Uc implements Mu, Bh, InterfaceC0555e9, Cu, Iz, Ls, Ks, InterfaceC1132ro {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7164o;

    public C0347Uc(int i4) {
        this.f7164o = 15;
    }

    public /* synthetic */ C0347Uc(int i4, byte b4) {
        this.f7164o = i4;
    }

    public /* synthetic */ C0347Uc(int i4, int i5) {
        this.f7164o = 29;
    }

    public /* synthetic */ C0347Uc(int i4, Object obj) {
        this.f7164o = i4;
    }

    public /* synthetic */ C0347Uc(Z9 z9, int i4) {
        this.f7164o = 27;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r14[r12] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r14[r12] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r14[r12] <= (-65)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(int r11, int r12, int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0347Uc.a(int, int, int, byte[]):int");
    }

    public static final C0348Ud c(Context context, C0887m c0887m, String str, boolean z4, boolean z5, I3 i32, A6 a6, C0248Bc c0248Bc, C1384xi c1384xi, C1510e1 c1510e1, C0764j5 c0764j5, C1434yp c1434yp, Ap ap, BinderC0489cm binderC0489cm) {
        AbstractC1066q6.a(context);
        try {
            com.google.ads.mediation.a aVar = new com.google.ads.mediation.a(context, c0887m, str, z4, z5, i32, a6, c0248Bc, c1384xi, c1510e1, c0764j5, c1434yp, ap, binderC0489cm);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object b4 = aVar.b();
                StrictMode.setThreadPolicy(threadPolicy);
                return (C0348Ud) b4;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new Exception("Webview initialization failed.", th2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.fm] */
    public static Pq e(final int i4, final int i5, final WebView webView, final String str, final String str2, final String str3) {
        Object obj = null;
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.r4)).booleanValue() || !Wj.f7528E.f7724p) {
            return null;
        }
        try {
            obj = new Object() { // from class: com.google.android.gms.internal.ads.fm
                public final Object a() {
                    if (TextUtils.isEmpty("Google")) {
                        throw new IllegalArgumentException("Name is null or empty");
                    }
                    String str4 = str;
                    if (TextUtils.isEmpty(str4)) {
                        throw new IllegalArgumentException("Version is null or empty");
                    }
                    Gh gh = new Gh("Google", str4);
                    Vq q4 = C0347Uc.q("javascript");
                    int i6 = i5;
                    Sq o4 = C0347Uc.o(U.a.a(i6));
                    Vq vq = Vq.f7298r;
                    if (q4 == vq) {
                        Y9.s("Omid html session error; Unable to parse impression owner: javascript");
                        return null;
                    }
                    if (o4 == null) {
                        Y9.s("Omid html session error; Unable to parse creative type: ".concat(U.a.w(i6)));
                        return null;
                    }
                    String str5 = str2;
                    Vq q5 = C0347Uc.q(str5);
                    if (o4 == Sq.f7014s && q5 == vq) {
                        Y9.s("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str5)));
                        return null;
                    }
                    l.J0 j02 = new l.J0(gh, webView, str3, Qq.f6702p);
                    u0.g p3 = u0.g.p(o4, C0347Uc.p(U.a.b(i4)), q4, q5);
                    if (Wj.f7528E.f7724p) {
                        return new Rq(p3, j02);
                    }
                    throw new IllegalStateException("Method called before OM SDK activation");
                }
            }.a();
        } catch (RuntimeException e4) {
            N1.n.f1204A.f1209g.g("omid exception", e4);
        }
        return (Pq) obj;
    }

    private final void g(Throwable th) {
    }

    private final void h(Throwable th) {
    }

    public static String i(byte[] bArr, int i4, int i5) {
        int i6;
        int length = bArr.length;
        if ((((length - i4) - i5) | i4 | i5) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        int i7 = i4 + i5;
        char[] cArr = new char[i5];
        int i8 = 0;
        while (i4 < i7) {
            byte b4 = bArr[i4];
            if (b4 < 0) {
                break;
            }
            i4++;
            cArr[i8] = (char) b4;
            i8++;
        }
        int i9 = i8;
        while (i4 < i7) {
            int i10 = i4 + 1;
            byte b5 = bArr[i4];
            if (b5 >= 0) {
                cArr[i9] = (char) b5;
                i9++;
                i4 = i10;
                while (i4 < i7) {
                    byte b6 = bArr[i4];
                    if (b6 >= 0) {
                        i4++;
                        cArr[i9] = (char) b6;
                        i9++;
                    }
                }
            } else {
                if (b5 < -32) {
                    if (i10 >= i7) {
                        throw Oz.b();
                    }
                    i6 = i9 + 1;
                    i4 += 2;
                    AbstractC0587ez.o(b5, bArr[i10], cArr, i9);
                } else if (b5 < -16) {
                    if (i10 >= i7 - 1) {
                        throw Oz.b();
                    }
                    i6 = i9 + 1;
                    int i11 = i4 + 2;
                    i4 += 3;
                    AbstractC0587ez.m(b5, bArr[i10], bArr[i11], cArr, i9);
                } else {
                    if (i10 >= i7 - 2) {
                        throw Oz.b();
                    }
                    byte b7 = bArr[i10];
                    int i12 = i4 + 3;
                    byte b8 = bArr[i4 + 2];
                    i4 += 4;
                    AbstractC0587ez.e(b5, b7, b8, bArr[i12], cArr, i9);
                    i9 += 2;
                }
                i9 = i6;
            }
        }
        return new String(cArr, 0, i9);
    }

    public static boolean j(byte[] bArr, int i4, int i5) {
        return a(0, i4, i5, bArr) == 0;
    }

    public static final String k(ByteBuffer byteBuffer, int i4, int i5) {
        int i6;
        if ((((byteBuffer.limit() - i4) - i5) | i4 | i5) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        int i7 = i4 + i5;
        char[] cArr = new char[i5];
        int i8 = 0;
        while (i4 < i7) {
            byte b4 = byteBuffer.get(i4);
            if (b4 < 0) {
                break;
            }
            i4++;
            cArr[i8] = (char) b4;
            i8++;
        }
        int i9 = i8;
        while (i4 < i7) {
            int i10 = i4 + 1;
            byte b5 = byteBuffer.get(i4);
            if (b5 >= 0) {
                cArr[i9] = (char) b5;
                i9++;
                i4 = i10;
                while (i4 < i7) {
                    byte b6 = byteBuffer.get(i4);
                    if (b6 >= 0) {
                        i4++;
                        cArr[i9] = (char) b6;
                        i9++;
                    }
                }
            } else {
                if (b5 < -32) {
                    if (i10 >= i7) {
                        throw Oz.b();
                    }
                    i6 = i9 + 1;
                    i4 += 2;
                    AbstractC0587ez.o(b5, byteBuffer.get(i10), cArr, i9);
                } else if (b5 < -16) {
                    if (i10 >= i7 - 1) {
                        throw Oz.b();
                    }
                    i6 = i9 + 1;
                    int i11 = i4 + 2;
                    i4 += 3;
                    AbstractC0587ez.m(b5, byteBuffer.get(i10), byteBuffer.get(i11), cArr, i9);
                } else {
                    if (i10 >= i7 - 2) {
                        throw Oz.b();
                    }
                    byte b7 = byteBuffer.get(i10);
                    int i12 = i4 + 3;
                    byte b8 = byteBuffer.get(i4 + 2);
                    i4 += 4;
                    AbstractC0587ez.e(b5, b7, b8, byteBuffer.get(i12), cArr, i9);
                    i9 += 2;
                }
                i9 = i6;
            }
        }
        return new String(cArr, 0, i9);
    }

    public static void m(Pq pq) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r4)).booleanValue() && Wj.f7528E.f7724p) {
            pq.getClass();
            s(new RunnableC0338Sd(pq, 1));
        }
    }

    public static boolean n(Context context) {
        Object obj;
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.r4)).booleanValue()) {
            Y9.s("Omid flag is disabled");
            return false;
        }
        try {
            obj = new C0894m6(context, 4).b();
        } catch (RuntimeException e4) {
            N1.n.f1204A.f1209g.g("omid exception", e4);
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        return bool != null && bool.booleanValue();
    }

    public static Sq o(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return Sq.f7012q;
            }
            return null;
        }
        if (hashCode == 112202875) {
            if (str.equals("video")) {
                return Sq.f7014s;
            }
            return null;
        }
        if (hashCode == 714893483 && str.equals("nativeDisplay")) {
            return Sq.f7013r;
        }
        return null;
    }

    public static Uq p(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1104128070) {
            if (hashCode != 1318088141) {
                if (hashCode == 1988248512 && str.equals("onePixel")) {
                    return Uq.f7199s;
                }
            } else if (str.equals("definedByJavascript")) {
                return Uq.f7196p;
            }
        } else if (str.equals("beginToRender")) {
            return Uq.f7198r;
        }
        return Uq.f7197q;
    }

    public static Vq q(String str) {
        return "native".equals(str) ? Vq.f7296p : "javascript".equals(str) ? Vq.f7297q : Vq.f7298r;
    }

    public static final void s(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e4) {
            N1.n.f1204A.f1209g.g("omid exception", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.Cu
    /* renamed from: b */
    public InterfaceFutureC0239a mo0b() {
        return Pu.f6608p;
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public Object b() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.Ks
    public Iterator d(C1384xi c1384xi, CharSequence charSequence) {
        return new Js(c1384xi, charSequence);
    }

    public /* bridge */ Object f(String str, Provider provider) {
        switch (this.f7164o) {
            case 16:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 17:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 18:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 19:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 20:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case 21:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        switch (this.f7164o) {
            case 4:
                ((Ih) obj).o("MalformedJson");
                return;
            case 25:
                VC vc = (VC) obj;
                vc.e(vc.b(), 13, new C0558eC(8));
                return;
            case 26:
                VC vc2 = (VC) obj;
                int i4 = C0857lC.f9381k0;
                vc2.e(vc2.j(), 22, new C0558eC(12));
                return;
            case 27:
                VC vc3 = (VC) obj;
                int i5 = C0857lC.f9381k0;
                vc3.e(vc3.b(), 1, new C0558eC(10));
                return;
            case 28:
                VC vc4 = (VC) obj;
                int i6 = C0857lC.f9381k0;
                vc4.e(vc4.b(), 14, new UC(5));
                return;
            default:
                VC vc5 = (VC) obj;
                int i7 = C0857lC.f9381k0;
                vc5.e(vc5.j(), 24, new UC(6));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0555e9
    public JSONObject r(Object obj) {
        Al al = (Al) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.i8)).booleanValue()) {
            jSONObject2.put("ad_request_url", al.c.f8118f);
            jSONObject2.put("ad_request_post_body", al.c.c);
        }
        C0393ab c0393ab = al.c;
        Fl fl = al.f3990a;
        jSONObject2.put("base_url", c0393ab.f8116b);
        jSONObject2.put("signals", al.f3991b);
        jSONObject3.put("body", fl.c);
        jSONObject3.put("headers", C0081p.f1374f.f1375a.g(fl.f5074b));
        jSONObject3.put("response_code", fl.f5073a);
        jSONObject3.put("latency", fl.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", al.c.f8120h);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r, reason: collision with other method in class */
    public /* synthetic */ void mo4r(Object obj) {
        switch (this.f7164o) {
            case 3:
                ((Yf) obj).p();
                return;
            case 4:
            default:
                Q1.I.w("Notification of cache hit successful.");
                return;
            case 5:
                ((InterfaceC0308Md) obj).destroy();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        switch (this.f7164o) {
            case 3:
            case 5:
                return;
            case 4:
            default:
                Q1.I.w("Notification of cache hit failed.");
                return;
        }
    }
}
