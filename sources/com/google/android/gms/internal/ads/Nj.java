package com.google.android.gms.internal.ads;

import O1.InterfaceC0051a;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Nj {

    /* renamed from: a, reason: collision with root package name */
    public final Gg f6355a;

    /* renamed from: b, reason: collision with root package name */
    public final Rh f6356b;
    public final Vg c;
    public final C0527dh d;

    /* renamed from: e, reason: collision with root package name */
    public final C0655gh f6357e;

    /* renamed from: f, reason: collision with root package name */
    public final C1254uh f6358f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f6359g;

    /* renamed from: h, reason: collision with root package name */
    public final Qh f6360h;

    /* renamed from: i, reason: collision with root package name */
    public final C1209tf f6361i;

    /* renamed from: j, reason: collision with root package name */
    public final N1.a f6362j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0301Lb f6363k;

    /* renamed from: l, reason: collision with root package name */
    public final I3 f6364l;

    /* renamed from: m, reason: collision with root package name */
    public final C1083qh f6365m;

    /* renamed from: n, reason: collision with root package name */
    public final Xl f6366n;

    /* renamed from: o, reason: collision with root package name */
    public final Oq f6367o;

    /* renamed from: p, reason: collision with root package name */
    public final C0658gk f6368p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1263uq f6369q;

    /* renamed from: r, reason: collision with root package name */
    public final C0567ef f6370r;

    /* renamed from: s, reason: collision with root package name */
    public final Qj f6371s;

    public Nj(Gg gg, Vg vg, C0527dh c0527dh, C0655gh c0655gh, C1254uh c1254uh, Executor executor, Qh qh, C1209tf c1209tf, N1.a aVar, InterfaceC0301Lb interfaceC0301Lb, I3 i32, C1083qh c1083qh, Xl xl, Oq oq, C0658gk c0658gk, InterfaceC1263uq interfaceC1263uq, Rh rh, C0567ef c0567ef, Qj qj) {
        this.f6355a = gg;
        this.c = vg;
        this.d = c0527dh;
        this.f6357e = c0655gh;
        this.f6358f = c1254uh;
        this.f6359g = executor;
        this.f6360h = qh;
        this.f6361i = c1209tf;
        this.f6362j = aVar;
        this.f6363k = interfaceC0301Lb;
        this.f6364l = i32;
        this.f6365m = c1083qh;
        this.f6366n = xl;
        this.f6367o = oq;
        this.f6368p = c0658gk;
        this.f6369q = interfaceC1263uq;
        this.f6356b = rh;
        this.f6370r = c0567ef;
        this.f6371s = qj;
    }

    public static final C0272Fc b(C0348Ud c0348Ud, String str, String str2) {
        C0272Fc c0272Fc = new C0272Fc();
        c0348Ud.f7165o.f7464A.f8147u = new C1282v8(c0272Fc);
        c0348Ud.J(str, str2);
        return c0272Fc;
    }

    public final void a(C0348Ud c0348Ud, boolean z4, C0640g8 c0640g8) {
        c0348Ud.f7165o.f7464A.l(new InterfaceC0051a() { // from class: com.google.android.gms.internal.ads.Kj
            @Override // O1.InterfaceC0051a
            public final void D() {
                Nj.this.f6355a.D();
            }
        }, this.d, this.f6357e, new Z7() { // from class: com.google.android.gms.internal.ads.Lj
            @Override // com.google.android.gms.internal.ads.Z7
            public final void v(String str, String str2) {
                Nj.this.f6358f.v(str, str2);
            }
        }, new C1342wj(2, this), z4, c0640g8, this.f6362j, new C1384xi(5, this), this.f6363k, this.f6366n, this.f6367o, this.f6368p, this.f6369q, null, this.f6356b, null, null, this.f6370r);
        c0348Ud.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.Mj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean booleanValue = ((Boolean) O1.r.d.c.a(AbstractC1066q6.G8)).booleanValue();
                Nj nj = Nj.this;
                if (booleanValue && motionEvent != null && motionEvent.getAction() == 0) {
                    nj.f6371s.f6679a = motionEvent;
                }
                nj.f6362j.f1153b = true;
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        c0348Ud.setOnClickListener(new ViewOnClickListenerC0605fa(1, this));
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10227g2)).booleanValue()) {
            this.f6364l.f5531b.b(c0348Ud);
        }
        Qh qh = this.f6360h;
        Executor executor = this.f6359g;
        qh.m1(c0348Ud, executor);
        qh.m1(new C0827kj(c0348Ud, 2), executor);
        qh.r1(c0348Ud);
        c0348Ud.A0("/trackActiveViewUnit", new C0469c8(3, this, c0348Ud));
        C1209tf c1209tf = this.f6361i;
        c1209tf.getClass();
        c1209tf.f10710x = new WeakReference(c0348Ud);
    }
}
