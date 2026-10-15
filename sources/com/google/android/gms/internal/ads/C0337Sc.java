package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337Sc extends FrameLayout implements InterfaceC0317Oc {

    /* renamed from: A, reason: collision with root package name */
    public long f6967A;

    /* renamed from: B, reason: collision with root package name */
    public String f6968B;

    /* renamed from: C, reason: collision with root package name */
    public String[] f6969C;

    /* renamed from: D, reason: collision with root package name */
    public Bitmap f6970D;

    /* renamed from: E, reason: collision with root package name */
    public final ImageView f6971E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6972F;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0308Md f6973o;

    /* renamed from: p, reason: collision with root package name */
    public final FrameLayout f6974p;

    /* renamed from: q, reason: collision with root package name */
    public final View f6975q;

    /* renamed from: r, reason: collision with root package name */
    public final C1323w6 f6976r;

    /* renamed from: s, reason: collision with root package name */
    public final RunnableC0332Rc f6977s;

    /* renamed from: t, reason: collision with root package name */
    public final long f6978t;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC0322Pc f6979u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6980v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6981w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6982x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public long f6983z;

    public C0337Sc(Context context, InterfaceC0308Md interfaceC0308Md, int i4, boolean z4, C1323w6 c1323w6, C0367Yc c0367Yc) {
        super(context);
        Context context2;
        AbstractC0322Pc textureViewSurfaceTextureListenerC0312Nc;
        this.f6973o = interfaceC0308Md;
        this.f6976r = c1323w6;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f6974p = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        h2.y.i(interfaceC0308Md.j());
        Object obj = interfaceC0308Md.j().f11914p;
        C0372Zc c0372Zc = new C0372Zc(context, interfaceC0308Md.m(), interfaceC0308Md.I0(), c1323w6, interfaceC0308Md.k());
        if (i4 == 2) {
            interfaceC0308Md.P().getClass();
            context2 = context;
            textureViewSurfaceTextureListenerC0312Nc = new TextureViewSurfaceTextureListenerC0651gd(context2, c0372Zc, interfaceC0308Md, z4, c0367Yc);
        } else {
            context2 = context;
            textureViewSurfaceTextureListenerC0312Nc = new TextureViewSurfaceTextureListenerC0312Nc(context2, interfaceC0308Md, z4, interfaceC0308Md.P().b(), new C0372Zc(context2, interfaceC0308Md.m(), interfaceC0308Md.I0(), c1323w6, interfaceC0308Md.k()));
        }
        this.f6979u = textureViewSurfaceTextureListenerC0312Nc;
        View view = new View(context2);
        this.f6975q = view;
        view.setBackgroundColor(0);
        frameLayout.addView(textureViewSurfaceTextureListenerC0312Nc, new FrameLayout.LayoutParams(-1, -1, 17));
        C0937n6 c0937n6 = AbstractC1066q6.f10312z;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) rVar.c.a(AbstractC1066q6.f10299w)).booleanValue()) {
            i();
        }
        this.f6971E = new ImageView(context2);
        this.f6978t = ((Long) rVar.c.a(AbstractC1066q6.f10087C)).longValue();
        boolean booleanValue = ((Boolean) rVar.c.a(AbstractC1066q6.y)).booleanValue();
        this.y = booleanValue;
        c1323w6.b("spinner_used", true != booleanValue ? "0" : "1");
        this.f6977s = new RunnableC0332Rc(this);
        textureViewSurfaceTextureListenerC0312Nc.w(this);
    }

    public final void a(int i4, int i5, int i6, int i7) {
        if (Q1.I.y()) {
            StringBuilder m4 = U.a.m("Set video bounds to x:", i4, ";y:", i5, ";w:");
            m4.append(i6);
            m4.append(";h:");
            m4.append(i7);
            Q1.I.w(m4.toString());
        }
        if (i6 == 0 || i7 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        layoutParams.setMargins(i4, i5, 0, 0);
        this.f6974p.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void b() {
        InterfaceC0308Md interfaceC0308Md = this.f6973o;
        if (interfaceC0308Md.g() == null || !this.f6981w || this.f6982x) {
            return;
        }
        interfaceC0308Md.g().getWindow().clearFlags(128);
        this.f6981w = false;
    }

    public final void c(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        AbstractC0322Pc abstractC0322Pc = this.f6979u;
        Integer A3 = abstractC0322Pc != null ? abstractC0322Pc.A() : null;
        if (A3 != null) {
            hashMap.put("playerId", A3.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f6973o.b("onVideoEvent", hashMap);
    }

    public final void d() {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10104F1)).booleanValue()) {
            this.f6977s.a();
        }
        c("ended", new String[0]);
        b();
    }

    public final void e() {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10104F1)).booleanValue()) {
            RunnableC0332Rc runnableC0332Rc = this.f6977s;
            runnableC0332Rc.f6804p = false;
            Q1.J j4 = Q1.N.f1668k;
            j4.removeCallbacks(runnableC0332Rc);
            j4.postDelayed(runnableC0332Rc, 250L);
        }
        InterfaceC0308Md interfaceC0308Md = this.f6973o;
        if (interfaceC0308Md.g() != null && !this.f6981w) {
            boolean z4 = (interfaceC0308Md.g().getWindow().getAttributes().flags & 128) != 0;
            this.f6982x = z4;
            if (!z4) {
                interfaceC0308Md.g().getWindow().addFlags(128);
                this.f6981w = true;
            }
        }
        this.f6980v = true;
    }

    public final void f() {
        AbstractC0322Pc abstractC0322Pc = this.f6979u;
        if (abstractC0322Pc != null && this.f6967A == 0) {
            c("canplaythrough", "duration", String.valueOf(abstractC0322Pc.l() / 1000.0f), "videoWidth", String.valueOf(abstractC0322Pc.o()), "videoHeight", String.valueOf(abstractC0322Pc.n()));
        }
    }

    public final void finalize() {
        try {
            this.f6977s.a();
            AbstractC0322Pc abstractC0322Pc = this.f6979u;
            if (abstractC0322Pc != null) {
                AbstractC0266Ec.f4899e.execute(new D3(10, abstractC0322Pc));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        if (this.f6972F && this.f6970D != null) {
            ImageView imageView = this.f6971E;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.f6970D);
                imageView.invalidate();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = this.f6974p;
                frameLayout.addView(imageView, layoutParams);
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f6977s.a();
        this.f6967A = this.f6983z;
        Q1.N.f1668k.post(new RunnableC0327Qc(this, 2));
    }

    public final void h(int i4, int i5) {
        if (this.y) {
            C0937n6 c0937n6 = AbstractC1066q6.f10082B;
            O1.r rVar = O1.r.d;
            int max = Math.max(i4 / ((Integer) rVar.c.a(c0937n6)).intValue(), 1);
            int max2 = Math.max(i5 / ((Integer) rVar.c.a(c0937n6)).intValue(), 1);
            Bitmap bitmap = this.f6970D;
            if (bitmap != null && bitmap.getWidth() == max && this.f6970D.getHeight() == max2) {
                return;
            }
            this.f6970D = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.f6972F = false;
        }
    }

    public final void i() {
        AbstractC0322Pc abstractC0322Pc = this.f6979u;
        if (abstractC0322Pc == null) {
            return;
        }
        TextView textView = new TextView(abstractC0322Pc.getContext());
        Resources a4 = N1.n.f1204A.f1209g.a();
        textView.setText(String.valueOf(a4 == null ? "AdMob - " : a4.getString(R.string.watermark_label_prefix)).concat(abstractC0322Pc.s()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f6974p;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void j() {
        AbstractC0322Pc abstractC0322Pc = this.f6979u;
        if (abstractC0322Pc == null) {
            return;
        }
        long j4 = abstractC0322Pc.j();
        if (this.f6983z == j4 || j4 <= 0) {
            return;
        }
        float f4 = ((float) j4) / 1000.0f;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10094D1)).booleanValue()) {
            String valueOf = String.valueOf(f4);
            String valueOf2 = String.valueOf(abstractC0322Pc.r());
            String valueOf3 = String.valueOf(abstractC0322Pc.p());
            String valueOf4 = String.valueOf(abstractC0322Pc.q());
            String valueOf5 = String.valueOf(abstractC0322Pc.k());
            N1.n.f1204A.f1212j.getClass();
            c("timeupdate", "time", valueOf, "totalBytes", valueOf2, "qoeCachedBytes", valueOf3, "qoeLoadedBytes", valueOf4, "droppedFrames", valueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f4));
        }
        this.f6983z = j4;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        RunnableC0332Rc runnableC0332Rc = this.f6977s;
        if (z4) {
            runnableC0332Rc.f6804p = false;
            Q1.J j4 = Q1.N.f1668k;
            j4.removeCallbacks(runnableC0332Rc);
            j4.postDelayed(runnableC0332Rc, 250L);
        } else {
            runnableC0332Rc.a();
            this.f6967A = this.f6983z;
        }
        Q1.N.f1668k.post(new RunnableC0332Rc(this, z4, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        boolean z4 = false;
        RunnableC0332Rc runnableC0332Rc = this.f6977s;
        if (i4 == 0) {
            runnableC0332Rc.f6804p = false;
            Q1.J j4 = Q1.N.f1668k;
            j4.removeCallbacks(runnableC0332Rc);
            j4.postDelayed(runnableC0332Rc, 250L);
            z4 = true;
        } else {
            runnableC0332Rc.a();
            this.f6967A = this.f6983z;
        }
        Q1.N.f1668k.post(new RunnableC0332Rc(this, z4, 1));
    }
}
