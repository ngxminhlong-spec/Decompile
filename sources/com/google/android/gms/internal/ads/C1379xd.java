package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1379xd extends AbstractC1250ud implements NB {

    /* renamed from: A, reason: collision with root package name */
    public final int f11261A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f11262B;

    /* renamed from: r, reason: collision with root package name */
    public String f11263r;

    /* renamed from: s, reason: collision with root package name */
    public final C0367Yc f11264s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11265t;

    /* renamed from: u, reason: collision with root package name */
    public final N1.d f11266u;

    /* renamed from: v, reason: collision with root package name */
    public final F f11267v;

    /* renamed from: w, reason: collision with root package name */
    public ByteBuffer f11268w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11269x;
    public final Object y;

    /* renamed from: z, reason: collision with root package name */
    public final String f11270z;

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, com.google.android.gms.internal.ads.F] */
    public C1379xd(InterfaceC0308Md interfaceC0308Md, C0367Yc c0367Yc) {
        super(interfaceC0308Md);
        this.f11264s = c0367Yc;
        this.f11266u = new N1.d(5);
        this.f11267v = new Object();
        this.y = new Object();
        String u02 = interfaceC0308Md.u0();
        this.f11270z = (String) (u02 == null ? C1394xs.f11307o : new Gs(u02)).b();
        this.f11261A = interfaceC0308Md.d();
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final void c(C0757iz c0757iz, boolean z4, int i4) {
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final void f(C0757iz c0757iz, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final void k(AbstractC1398xw abstractC1398xw, C0757iz c0757iz, boolean z4) {
        if (abstractC1398xw instanceof C1071qB) {
            ((ArrayList) this.f11266u.f1158q).add((C1071qB) abstractC1398xw);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1250ud
    public final void l() {
        this.f11265t = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.google.android.gms.internal.ads.hd] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.internal.ads.NB, com.google.android.gms.internal.ads.ud, com.google.android.gms.internal.ads.xd] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC1250ud
    public final boolean r(String str) {
        String str2;
        ?? r6;
        ?? r22;
        C1071qB c1071qB;
        long currentTimeMillis;
        long longValue;
        long longValue2;
        int i4;
        byte[] bArr;
        long j4;
        long j5;
        String str3 = str;
        this.f11263r = str3;
        String str4 = "error";
        String concat = "cache:".concat(String.valueOf(C1335wc.n(str3, "MD5")));
        try {
            C0831kn c0831kn = new C0831kn(4);
            String str5 = this.f10791p;
            C0367Yc c0367Yc = this.f11264s;
            c1071qB = new C1071qB(str5, c0367Yc.d, c0367Yc.f7833e, true, c0831kn);
            c1071qB.b(this);
            if (this.f11264s.f7837i) {
                c1071qB = new C0694hd(this.f10790o, c1071qB, this.f11270z, this.f11261A);
            }
            c1071qB.o(new C0757iz(Uri.parse(str3), 0L, Collections.EMPTY_MAP, 0L, -1L, 0));
            InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f10792q.get();
            if (interfaceC0308Md != null) {
                interfaceC0308Md.c0(concat, this);
            }
            N1.n.f1204A.f1212j.getClass();
            currentTimeMillis = System.currentTimeMillis();
            C0937n6 c0937n6 = AbstractC1066q6.f10280s;
            O1.r rVar = O1.r.d;
            longValue = ((Long) rVar.c.a(c0937n6)).longValue();
            longValue2 = ((Long) rVar.c.a(AbstractC1066q6.f10276r)).longValue();
            this.f11268w = ByteBuffer.allocate(this.f11264s.c);
            i4 = 8192;
            bArr = new byte[8192];
            j4 = currentTimeMillis;
            str3 = str3;
        } catch (Exception e4) {
            e = e4;
        }
        while (true) {
            try {
                int r4 = c1071qB.r(bArr, 0, Math.min(this.f11268w.remaining(), i4));
                r22 = -1;
                str2 = str4;
                if (r4 == -1) {
                    try {
                        this.f11262B = true;
                        C1335wc.f11173b.post(new RunnableC1164sd(this, str, concat, (int) this.f11267v.a(this.f11268w)));
                        return true;
                    } catch (Exception e5) {
                        e = e5;
                        r22 = str;
                    }
                } else {
                    try {
                        r22 = str;
                        r6 = this.y;
                        synchronized (r6) {
                            try {
                                if (this.f11265t) {
                                    j5 = currentTimeMillis;
                                } else {
                                    j5 = currentTimeMillis;
                                    this.f11268w.put(bArr, 0, r4);
                                }
                            } finally {
                            }
                        }
                        if (this.f11268w.remaining() <= 0) {
                            v();
                            return true;
                        }
                        try {
                            if (this.f11265t) {
                                throw new IOException("Precache abort at " + this.f11268w.limit() + " bytes");
                            }
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (currentTimeMillis2 - j4 >= longValue) {
                                v();
                                j4 = currentTimeMillis2;
                            }
                            if (currentTimeMillis2 - j5 > 1000 * longValue2) {
                                throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                            }
                            str4 = str2;
                            currentTimeMillis = j5;
                            i4 = 8192;
                            str3 = r22;
                        } catch (Exception e6) {
                            e = e6;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        r22 = r22;
                    }
                }
            } catch (Exception e8) {
                e = e8;
                str3 = str;
                str2 = str4;
                r22 = str3;
                r6 = str2;
                String i5 = n0.a.i(e.getClass().getCanonicalName(), ":", e.getMessage());
                Y9.s("Failed to preload url " + r22 + " Exception: " + i5);
                m(r22, concat, r6, i5);
                return false;
            }
            r6 = str2;
            String i52 = n0.a.i(e.getClass().getCanonicalName(), ":", e.getMessage());
            Y9.s("Failed to preload url " + r22 + " Exception: " + i52);
            m(r22, concat, r6, i52);
            return false;
        }
    }

    public final ByteBuffer u() {
        synchronized (this.y) {
            try {
                ByteBuffer byteBuffer = this.f11268w;
                if (byteBuffer != null && !this.f11269x) {
                    byteBuffer.flip();
                    this.f11269x = true;
                }
                this.f11265t = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f11268w;
    }

    public final void v() {
        N1.d dVar = this.f11266u;
        Iterator it = ((ArrayList) dVar.f1158q).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((C1071qB) it.next()).a().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        dVar.f1157p = Math.max(dVar.f1157p, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i4 = (int) dVar.f1157p;
        int a4 = (int) this.f11267v.a(this.f11268w);
        int position = this.f11268w.position();
        int round = Math.round((position / i4) * a4);
        int i5 = C0273Fd.f5018I.get();
        int i6 = C0273Fd.f5019J.get();
        String str = this.f11263r;
        C1335wc.f11173b.post(new RunnableC1079qd(this, str, "cache:".concat(String.valueOf(C1335wc.n(str, "MD5"))), position, i4, round, a4, round > 0, i5, i6));
    }
}
