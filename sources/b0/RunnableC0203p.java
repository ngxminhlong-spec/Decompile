package b0;

import C0.s0;
import O1.C0081p;
import O1.R0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.A8;
import com.google.android.gms.internal.ads.AbstractBinderC0695he;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractBinderC1278v4;
import com.google.android.gms.internal.ads.AbstractC0751is;
import com.google.android.gms.internal.ads.AbstractC0886lz;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1137rt;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.AbstractC1439yu;
import com.google.android.gms.internal.ads.Aq;
import com.google.android.gms.internal.ads.B8;
import com.google.android.gms.internal.ads.Bh;
import com.google.android.gms.internal.ads.BinderC0368Yd;
import com.google.android.gms.internal.ads.BinderC0596f7;
import com.google.android.gms.internal.ads.BinderC0682h7;
import com.google.android.gms.internal.ads.BinderC0854l9;
import com.google.android.gms.internal.ads.Bk;
import com.google.android.gms.internal.ads.Bs;
import com.google.android.gms.internal.ads.C0242Ac;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0258Da;
import com.google.android.gms.internal.ads.C0272Fc;
import com.google.android.gms.internal.ads.C0273Fd;
import com.google.android.gms.internal.ads.C0275Ga;
import com.google.android.gms.internal.ads.C0291Jb;
import com.google.android.gms.internal.ads.C0337Sc;
import com.google.android.gms.internal.ads.C0348Ud;
import com.google.android.gms.internal.ads.C0373Zd;
import com.google.android.gms.internal.ads.C0396ae;
import com.google.android.gms.internal.ads.C0472cB;
import com.google.android.gms.internal.ads.C0515dB;
import com.google.android.gms.internal.ads.C0567ef;
import com.google.android.gms.internal.ads.C0594f5;
import com.google.android.gms.internal.ads.C0639g7;
import com.google.android.gms.internal.ads.C0652ge;
import com.google.android.gms.internal.ads.C0687hC;
import com.google.android.gms.internal.ads.C0766j7;
import com.google.android.gms.internal.ads.C0783ji;
import com.google.android.gms.internal.ads.C0800jz;
import com.google.android.gms.internal.ads.C0813kB;
import com.google.android.gms.internal.ads.C0828kk;
import com.google.android.gms.internal.ads.C0843kz;
import com.google.android.gms.internal.ads.C0871lk;
import com.google.android.gms.internal.ads.C0874ln;
import com.google.android.gms.internal.ads.C0914mk;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.C1202tE;
import com.google.android.gms.internal.ads.C1233u2;
import com.google.android.gms.internal.ads.C1235u4;
import com.google.android.gms.internal.ads.C1335wc;
import com.google.android.gms.internal.ads.C1345wm;
import com.google.android.gms.internal.ads.C1381xf;
import com.google.android.gms.internal.ads.C1464zc;
import com.google.android.gms.internal.ads.Ci;
import com.google.android.gms.internal.ads.Ck;
import com.google.android.gms.internal.ads.D2;
import com.google.android.gms.internal.ads.D3;
import com.google.android.gms.internal.ads.Ei;
import com.google.android.gms.internal.ads.Fq;
import com.google.android.gms.internal.ads.Gt;
import com.google.android.gms.internal.ads.Gu;
import com.google.android.gms.internal.ads.InterfaceC0280Ha;
import com.google.android.gms.internal.ads.InterfaceC0308Md;
import com.google.android.gms.internal.ads.InterfaceC0738ie;
import com.google.android.gms.internal.ads.InterfaceC1024p7;
import com.google.android.gms.internal.ads.InterfaceC1321w4;
import com.google.android.gms.internal.ads.Ji;
import com.google.android.gms.internal.ads.Jp;
import com.google.android.gms.internal.ads.K8;
import com.google.android.gms.internal.ads.KA;
import com.google.android.gms.internal.ads.Ki;
import com.google.android.gms.internal.ads.Kp;
import com.google.android.gms.internal.ads.M8;
import com.google.android.gms.internal.ads.N7;
import com.google.android.gms.internal.ads.O8;
import com.google.android.gms.internal.ads.OC;
import com.google.android.gms.internal.ads.Of;
import com.google.android.gms.internal.ads.Ok;
import com.google.android.gms.internal.ads.P7;
import com.google.android.gms.internal.ads.Pp;
import com.google.android.gms.internal.ads.Q8;
import com.google.android.gms.internal.ads.Qk;
import com.google.android.gms.internal.ads.R8;
import com.google.android.gms.internal.ads.RunnableC1207td;
import com.google.android.gms.internal.ads.S8;
import com.google.android.gms.internal.ads.SurfaceHolderCallbackC0730iC;
import com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC0312Nc;
import com.google.android.gms.internal.ads.Ui;
import com.google.android.gms.internal.ads.VB;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC0358Wd;
import com.google.android.gms.internal.ads.Xj;
import com.google.android.gms.internal.ads.Y8;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.ads.Z8;
import com.google.android.gms.internal.ads.Zf;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.measurement.C1509e0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k.C1748e;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0203p implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3377o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f3378p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f3379q;

    public /* synthetic */ RunnableC0203p(int i4, Object obj, Object obj2) {
        this.f3377o = i4;
        this.f3378p = obj;
        this.f3379q = obj2;
    }

    public RunnableC0203p(C0206s c0206s, C0202o c0202o, int i4) {
        this.f3377o = 0;
        this.f3379q = c0206s;
        this.f3378p = c0202o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC0203p(Ki ki, Ui ui) {
        this.f3377o = 23;
        this.f3378p = ki;
        this.f3379q = (AbstractBinderC1149s4) ui;
    }

    public /* synthetic */ RunnableC0203p(Object obj, Object obj2, int i4, boolean z4) {
        this.f3377o = i4;
        this.f3379q = obj;
        this.f3378p = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r1 == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f3379q
            com.google.android.gms.internal.ads.I4 r0 = (com.google.android.gms.internal.ads.I4) r0
            java.lang.Object r1 = r11.f3378p
            android.view.View r1 = (android.view.View) r1
            com.google.android.gms.internal.ads.E4 r2 = new com.google.android.gms.internal.ads.E4     // Catch: java.lang.Exception -> L5a
            int r3 = r0.f5541t     // Catch: java.lang.Exception -> L5a
            int r4 = r0.f5542u     // Catch: java.lang.Exception -> L5a
            int r5 = r0.f5543v     // Catch: java.lang.Exception -> L5a
            int r6 = r0.f5544w     // Catch: java.lang.Exception -> L5a
            int r7 = r0.f5545x     // Catch: java.lang.Exception -> L5a
            int r8 = r0.y     // Catch: java.lang.Exception -> L5a
            int r9 = r0.f5546z     // Catch: java.lang.Exception -> L5a
            boolean r10 = r0.f5534C     // Catch: java.lang.Exception -> L5a
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L5a
            N1.n r3 = N1.n.f1204A     // Catch: java.lang.Exception -> L5a
            A2.o r3 = r3.f1208f     // Catch: java.lang.Exception -> L5a
            android.app.Application r3 = r3.f()     // Catch: java.lang.Exception -> L5a
            if (r3 == 0) goto L5c
            java.lang.String r4 = r0.f5532A     // Catch: java.lang.Exception -> L5a
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L5a
            if (r4 != 0) goto L5c
            android.content.res.Resources r4 = r3.getResources()     // Catch: java.lang.Exception -> L5a
            com.google.android.gms.internal.ads.n6 r5 = com.google.android.gms.internal.ads.AbstractC1066q6.f10145P     // Catch: java.lang.Exception -> L5a
            O1.r r6 = O1.r.d     // Catch: java.lang.Exception -> L5a
            com.google.android.gms.internal.ads.p6 r6 = r6.c     // Catch: java.lang.Exception -> L5a
            java.lang.Object r5 = r6.a(r5)     // Catch: java.lang.Exception -> L5a
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L5a
            java.lang.String r6 = "id"
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L5a
            int r3 = r4.getIdentifier(r5, r6, r3)     // Catch: java.lang.Exception -> L5a
            java.lang.Object r3 = r1.getTag(r3)     // Catch: java.lang.Exception -> L5a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L5a
            if (r3 == 0) goto L5c
            java.lang.String r4 = r0.f5532A     // Catch: java.lang.Exception -> L5a
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L5a
            if (r3 != 0) goto L74
            goto L5c
        L5a:
            r0 = move-exception
            goto L94
        L5c:
            H.i r1 = r0.b(r1, r2)     // Catch: java.lang.Exception -> L5a
            r2.c()     // Catch: java.lang.Exception -> L5a
            int r3 = r1.f824a     // Catch: java.lang.Exception -> L5a
            if (r3 != 0) goto L6b
            int r3 = r1.f825b     // Catch: java.lang.Exception -> L5a
            if (r3 == 0) goto L74
        L6b:
            int r1 = r1.f825b     // Catch: java.lang.Exception -> L5a
            if (r1 != 0) goto L75
            int r1 = r2.f4843k     // Catch: java.lang.Exception -> L5a
            if (r1 == 0) goto L74
            goto L77
        L74:
            return
        L75:
            if (r1 != 0) goto L8e
        L77:
            com.google.android.gms.internal.ads.J2 r1 = r0.f5539r     // Catch: java.lang.Exception -> L5a
            java.lang.Object r3 = r1.f5780q     // Catch: java.lang.Exception -> L5a
            monitor-enter(r3)     // Catch: java.lang.Exception -> L5a
            java.lang.Object r1 = r1.f5781r     // Catch: java.lang.Throwable -> L88
            java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch: java.lang.Throwable -> L88
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L8a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L88
            return
        L88:
            r0 = move-exception
            goto L8c
        L8a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L88
            goto L8e
        L8c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L88
            throw r0     // Catch: java.lang.Exception -> L5a
        L8e:
            com.google.android.gms.internal.ads.J2 r0 = r0.f5539r     // Catch: java.lang.Exception -> L5a
            r0.f(r2)     // Catch: java.lang.Exception -> L5a
            return
        L94:
            java.lang.String r1 = "Exception in fetchContentOnUIThread"
            com.google.android.gms.internal.ads.Y9.q(r1, r0)
            java.lang.String r1 = "ContentFetchTask.fetchContent"
            N1.n r2 = N1.n.f1204A
            com.google.android.gms.internal.ads.pc r2 = r2.f1209g
            r2.h(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.RunnableC0203p.a():void");
    }

    private final void b() {
        C0291Jb c0291Jb = (C0291Jb) this.f3378p;
        Bitmap bitmap = (Bitmap) this.f3379q;
        c0291Jb.getClass();
        C0800jz c0800jz = AbstractC0886lz.f9510p;
        C0843kz c0843kz = new C0843kz();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, c0843kz);
        synchronized (c0291Jb.f5862h) {
            KA ka = c0291Jb.f5857a;
            C0472cB v4 = C0515dB.v();
            AbstractC0886lz a4 = c0843kz.a();
            v4.d();
            C0515dB.x((C0515dB) v4.f4561p, a4);
            v4.d();
            C0515dB.w((C0515dB) v4.f4561p);
            v4.d();
            C0515dB.y((C0515dB) v4.f4561p);
            C0515dB c0515dB = (C0515dB) v4.b();
            ka.d();
            C0813kB.F((C0813kB) ka.f4561p, c0515dB);
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [android.widget.RelativeLayout, android.view.View, com.google.android.gms.internal.ads.g7, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    private final void c() {
        ViewGroup viewGroup;
        View view;
        int i4;
        View view2;
        ViewGroup viewGroup2;
        InterfaceC1024p7 a4;
        Drawable drawable;
        Ki ki = (Ki) this.f3378p;
        ?? r32 = (AbstractBinderC1149s4) this.f3379q;
        Ci ci = ki.d;
        Ei ei = ki.c;
        if (ei.e() || ei.d()) {
            String[] strArr = {"1098", "3011"};
            for (int i5 = 0; i5 < 2; i5++) {
                View G12 = r32.G1(strArr[i5]);
                if (G12 != null && (G12 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) G12;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = r32.d().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        synchronized (ci) {
            view = ci.d;
        }
        if (view != null) {
            C0766j7 c0766j7 = ki.f6044i;
            view2 = ci.F();
            if (c0766j7 != null && viewGroup == null) {
                Ki.b(layoutParams, c0766j7.f9129s);
                view2.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (ci.L() instanceof BinderC0596f7) {
            BinderC0596f7 binderC0596f7 = (BinderC0596f7) ci.L();
            if (viewGroup == null) {
                Ki.b(layoutParams, binderC0596f7.f8688v);
                viewGroup = null;
            }
            ?? relativeLayout = new RelativeLayout(context);
            h2.y.i(binderC0596f7);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(C0639g7.f8785p, null, null));
            shapeDrawable.getPaint().setColor(binderC0596f7.f8684r);
            relativeLayout.setLayoutParams(layoutParams);
            relativeLayout.setBackground(shapeDrawable);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            String str = binderC0596f7.f8681o;
            if (TextUtils.isEmpty(str)) {
                i4 = 1;
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                TextView textView = new TextView(context);
                textView.setLayoutParams(layoutParams3);
                textView.setId(1195835393);
                textView.setTypeface(Typeface.DEFAULT);
                textView.setText(str);
                textView.setTextColor(binderC0596f7.f8685s);
                textView.setTextSize(binderC0596f7.f8686t);
                C1335wc c1335wc = C0081p.f1374f.f1375a;
                textView.setPadding(C1335wc.l(context, 4), 0, C1335wc.i(context.getResources().getDisplayMetrics(), 4), 0);
                relativeLayout.addView(textView);
                i4 = 1;
                layoutParams2.addRule(1, textView.getId());
            }
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(layoutParams2);
            imageView.setId(1195835394);
            ArrayList arrayList = binderC0596f7.f8682p;
            if (arrayList != null && arrayList.size() > i4) {
                relativeLayout.f8786o = new AnimationDrawable();
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    int i7 = i6 + 1;
                    try {
                        relativeLayout.f8786o.addFrame((Drawable) BinderC1813b.C2(((BinderC0682h7) arrayList.get(i6)).d()), binderC0596f7.f8687u);
                    } catch (Exception e4) {
                        Y9.q("Error while getting drawable.", e4);
                    }
                    i6 = i7;
                }
                imageView.setBackground(relativeLayout.f8786o);
            } else if (arrayList.size() == 1) {
                try {
                    imageView.setImageDrawable((Drawable) BinderC1813b.C2(((BinderC0682h7) arrayList.get(0)).d()));
                } catch (Exception e5) {
                    Y9.q("Error while getting drawable.", e5);
                }
            }
            relativeLayout.addView(imageView);
            relativeLayout.setContentDescription((CharSequence) O1.r.d.c.a(AbstractC1066q6.f10251l3));
            view2 = relativeLayout;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            if (view2.getParent() instanceof ViewGroup) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view2);
            } else {
                RelativeLayout relativeLayout2 = new RelativeLayout(r32.d().getContext());
                relativeLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                relativeLayout2.addView(view2);
                FrameLayout f4 = r32.f();
                if (f4 != null) {
                    f4.addView(relativeLayout2);
                }
            }
            r32.C2(view2, r32.k());
        }
        Gt gt = Ji.f5875D;
        int i8 = gt.f5346r;
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                viewGroup2 = null;
                break;
            }
            View G13 = r32.G1((String) gt.get(i9));
            i9++;
            if (G13 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) G13;
                break;
            }
        }
        ki.f6043h.execute(new RunnableC0203p(22, ki, viewGroup2));
        if (viewGroup2 == null) {
            return;
        }
        if (ki.c(viewGroup2, true)) {
            if (ci.Q() != null) {
                ci.Q().V(new C0783ji((Ui) r32, viewGroup2));
                return;
            }
            return;
        }
        C0937n6 c0937n6 = AbstractC1066q6.F8;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue() && ki.c(viewGroup2, false)) {
            if (ci.O() != null) {
                ci.O().V(new C0783ji((Ui) r32, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View d = r32.d();
        Context context2 = d != null ? d.getContext() : null;
        if (context2 == null || (a4 = ki.f6045j.a()) == null) {
            return;
        }
        try {
            InterfaceC1812a g4 = a4.g();
            if (g4 == null || (drawable = (Drawable) BinderC1813b.C2(g4)) == null) {
                return;
            }
            ImageView imageView2 = new ImageView(context2);
            imageView2.setImageDrawable(drawable);
            InterfaceC1812a j4 = r32.j();
            if (j4 != null) {
                if (((Boolean) rVar.c.a(AbstractC1066q6.q5)).booleanValue()) {
                    imageView2.setScaleType((ImageView.ScaleType) BinderC1813b.C2(j4));
                    imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView2);
                }
            }
            imageView2.setScaleType(Ki.f6037k);
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView2);
        } catch (RemoteException unused) {
            Y9.s("Could not get main image drawable");
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.Hu, com.google.android.gms.internal.ads.yu] */
    private final void d() {
        Pp b4;
        Executor executor;
        Ck ck;
        final Ck ck2 = (Ck) ((Xj) this.f3378p).f7687p;
        String str = (String) this.f3379q;
        int i4 = 5;
        Aq f4 = Zf.f(ck2.f4528f, 5);
        f4.f();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final Aq f5 = Zf.f(ck2.f4528f, i4);
                f5.f();
                f5.F(next);
                final Object obj = new Object();
                final C0272Fc c0272Fc = new C0272Fc();
                InterfaceFutureC0239a o02 = Bs.o0(c0272Fc, ((Long) O1.r.d.c.a(AbstractC1066q6.f10084B1)).longValue(), TimeUnit.SECONDS, ck2.f4533k);
                ck2.f4534l.b(next);
                ck2.f4537o.y(next);
                N1.n.f1204A.f1212j.getClass();
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                o02.a(new Runnable() { // from class: com.google.android.gms.internal.ads.Ak
                    @Override // java.lang.Runnable
                    public final void run() {
                        Ck ck3 = ck2;
                        Object obj2 = obj;
                        C0272Fc c0272Fc2 = c0272Fc;
                        String str2 = next;
                        long j4 = elapsedRealtime;
                        Aq aq = f5;
                        ck3.getClass();
                        synchronized (obj2) {
                            try {
                                if (!c0272Fc2.f5017o.isDone()) {
                                    N1.n.f1204A.f1212j.getClass();
                                    ck3.d(str2, (int) (SystemClock.elapsedRealtime() - j4), "Timeout.", false);
                                    ck3.f4534l.a(str2, "timeout");
                                    ck3.f4537o.v(str2, "timeout");
                                    Fq fq = ck3.f4538p;
                                    aq.y("Timeout");
                                    aq.b(false);
                                    fq.b(aq.l());
                                    c0272Fc2.b(Boolean.FALSE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, ck2.f4531i);
                arrayList.add(o02);
                Bk bk = new Bk(elapsedRealtime, c0272Fc, ck2, f5, obj, next);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i5 = 0;
                        while (i5 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i5);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new B8(bundle, optString));
                            i5++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                ck2.d(next, 0, "", false);
                try {
                    b4 = ck2.f4530h.b(next, new JSONObject());
                    executor = ck2.f4532j;
                    try {
                        ck = ck2;
                    } catch (Kp unused2) {
                    }
                } catch (Kp unused3) {
                }
                try {
                    ck2 = ck;
                    executor.execute(new RunnableC1207td(ck, next, bk, b4, arrayList2));
                } catch (Kp unused4) {
                    ck2 = ck;
                    bk = bk;
                    try {
                        bk.K3("Failed to create Adapter.");
                    } catch (RemoteException e4) {
                        Y9.q("", e4);
                    }
                    i4 = 5;
                } catch (JSONException e5) {
                    e = e5;
                    ck2 = ck;
                    Q1.I.x("Malformed CLD response", e);
                    ck2.f4537o.o("MalformedJson");
                    C0871lk c0871lk = ck2.f4534l;
                    synchronized (c0871lk) {
                        C0937n6 c0937n6 = AbstractC1066q6.f10134M1;
                        O1.r rVar = O1.r.d;
                        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                            if (!((Boolean) rVar.c.a(AbstractC1066q6.B7)).booleanValue()) {
                                HashMap e6 = c0871lk.e();
                                e6.put("action", "aaia");
                                e6.put("aair", "MalformedJson");
                                c0871lk.f9457b.add(e6);
                            }
                        }
                    }
                    ck2.f4527e.c(e);
                    N1.n.f1204A.f1209g.h("AdapterInitializer.updateAdapterStatus", e);
                    Fq fq = ck2.f4538p;
                    f4.d(e);
                    f4.b(false);
                    fq.b(f4.l());
                    return;
                }
                i4 = 5;
            }
            AbstractC1137rt r4 = AbstractC1137rt.r(arrayList);
            B0.v vVar = new B0.v(9, ck2, f4);
            Executor executor2 = ck2.f4531i;
            ?? abstractC1439yu = new AbstractC1439yu(r4, false, false);
            abstractC1439yu.f5517D = new Gu(abstractC1439yu, vVar, executor2);
            abstractC1439yu.v();
        } catch (JSONException e7) {
            e = e7;
        }
    }

    private final void e() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Qk qk = (Qk) this.f3378p;
        String str = (String) this.f3379q;
        Ok ok = qk.f6682q;
        synchronized (ok) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("platform", "ANDROID");
                    if (!TextUtils.isEmpty(ok.f6499h)) {
                        jSONObject.put("sdkVersion", "afma-sdk-a-v" + ok.f6499h);
                    }
                    jSONObject.put("internalSdkVersion", ok.f6498g);
                    jSONObject.put("osVersion", Build.VERSION.RELEASE);
                    jSONObject.put("adapters", ok.d.a());
                    C0937n6 c0937n6 = AbstractC1066q6.p8;
                    O1.r rVar = O1.r.d;
                    if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                        String str2 = N1.n.f1204A.f1209g.f9972g;
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("plugin", str2);
                        }
                    }
                    long j4 = ok.f6505n;
                    N1.n nVar = N1.n.f1204A;
                    nVar.f1212j.getClass();
                    if (j4 < System.currentTimeMillis() / 1000) {
                        ok.f6503l = "{}";
                    }
                    jSONObject.put("networkExtras", ok.f6503l);
                    jSONObject.put("adSlots", ok.h());
                    jSONObject.put("appInfo", ok.f6496e.f());
                    String str3 = nVar.f1209g.c().x().f9735e;
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("cld", new JSONObject(str3));
                    }
                    if (((Boolean) rVar.c.a(AbstractC1066q6.f8)).booleanValue() && (jSONObject2 = ok.f6504m) != null) {
                        Y9.m("Server data: " + jSONObject2.toString());
                        jSONObject.put("serverData", ok.f6504m);
                    }
                    if (((Boolean) rVar.c.a(AbstractC1066q6.e8)).booleanValue()) {
                        jSONObject.put("openAction", ok.f6510s);
                        jSONObject.put("gesture", ok.f6506o);
                    }
                    jSONObject.put("isGamRegisteredTestDevice", nVar.f1215m.j());
                    C1335wc c1335wc = C0081p.f1374f.f1375a;
                    jSONObject.put("isSimulator", C1335wc.j());
                } catch (JSONException e4) {
                    N1.n.f1204A.f1209g.g("Inspector.toJson", e4);
                    Y9.t("Ad inspector encountered an error", e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        qk.f6683r.f7165o.R0("window.inspectorInfo", jSONObject.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.google.android.gms.internal.ads.VC] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.RC, java.lang.Object, com.google.android.gms.internal.ads.ro] */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        MediaFormat format;
        Runnable runnable;
        Object obj = null;
        int i5 = 1;
        ?? r5 = 0;
        int i6 = 0;
        switch (this.f3377o) {
            case 0:
                C0202o c0202o = (C0202o) this.f3378p;
                C0206s c0206s = (C0206s) this.f3379q;
                RecyclerView recyclerView = c0206s.f3399q;
                if (recyclerView == null || !recyclerView.f3033E || c0202o.f3369k || c0202o.f3363e.b() == -1) {
                    return;
                }
                AbstractC0175I itemAnimator = c0206s.f3399q.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.f()) {
                    ?? r02 = c0206s.f3398p;
                    int size = r02.size();
                    while (r5 < size) {
                        if (((C0202o) r02.get(r5)).f3370l) {
                            r5++;
                        }
                    }
                    c0206s.f3395m.getClass();
                    return;
                }
                c0206s.f3399q.post(this);
                return;
            case 1:
                C0258Da c0258Da = (C0258Da) this.f3378p;
                C0914mk c0914mk = (C0914mk) this.f3379q;
                int i7 = AbstractC0751is.f9071a;
                s0 s0Var = ((SurfaceHolderCallbackC0730iC) c0258Da.f4619q).f9035o.f9425z;
                s0Var.f(25, new C0687hC(c0914mk));
                s0Var.e();
                return;
            case 2:
                C0258Da c0258Da2 = (C0258Da) this.f3378p;
                VB vb = (VB) this.f3379q;
                synchronized (vb) {
                }
                int i8 = AbstractC0751is.f9071a;
                ?? r03 = ((SurfaceHolderCallbackC0730iC) c0258Da2.f4619q).f9035o.f9386E;
                OC f4 = r03.f((C1202tE) r03.f7251r.f8076o);
                ?? obj2 = new Object();
                obj2.f6796o = vb;
                r03.e(f4, 1020, obj2);
                return;
            case 3:
                try {
                    ((C1233u2) this.f3379q).f10773p.put((D2) this.f3378p);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 4:
                a();
                return;
            case 5:
                if (((C0594f5) this.f3378p).isCancelled()) {
                    ((Future) this.f3379q).cancel(true);
                    return;
                }
                return;
            case 6:
                boolean booleanValue = ((Boolean) O1.r.d.c.a(AbstractC1066q6.l4)).booleanValue();
                A2.o oVar = (A2.o) this.f3378p;
                Context context = (Context) this.f3379q;
                if (booleanValue) {
                    try {
                        try {
                            IBinder b4 = AbstractC1230u.J(context).b("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger");
                            int i9 = AbstractBinderC1278v4.f10981o;
                            if (b4 != null) {
                                IInterface queryLocalInterface = b4.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                                obj = queryLocalInterface instanceof InterfaceC1321w4 ? (InterfaceC1321w4) queryLocalInterface : new AbstractC1106r4(b4, "com.google.android.gms.ads.clearcut.IClearcut", 0);
                            }
                            oVar.f36q = obj;
                            ((C1235u4) ((InterfaceC1321w4) oVar.f36q)).W2(new BinderC1813b(context));
                            oVar.f35p = true;
                            return;
                        } catch (Exception e4) {
                            throw new Exception(e4);
                        }
                    } catch (RemoteException | C1464zc | NullPointerException unused2) {
                        Y9.m("Cannot dynamite load clearcut");
                        return;
                    }
                }
                return;
            case 7:
                Z8 z8 = (Z8) this.f3378p;
                Y8 y8 = (Y8) this.f3379q;
                String str = z8.f7964a;
                N1.n.f1204A.f1212j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                try {
                    Q1.I.w("loadJavascriptEngine > Before createJavascriptEngine");
                    M8 m8 = new M8((Context) z8.d, (C0248Bc) z8.f7966e);
                    Q1.I.w("loadJavascriptEngine > After createJavascriptEngine");
                    Q1.I.w("loadJavascriptEngine > Before setting new engine loaded listener");
                    m8.f6219o.f7165o.f7464A.f8148v = new C0874ln(11, new Q8(z8, arrayList, currentTimeMillis, y8, m8));
                    Q1.I.w("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    m8.r("/jsLoaded", new R8(z8, currentTimeMillis, y8, m8));
                    x0.f fVar = new x0.f(20, (boolean) r5);
                    S8 s8 = new S8(z8, m8, fVar);
                    fVar.f15212p = s8;
                    Q1.I.w("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    m8.r("/requestReload", s8);
                    Q1.I.w("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
                    if (str.endsWith(".js")) {
                        Q1.I.w("loadJavascriptEngine > Before newEngine.loadJavascript");
                        M8.a(new K8(m8, "<!DOCTYPE html><html><head><script src=\"" + str + "\"></script></head><body></body></html>", 3));
                        Q1.I.w("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str.startsWith("<html>")) {
                        Q1.I.w("loadJavascriptEngine > Before newEngine.loadHtml");
                        M8.a(new K8(m8, str, 2));
                        Q1.I.w("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        Q1.I.w("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        M8.a(new K8(m8, str, r5));
                        Q1.I.w("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    Q1.I.w("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    Q1.N.f1668k.postDelayed(new O8(z8, y8, m8, arrayList, currentTimeMillis, 1), ((Integer) O1.r.d.c.a(AbstractC1066q6.c)).intValue());
                    return;
                } catch (Throwable th) {
                    Y9.q("Error creating webview.", th);
                    N1.n.f1204A.f1209g.h("SdkJavascriptFactory.loadJavascriptEngine", th);
                    ((C0272Fc) y8.f5574a).c(new Exception());
                    return;
                }
            case 8:
                Context context2 = (Context) this.f3378p;
                AbstractC1066q6.a(context2);
                Bundle bundle = new Bundle();
                C0937n6 c0937n6 = AbstractC1066q6.f10203b0;
                O1.r rVar = O1.r.d;
                bundle.putBoolean("measurementEnabled", ((Boolean) rVar.c.a(c0937n6)).booleanValue());
                if (((Boolean) rVar.c.a(AbstractC1066q6.f10235i0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                C1748e c1748e = C1509e0.e(context2, "am", (String) this.f3379q, bundle).f11909b;
                try {
                    try {
                        IBinder b5 = AbstractC1230u.J(context2).b("com.google.android.gms.ads.measurement.DynamiteMeasurementManager");
                        int i10 = AbstractBinderC0695he.f8950o;
                        if (b5 != null) {
                            IInterface queryLocalInterface2 = b5.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
                            obj = queryLocalInterface2 instanceof InterfaceC0738ie ? (InterfaceC0738ie) queryLocalInterface2 : new AbstractC1106r4(b5, "com.google.android.gms.ads.measurement.IMeasurementManager", 0);
                        }
                        BinderC1813b binderC1813b = new BinderC1813b(context2);
                        BinderC0854l9 binderC0854l9 = new BinderC0854l9(c1748e);
                        C0652ge c0652ge = (C0652ge) obj;
                        Parcel Q3 = c0652ge.Q();
                        AbstractC1192t4.e(Q3, binderC1813b);
                        AbstractC1192t4.e(Q3, binderC0854l9);
                        c0652ge.G1(Q3, 2);
                        return;
                    } catch (Exception e5) {
                        throw new Exception(e5);
                    }
                } catch (RemoteException e6) {
                    e = e6;
                    Y9.u("#007 Could not call remote method.", e);
                    return;
                } catch (C1464zc e7) {
                    e = e7;
                    Y9.u("#007 Could not call remote method.", e);
                    return;
                } catch (NullPointerException e8) {
                    e = e8;
                    Y9.u("#007 Could not call remote method.", e);
                    return;
                }
            case 9:
                C2033d c2033d = N1.n.f1204A.f1206b;
                C2033d.m(((zzbsh) this.f3379q).f11700a, (AdOverlayInfoParcel) this.f3378p, true);
                return;
            case 10:
                ((C0242Ac) this.f3378p).o((String) this.f3379q);
                return;
            case 11:
                b();
                return;
            case 12:
                C0272Fc c0272Fc = (C0272Fc) this.f3379q;
                try {
                    c0272Fc.b(L1.b.a((Context) this.f3378p));
                    return;
                } catch (e2.g | IOException | IllegalStateException e9) {
                    c0272Fc.c(e9);
                    Y9.q("Exception while getting advertising Id info", e9);
                    return;
                }
            case 13:
                TextureViewSurfaceTextureListenerC0312Nc textureViewSurfaceTextureListenerC0312Nc = (TextureViewSurfaceTextureListenerC0312Nc) this.f3379q;
                InterfaceC0308Md interfaceC0308Md = textureViewSurfaceTextureListenerC0312Nc.f6327q;
                MediaPlayer mediaPlayer = (MediaPlayer) this.f3378p;
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10094D1)).booleanValue() && interfaceC0308Md != null && mediaPlayer != null) {
                    try {
                        MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                        if (trackInfo != null) {
                            HashMap hashMap = new HashMap();
                            while (i6 < trackInfo.length) {
                                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i6];
                                if (trackInfo2 == null) {
                                    i4 = i6;
                                } else {
                                    int trackType = trackInfo2.getTrackType();
                                    i4 = i6;
                                    if (trackType == i5) {
                                        MediaFormat format2 = trackInfo2.getFormat();
                                        if (format2 != null) {
                                            if (format2.containsKey("frame-rate")) {
                                                try {
                                                    hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                                } catch (ClassCastException unused3) {
                                                    hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                                }
                                            }
                                            if (format2.containsKey("bitrate")) {
                                                Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                                textureViewSurfaceTextureListenerC0312Nc.f6326F = valueOf;
                                                hashMap.put("bitRate", String.valueOf(valueOf));
                                            }
                                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                                hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                            }
                                            if (format2.containsKey("mime")) {
                                                hashMap.put("videoMime", format2.getString("mime"));
                                            }
                                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                                hashMap.put("videoCodec", format2.getString("codecs-string"));
                                            }
                                        }
                                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                        if (format.containsKey("mime")) {
                                            hashMap.put("audioMime", format.getString("mime"));
                                        }
                                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                            hashMap.put("audioCodec", format.getString("codecs-string"));
                                        }
                                    }
                                }
                                i6 = i4 + 1;
                                i5 = 1;
                            }
                            if (!hashMap.isEmpty()) {
                                interfaceC0308Md.b("onMetadataEvent", hashMap);
                            }
                        }
                    } catch (RuntimeException e10) {
                        N1.n.f1204A.f1209g.h("AdMediaPlayerView.reportMetadata", e10);
                    }
                }
                C0337Sc c0337Sc = textureViewSurfaceTextureListenerC0312Nc.f6324D;
                if (c0337Sc != null) {
                    c0337Sc.f();
                    return;
                }
                return;
            case 14:
                AtomicInteger atomicInteger = C0273Fd.f5018I;
                ((InterfaceC0308Md) this.f3378p).b("onGcacheInfoEvent", (HashMap) this.f3379q);
                return;
            case 15:
                ((BinderC0368Yd) this.f3378p).f7845o.b("pubVideoCmd", (HashMap) this.f3379q);
                return;
            case 16:
                C0373Zd c0373Zd = (C0373Zd) this.f3378p;
                Uri parse = Uri.parse((String) this.f3379q);
                C0396ae c0396ae = ((ViewTreeObserverOnGlobalLayoutListenerC0358Wd) c0373Zd.f8018b.f6208p).f7464A;
                if (c0396ae == null) {
                    Y9.p("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                } else {
                    c0396ae.X(parse);
                    return;
                }
            case 17:
                C0567ef c0567ef = (C0567ef) this.f3378p;
                Throwable th2 = (Throwable) this.f3379q;
                InterfaceC0280Ha b6 = C0275Ga.b(c0567ef.f8623a);
                c0567ef.f8628h = b6;
                b6.g("AttributionReporting", th2);
                return;
            case 18:
                ((InterfaceC0308Md) this.f3378p).l("AFMA_updateActiveView", (JSONObject) this.f3379q);
                return;
            case 19:
                ((C1381xf) this.f3378p).f11273o.l("AFMA_updateActiveView", (JSONObject) this.f3379q);
                return;
            case 20:
                Of of = (Of) this.f3378p;
                D3 d32 = (D3) this.f3379q;
                AtomicReference atomicReference = (AtomicReference) d32.f4583p;
                try {
                    P7 p7 = of.f6480j;
                    BinderC1813b binderC1813b2 = new BinderC1813b(d32);
                    N7 n7 = (N7) p7;
                    Parcel Q4 = n7.Q();
                    AbstractC1192t4.e(Q4, binderC1813b2);
                    Parcel q12 = n7.q1(Q4, 2);
                    if (q12.readInt() == 0) {
                        i5 = 0;
                    }
                    q12.recycle();
                    if (i5 != 0 || (runnable = (Runnable) atomicReference.getAndSet(null)) == null) {
                        return;
                    }
                    runnable.run();
                    return;
                } catch (RemoteException unused4) {
                    Runnable runnable2 = (Runnable) atomicReference.getAndSet(null);
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
            case 21:
                try {
                    ((Bh) this.f3378p).mo3l(this.f3379q);
                    return;
                } catch (Throwable th3) {
                    N1.n.f1204A.f1209g.g("EventEmitter.notify", th3);
                    Q1.I.x("Event emitter exception.", th3);
                    return;
                }
            case 22:
                Ki ki = (Ki) this.f3378p;
                ViewGroup viewGroup = (ViewGroup) this.f3379q;
                Jp jp = ki.f6039b;
                Q1.K k3 = ki.f6038a;
                Ci ci = ki.d;
                if (ci.G() != null) {
                    boolean z4 = viewGroup != null;
                    if (ci.D() == 2 || ci.D() == 1) {
                        k3.j(jp.f5911f, String.valueOf(ci.D()), z4);
                        return;
                    } else {
                        if (ci.D() == 6) {
                            k3.j(jp.f5911f, "2", z4);
                            k3.j(jp.f5911f, "1", z4);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 23:
                c();
                return;
            case 24:
                ((C0828kk) this.f3378p).d.o((String) this.f3379q);
                return;
            case 25:
                ((Ck) this.f3378p).f4531i.execute(new D3(28, (C0272Fc) this.f3379q));
                return;
            case 26:
                try {
                    ((A8) this.f3379q).Q1(((Ck) this.f3378p).a());
                    return;
                } catch (RemoteException e11) {
                    Y9.q("", e11);
                    return;
                }
            case 27:
                d();
                return;
            case 28:
                e();
                return;
            default:
                C1345wm c1345wm = (C1345wm) this.f3378p;
                C0348Ud c0348Ud = (C0348Ud) this.f3379q;
                c0348Ud.B();
                BinderC0368Yd p3 = c0348Ud.f7165o.p();
                R0 r04 = c1345wm.d.f5908a;
                if (r04 == null || p3 == null) {
                    return;
                }
                p3.M3(r04);
                return;
        }
    }
}
