package com.google.android.gms.internal.ads;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.measurement.C1509e0;
import com.google.android.gms.internal.play_billing.AbstractC1629o;
import f.C1667b;
import f.DialogC1670e;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l2.AbstractC1799b;
import o1.InterfaceC1843T;
import o1.InterfaceC1851a0;
import org.json.JSONObject;
import p1.C1932s;
import t1.C1991b;
import u1.C2013a;
import w1.C2046i;
import w1.C2052o;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ji, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0783ji implements B0.o, InterfaceC1843T, InterfaceC1851a0, InterfaceC1292vc, b1.e, InterfaceC0378a2, InterfaceC0277Gc, InterfaceC0351Vb, Mu, InterfaceC0725i7, InterfaceC0749iq {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9210o;

    /* renamed from: p, reason: collision with root package name */
    public Object f9211p;

    /* renamed from: q, reason: collision with root package name */
    public Object f9212q;

    public /* synthetic */ C0783ji(int i4) {
        this.f9210o = i4;
    }

    public /* synthetic */ C0783ji(int i4, Object obj, Object obj2) {
        this.f9210o = i4;
        this.f9211p = obj;
        this.f9212q = obj2;
    }

    public C0783ji(Animator animator) {
        this.f9210o = 10;
        this.f9211p = null;
        this.f9212q = animator;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, B0.q] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, t3.g] */
    public C0783ji(Context context, com.google.android.gms.internal.play_billing.L0 l02) {
        t3.g c;
        C1991b c1991b;
        Set set;
        this.f9210o = 1;
        ?? obj = new Object();
        try {
            C2052o.b(context);
            c = C2052o.a().c(C2013a.f14987e);
            c1991b = new C1991b("proto");
            new V2.e(3);
            set = (Set) c.f14961o;
        } catch (Throwable unused) {
            obj.f110o = true;
        }
        if (!set.contains(c1991b)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c1991b, set));
        }
        C2046i c2046i = (C2046i) c.f14962p;
        C2052o c2052o = (C2052o) c.f14963q;
        ?? obj2 = new Object();
        obj2.f14961o = c2046i;
        obj2.f14962p = c1991b;
        obj2.f14963q = c2052o;
        obj.f111p = obj2;
        this.f9212q = obj;
        this.f9211p = l02;
    }

    public C0783ji(Animation animation) {
        this.f9210o = 10;
        this.f9211p = animation;
        this.f9212q = null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [b0.m0, java.lang.Object] */
    public C0783ji(b0.n0 n0Var) {
        this.f9210o = 11;
        this.f9211p = n0Var;
        ?? obj = new Object();
        obj.f3357a = 0;
        this.f9212q = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0783ji(Ui ui, ViewGroup viewGroup) {
        this.f9210o = 25;
        this.f9211p = (AbstractBinderC1149s4) ui;
        this.f9212q = viewGroup;
    }

    public C0783ji(C0506d2 c0506d2) {
        this.f9210o = 15;
        this.f9212q = c0506d2;
        this.f9211p = new X(4, new byte[4]);
    }

    public C0783ji(C1323w6 c1323w6) {
        this.f9210o = 17;
        this.f9212q = c1323w6;
        this.f9211p = new HashMap();
    }

    public C0783ji(InterfaceC1359x interfaceC1359x) {
        this.f9210o = 13;
        this.f9211p = interfaceC1359x;
        this.f9212q = new AtomicBoolean(false);
    }

    public /* synthetic */ C0783ji(C1423ye c1423ye, Context context, String str) {
        this.f9210o = 21;
        AB a4 = AB.a(context);
        C1414yB c1414yB = c1423ye.f11400e0;
        C1388xm c1388xm = new C1388xm(a4, c1414yB, c1423ye.f11402f0, 7);
        C1414yB b4 = C1414yB.b(new Eo(c1414yB, 4));
        C1414yB b5 = C1414yB.b(Wj.f7550s);
        C1414yB b6 = C1414yB.b(new C0610ff(a4, c1423ye.f11403g, c1423ye.y, c1388xm, b4, b5));
        this.f9211p = C1414yB.b(new C1338wf((FB) b6, (FB) b4, b5, 15));
        this.f9212q = C1414yB.b(new W1.c(AB.b(str), b6, a4, b4, b5, c1423ye.d, c1423ye.f11424z, c1423ye.f11370C));
    }

    public /* synthetic */ C0783ji(Object obj, Object obj2, int i4, boolean z4) {
        this.f9210o = i4;
        this.f9212q = obj;
        this.f9211p = obj2;
    }

    public static C0783ji n(Context context, Uri uri) {
        return new C0783ji(8, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    private final void v(Throwable th) {
    }

    private final void w(Throwable th) {
    }

    public Set A(C1296vg c1296vg) {
        return Collections.singleton(new Ph(c1296vg, AbstractC0266Ec.f4900f));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.s4, android.view.View$OnTouchListener] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0725i7
    public void D(MotionEvent motionEvent) {
        ((AbstractBinderC1149s4) this.f9211p).onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0351Vb
    public void a(InterfaceC0609fe interfaceC0609fe) {
        String str = (String) this.f9211p;
        Bundle bundle = (Bundle) this.f9212q;
        C1509e0 c1509e0 = (C1509e0) ((BinderC0854l9) interfaceC0609fe).f9378o.f13386p;
        c1509e0.b(new com.google.android.gms.internal.measurement.Y(c1509e0, "am", str, bundle, true, 1));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0725i7
    public JSONObject b() {
        return ((AbstractBinderC1149s4) this.f9211p).n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0277Gc
    /* renamed from: b */
    public void mo1b() {
        Q1.I.w("callJs > getEngine: Promise rejected");
        ((C0272Fc) this.f9211p).c(new Exception("Unable to obtain a JavascriptEngine."));
        ((X8) this.f9212q).n();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0725i7
    public JSONObject c() {
        return ((AbstractBinderC1149s4) this.f9211p).o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0378a2
    public void d(Sr sr, D d, C0591f2 c0591f2) {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4, android.view.View$OnClickListener] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0725i7
    public void e() {
        Gt gt = Ji.f5875D;
        ?? r1 = (AbstractBinderC1149s4) this.f9211p;
        Map q4 = r1.q();
        if (q4 == null) {
            return;
        }
        int i4 = gt.f5346r;
        int i5 = 0;
        while (i5 < i4) {
            Object obj = q4.get((String) gt.get(i5));
            i5++;
            if (obj != null) {
                r1.onClick((ViewGroup) this.f9212q);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0378a2
    public void f(C1134rq c1134rq) {
        C0506d2 c0506d2 = (C0506d2) this.f9212q;
        SparseArray sparseArray = c0506d2.f8439e;
        X x4 = (X) this.f9211p;
        if (c1134rq.m() == 0 && (c1134rq.m() & 128) != 0) {
            c1134rq.f(6);
            int g4 = c1134rq.g() / 4;
            for (int i4 = 0; i4 < g4; i4++) {
                c1134rq.a(x4.f7583a, 0, 4);
                x4.q(0);
                int f4 = x4.f(16);
                x4.s(3);
                if (f4 == 0) {
                    x4.s(13);
                } else {
                    int f5 = x4.f(13);
                    if (sparseArray.get(f5) == null) {
                        sparseArray.put(f5, new C0421b2(new C0817kF(c0506d2, f5)));
                    }
                }
            }
            sparseArray.remove(0);
        }
    }

    @Override // o1.InterfaceC1851a0
    public void g(m1.b bVar) {
        switch (this.f9210o) {
            case 3:
                C0.D d = (C0.D) this.f9212q;
                System.currentTimeMillis();
                d.h0(bVar);
                return;
            default:
                ((D0.g) this.f9212q).f0(bVar);
                return;
        }
    }

    @Override // o1.InterfaceC1843T
    public void h(int i4, String str, boolean z4) {
        switch (this.f9210o) {
            case 2:
                C0.D d = (C0.D) this.f9212q;
                String.valueOf(n0.a.e(5));
                p1.e0 e0Var = (p1.e0) this.f9211p;
                d.f202i0.d(new M0.a(i4, z4, str, e0Var.f14518Q, e0Var.f14519R, e0Var.f14517P, e0Var.f13117A));
                d.a0();
                d.p0();
                return;
            default:
                p1.e0 e0Var2 = (p1.e0) this.f9211p;
                M0.a aVar = new M0.a(i4, z4, str, e0Var2.f14518Q, e0Var2.f14519R, e0Var2.f14517P, e0Var2.f13117A);
                D0.g gVar = (D0.g) this.f9212q;
                gVar.f566h0.d(aVar);
                gVar.Z();
                return;
        }
    }

    @Override // o1.InterfaceC1851a0
    public void i() {
        switch (this.f9210o) {
            case 3:
                C0.D.R((C0.D) this.f9212q, (ArrayList) this.f9211p);
                return;
            default:
                D0.g.R((D0.g) this.f9212q, (ArrayList) this.f9211p);
                return;
        }
    }

    @Override // b1.e
    public void j(Canvas canvas) {
        Drawable drawable = (Drawable) this.f9212q;
        C1932s c1932s = (C1932s) this.f9211p;
        boolean z4 = c1932s.f14584Q;
        float G3 = c1932s.G();
        int i4 = (int) (1.2f * G3);
        canvas.translate((int) ((G3 - i4) / 2.0f), (-i4) / 6);
        if (z4) {
            drawable.setBounds(0, 0, i4, i4);
            drawable.draw(canvas);
        }
        canvas.translate(-r1, -r4);
    }

    public C0783ji k(String str, String str2) {
        Uri uri;
        Context context = (Context) this.f9211p;
        try {
            uri = DocumentsContract.createDocument(context.getContentResolver(), (Uri) this.f9212q, str, str2);
        } catch (Exception unused) {
            uri = null;
        }
        if (uri != null) {
            return new C0783ji(8, context, uri);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    public Object l(Object obj) {
        InputStreamReader inputStreamReader = new InputStreamReader((InputStream) obj);
        try {
            try {
                JsonReader jsonReader = new JsonReader(inputStreamReader);
                HashMap hashMap = new HashMap();
                String str = "";
                jsonReader.beginObject();
                long j4 = -1;
                int i4 = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if ("response".equals(nextName)) {
                        i4 = jsonReader.nextInt();
                    } else if ("body".equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("latency".equals(nextName)) {
                        j4 = jsonReader.nextLong();
                    } else if ("headers".equals(nextName)) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), android.support.v4.media.session.a.A(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                Fl fl = new Fl();
                fl.f5073a = i4;
                if (str != null) {
                    fl.c = str;
                }
                fl.d = j4;
                fl.f5074b = hashMap;
                AbstractC1799b.c(inputStreamReader);
                return new Al(fl, (JSONObject) this.f9211p, (C0393ab) this.f9212q);
            } catch (Throwable th) {
                AbstractC1799b.c(inputStreamReader);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            throw new Xk("Unable to parse Response", e);
        } catch (AssertionError e5) {
            e = e5;
            throw new Xk("Unable to parse Response", e);
        } catch (IllegalStateException e6) {
            e = e6;
            throw new Xk("Unable to parse Response", e);
        } catch (NumberFormatException e7) {
            e = e7;
            throw new Xk("Unable to parse Response", e);
        }
    }

    public View m(int i4, int i5, int i6, int i7) {
        b0.m0 m0Var = (b0.m0) this.f9212q;
        b0.n0 n0Var = (b0.n0) this.f9211p;
        int p3 = n0Var.p();
        int i8 = n0Var.i();
        int i9 = i5 > i4 ? 1 : -1;
        View view = null;
        while (i4 != i5) {
            View o4 = n0Var.o(i4);
            int j4 = n0Var.j(o4);
            int q4 = n0Var.q(o4);
            m0Var.f3358b = p3;
            m0Var.c = i8;
            m0Var.d = j4;
            m0Var.f3359e = q4;
            if (i6 != 0) {
                m0Var.f3357a = i6;
                if (m0Var.a()) {
                    return o4;
                }
            }
            if (i7 != 0) {
                m0Var.f3357a = i7;
                if (m0Var.a()) {
                    view = o4;
                }
            }
            i4 += i9;
        }
        return view;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1292vc
    public boolean o(String str) {
        Q1.J j4 = Q1.N.f1668k;
        Q1.N n4 = N1.n.f1204A.c;
        Q1.N.i((Context) this.f9211p, (String) this.f9212q, str);
        return true;
    }

    public boolean p(View view) {
        b0.m0 m0Var = (b0.m0) this.f9212q;
        b0.n0 n0Var = (b0.n0) this.f9211p;
        int p3 = n0Var.p();
        int i4 = n0Var.i();
        int j4 = n0Var.j(view);
        int q4 = n0Var.q(view);
        m0Var.f3358b = p3;
        m0Var.c = i4;
        m0Var.d = j4;
        m0Var.f3359e = q4;
        m0Var.f3357a = 24579;
        return m0Var.a();
    }

    public void q() {
        C0326Qb c0326Qb = (C0326Qb) this.f9212q;
        if (((DialogC1670e) c0326Qb.f6659o).isShowing()) {
            L2.b bVar = new L2.b(((C0.v0) c0326Qb.f6662r).l());
            bVar.s(R.string.upload_error);
            C1667b c1667b = (C1667b) bVar.f113p;
            c1667b.f12789f = c1667b.f12786a.getText(R.string.upload_error_msg);
            bVar.q(R.string.close, null);
            bVar.k();
        }
        ((DialogC1670e) c0326Qb.f6659o).dismiss();
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public void mo4r(Object obj) {
        switch (this.f9210o) {
            case 20:
                ((InterfaceC0282Hc) this.f9211p).mo3l(obj);
                return;
            case 23:
                AbstractC0266Ec.f4899e.execute(new D3(21, (C0611fg) this.f9212q));
                ((C0275Ga) this.f9211p).mo4r((Yf) obj);
                return;
            case 27:
                ((InterfaceC0308Md) obj).x0((C1434yp) this.f9211p, (Ap) this.f9212q);
                return;
            default:
                ((Hk) obj).f5491A = true;
                ((Vk) this.f9212q).f7278r.b((String) this.f9211p);
                return;
        }
    }

    public void s(E.h hVar) {
        E.m mVar = (E.m) this.f9212q;
        D3.d dVar = (D3.d) this.f9211p;
        int i4 = hVar.f693b;
        if (i4 != 0) {
            mVar.execute(new C0.C(i4, 6, dVar));
        } else {
            mVar.execute(new Nu(19, dVar, hVar.f692a));
        }
    }

    public B t(Object... objArr) {
        Constructor b4;
        synchronized (((AtomicBoolean) this.f9212q)) {
            if (!((AtomicBoolean) this.f9212q).get()) {
                try {
                    b4 = ((InterfaceC1359x) this.f9211p).b();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f9212q).set(true);
                } catch (Exception e4) {
                    throw new RuntimeException("Error instantiating extension", e4);
                }
            }
            b4 = null;
        }
        if (b4 == null) {
            return null;
        }
        try {
            return (B) b4.newInstance(objArr);
        } catch (Exception e5) {
            throw new IllegalStateException("Unexpected error creating extractor", e5);
        }
    }

    public void u(com.google.android.gms.internal.play_billing.B0 b02) {
        if (b02 == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.O0 p3 = com.google.android.gms.internal.play_billing.P0.p();
            com.google.android.gms.internal.play_billing.L0 l02 = (com.google.android.gms.internal.play_billing.L0) this.f9211p;
            p3.c();
            com.google.android.gms.internal.play_billing.P0.m((com.google.android.gms.internal.play_billing.P0) p3.f12141p, l02);
            p3.c();
            com.google.android.gms.internal.play_billing.P0.n((com.google.android.gms.internal.play_billing.P0) p3.f12141p, b02);
            ((B0.q) this.f9212q).f((com.google.android.gms.internal.play_billing.P0) p3.a());
        } catch (Throwable th) {
            AbstractC1629o.f("BillingLogger", "Unable to log.", th);
        }
    }

    public void x(com.google.android.gms.internal.play_billing.E0 e02) {
        if (e02 == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.O0 p3 = com.google.android.gms.internal.play_billing.P0.p();
            com.google.android.gms.internal.play_billing.L0 l02 = (com.google.android.gms.internal.play_billing.L0) this.f9211p;
            p3.c();
            com.google.android.gms.internal.play_billing.P0.m((com.google.android.gms.internal.play_billing.P0) p3.f12141p, l02);
            p3.c();
            com.google.android.gms.internal.play_billing.P0.o((com.google.android.gms.internal.play_billing.P0) p3.f12141p, e02);
            ((B0.q) this.f9212q).f((com.google.android.gms.internal.play_billing.P0) p3.a());
        } catch (Throwable th) {
            AbstractC1629o.f("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        switch (this.f9210o) {
            case 20:
                ((InterfaceC0277Gc) this.f9212q).mo1b();
                return;
            case 23:
                AbstractC0266Ec.f4899e.execute(new D3(21, (C0611fg) this.f9212q));
                ((C0275Ga) this.f9211p).y(th);
                return;
            case 27:
            default:
                return;
        }
    }

    public Set z(C1296vg c1296vg) {
        return Collections.singleton(new Ph(c1296vg, AbstractC0266Ec.f4900f));
    }
}
