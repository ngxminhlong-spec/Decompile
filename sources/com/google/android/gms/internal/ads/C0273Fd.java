package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseBooleanArray;
import b0.RunnableC0203p;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Fd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273Fd implements NB, PC {

    /* renamed from: I, reason: collision with root package name */
    public static final AtomicInteger f5018I = new AtomicInteger(0);

    /* renamed from: J, reason: collision with root package name */
    public static final AtomicInteger f5019J = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    public long f5020A;

    /* renamed from: B, reason: collision with root package name */
    public final String f5021B;

    /* renamed from: C, reason: collision with root package name */
    public final int f5022C;

    /* renamed from: E, reason: collision with root package name */
    public Integer f5024E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f5025F;

    /* renamed from: G, reason: collision with root package name */
    public volatile C0255Cd f5026G;

    /* renamed from: o, reason: collision with root package name */
    public final Context f5028o;

    /* renamed from: p, reason: collision with root package name */
    public final C0249Bd f5029p;

    /* renamed from: q, reason: collision with root package name */
    public final C0604fF f5030q;

    /* renamed from: r, reason: collision with root package name */
    public final C0367Yc f5031r;

    /* renamed from: s, reason: collision with root package name */
    public final WeakReference f5032s;

    /* renamed from: t, reason: collision with root package name */
    public final C0621fq f5033t;

    /* renamed from: u, reason: collision with root package name */
    public MC f5034u;

    /* renamed from: v, reason: collision with root package name */
    public ByteBuffer f5035v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5036w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC0342Tc f5037x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f5038z;

    /* renamed from: D, reason: collision with root package name */
    public final Object f5023D = new Object();

    /* renamed from: H, reason: collision with root package name */
    public final HashSet f5027H = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010f, code lost:
    
        if (((java.lang.Boolean) r1.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.f10094D1)).booleanValue() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0273Fd(android.content.Context r6, com.google.android.gms.internal.ads.C0367Yc r7, com.google.android.gms.internal.ads.InterfaceC0308Md r8, java.lang.Integer r9) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0273Fd.<init>(android.content.Context, com.google.android.gms.internal.ads.Yc, com.google.android.gms.internal.ads.Md, java.lang.Integer):void");
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final /* synthetic */ void a(AA aa, Wl wl) {
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void b(AbstractC0318Od abstractC0318Od) {
        InterfaceC0342Tc interfaceC0342Tc = this.f5037x;
        if (interfaceC0342Tc != null) {
            interfaceC0342Tc.h("onPlayerError", abstractC0318Od);
        }
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final void c(C0757iz c0757iz, boolean z4, int i4) {
        this.y += i4;
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void d(C0976o2 c0976o2) {
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f5032s.get();
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.f10094D1)).booleanValue() || interfaceC0308Md == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = c0976o2.f9812j;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = c0976o2.f9813k;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = c0976o2.f9810h;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        interfaceC0308Md.b("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void e(C0976o2 c0976o2) {
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f5032s.get();
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.f10094D1)).booleanValue() || interfaceC0308Md == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(c0976o2.f9820r));
        hashMap.put("bitRate", String.valueOf(c0976o2.f9809g));
        hashMap.put("resolution", c0976o2.f9818p + "x" + c0976o2.f9819q);
        String str = c0976o2.f9812j;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = c0976o2.f9813k;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = c0976o2.f9810h;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        interfaceC0308Md.b("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final void f(C0757iz c0757iz, boolean z4) {
    }

    public final void finalize() {
        f5018I.decrementAndGet();
        if (Q1.I.y()) {
            Q1.I.w("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void g(IOException iOException) {
        InterfaceC0342Tc interfaceC0342Tc = this.f5037x;
        if (interfaceC0342Tc != null) {
            if (this.f5031r.f7838j) {
                interfaceC0342Tc.g(iOException);
            } else {
                interfaceC0342Tc.h("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final /* synthetic */ void h(VB vb) {
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void i(C0914mk c0914mk) {
        InterfaceC0342Tc interfaceC0342Tc = this.f5037x;
        if (interfaceC0342Tc != null) {
            interfaceC0342Tc.d(c0914mk.f9649a, c0914mk.f9650b);
        }
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void i0(int i4) {
        this.f5038z += i4;
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final /* synthetic */ void j(int i4) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.NB
    public final void k(AbstractC1398xw abstractC1398xw, C0757iz c0757iz, boolean z4) {
        if (abstractC1398xw instanceof LB) {
            synchronized (this.f5023D) {
                this.f5025F.add((LB) abstractC1398xw);
            }
        } else if (abstractC1398xw instanceof C0255Cd) {
            this.f5026G = (C0255Cd) abstractC1398xw;
            InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f5032s.get();
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10094D1)).booleanValue() && interfaceC0308Md != null && this.f5026G.f4447B) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f5026G.f4449D));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f5026G.f4450E));
                Q1.N.f1668k.post(new RunnableC0203p(14, interfaceC0308Md, hashMap));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final /* synthetic */ void l(OC oc, C1074qE c1074qE) {
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void m() {
        InterfaceC0342Tc interfaceC0342Tc = this.f5037x;
        if (interfaceC0342Tc != null) {
            interfaceC0342Tc.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final /* synthetic */ void n(OC oc, int i4, long j4) {
    }

    public final long o() {
        if (this.f5026G != null && this.f5026G.f4448C) {
            return this.f5026G.h();
        }
        synchronized (this.f5023D) {
            while (!this.f5025F.isEmpty()) {
                long j4 = this.f5020A;
                Map a4 = ((LB) this.f5025F.remove(0)).a();
                long j5 = 0;
                if (a4 != null) {
                    Iterator it = a4.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && Zf.J("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j5 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f5020A = j4 + j5;
            }
        }
        return this.f5020A;
    }

    public final void p(Uri[] uriArr, ByteBuffer byteBuffer, boolean z4) {
        Object ae;
        if (this.f5034u != null) {
            this.f5035v = byteBuffer;
            this.f5036w = z4;
            int length = uriArr.length;
            if (length == 1) {
                ae = r(uriArr[0]);
            } else {
                AbstractC0560eE[] abstractC0560eEArr = new AbstractC0560eE[length];
                for (int i4 = 0; i4 < uriArr.length; i4++) {
                    abstractC0560eEArr[i4] = r(uriArr[i4]);
                }
                ae = new AE(abstractC0560eEArr);
            }
            MC mc = this.f5034u;
            mc.f6223r.a();
            C0857lC c0857lC = mc.f6222q;
            c0857lC.E1();
            List singletonList = Collections.singletonList(ae);
            c0857lC.E1();
            c0857lC.E1();
            c0857lC.s1(c0857lC.f9412f0);
            c0857lC.h1();
            c0857lC.f9394M++;
            ArrayList arrayList = c0857lC.f9384C;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i5 = size - 1; i5 >= 0; i5--) {
                    arrayList.remove(i5);
                }
                NE ne = c0857lC.f9416j0;
                int[] iArr = ne.f6315b;
                int[] iArr2 = new int[iArr.length - size];
                int i6 = 0;
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    int i8 = iArr[i7];
                    if (i8 < 0 || i8 >= size) {
                        int i9 = i7 - i6;
                        if (i8 >= 0) {
                            i8 -= size;
                        }
                        iArr2[i9] = i8;
                    } else {
                        i6++;
                    }
                }
                c0857lC.f9416j0 = new NE(iArr2, new Random(ne.f6314a.nextLong()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < singletonList.size(); i10++) {
                DC dc = new DC((AbstractC0560eE) singletonList.get(i10), c0857lC.f9385D);
                arrayList2.add(dc);
                arrayList.add(i10, new C0814kC(dc.f4596b, dc.f4595a));
            }
            c0857lC.f9416j0 = c0857lC.f9416j0.a(arrayList2.size());
            JC jc = new JC(arrayList, c0857lC.f9416j0);
            boolean o4 = jc.o();
            int i11 = jc.d;
            if (!o4 && i11 < 0) {
                throw new IllegalStateException();
            }
            int g4 = jc.g(false);
            FC x12 = c0857lC.x1(c0857lC.f9412f0, jc, c0857lC.w1(jc, g4, -9223372036854775807L));
            int i12 = x12.f4996e;
            if (g4 != -1 && i12 != 1) {
                i12 = 4;
                if (!jc.o() && g4 < i11) {
                    i12 = 2;
                }
            }
            FC e4 = x12.e(i12);
            C1029pC c1029pC = c0857lC.y;
            long t4 = AbstractC0751is.t(-9223372036854775807L);
            NE ne2 = c0857lC.f9416j0;
            c1029pC.getClass();
            c1029pC.f9953v.a(17, new C0943nC(arrayList2, ne2, g4, t4)).a();
            c0857lC.D1(e4, 0, 1, (c0857lC.f9412f0.f4995b.f10688a.equals(e4.f4995b.f10688a) || c0857lC.f9412f0.f4994a.o()) ? false : true, 4, c0857lC.u1(e4), -1);
            MC mc2 = this.f5034u;
            mc2.f6223r.a();
            C0857lC c0857lC2 = mc2.f6222q;
            c0857lC2.E1();
            UB ub = c0857lC2.f9392K;
            boolean o12 = c0857lC2.o1();
            ub.a();
            int i13 = o12 ? 1 : -1;
            c0857lC2.C1(i13, (!o12 || i13 == 1) ? 1 : 2, o12);
            FC fc = c0857lC2.f9412f0;
            if (fc.f4996e == 1) {
                FC d = fc.d(null);
                FC e5 = d.e(true == d.f4994a.o() ? 4 : 2);
                c0857lC2.f9394M++;
                Handler handler = c0857lC2.y.f9953v.f10539a;
                C0835kr d4 = C1135rr.d();
                d4.f9326a = handler.obtainMessage(0);
                d4.a();
                c0857lC2.D1(e5, 1, 1, false, 5, -9223372036854775807L, -1);
            }
            f5019J.incrementAndGet();
        }
    }

    public final void q(boolean z4) {
        ZE ze;
        if (this.f5034u == null) {
            return;
        }
        int i4 = 0;
        while (true) {
            MC mc = this.f5034u;
            mc.f6223r.a();
            C0857lC c0857lC = mc.f6222q;
            c0857lC.E1();
            int length = c0857lC.f9422v.length;
            if (i4 >= 2) {
                return;
            }
            C0604fF c0604fF = this.f5030q;
            synchronized (c0604fF.c) {
                ze = c0604fF.f8698f;
            }
            ze.getClass();
            YE ye = new YE(ze);
            boolean z5 = !z4;
            SparseBooleanArray sparseBooleanArray = ye.f7807s;
            if (sparseBooleanArray.get(i4) != z5) {
                if (z4) {
                    sparseBooleanArray.delete(i4);
                } else {
                    sparseBooleanArray.put(i4, true);
                }
            }
            c0604fF.e(ye);
            i4++;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.D5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.Q7, java.lang.Object] */
    public final IE r(Uri uri) {
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        Gt gt = Gt.f5344s;
        List list = Collections.EMPTY_LIST;
        Gt gt2 = Gt.f5344s;
        W8 w8 = W8.f7349a;
        Z9 z9 = new Z9("", new Object(), uri != null ? new C1068q8(uri, gt2) : null, new Object(), C0265Eb.y);
        int i4 = this.f5031r.f7834f;
        C0621fq c0621fq = this.f5033t;
        c0621fq.f8746o = i4;
        z9.f7970b.getClass();
        return new IE(z9, (InterfaceC1399xx) c0621fq.f8747p, (RC) c0621fq.f8748q, (UC) c0621fq.f8749r, c0621fq.f8746o);
    }

    public final long s() {
        if (this.f5026G != null && this.f5026G.f4448C && this.f5026G.f4449D) {
            return Math.min(this.y, this.f5026G.f4451F);
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void w(int i4) {
        InterfaceC0342Tc interfaceC0342Tc = this.f5037x;
        if (interfaceC0342Tc != null) {
            interfaceC0342Tc.a(i4);
        }
    }
}
