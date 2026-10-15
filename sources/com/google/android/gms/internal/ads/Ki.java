package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ki {

    /* renamed from: k, reason: collision with root package name */
    public static final ImageView.ScaleType f6037k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    public final Q1.K f6038a;

    /* renamed from: b, reason: collision with root package name */
    public final Jp f6039b;
    public final Ei c;
    public final Ci d;

    /* renamed from: e, reason: collision with root package name */
    public final Pi f6040e;

    /* renamed from: f, reason: collision with root package name */
    public final Ti f6041f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f6042g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f6043h;

    /* renamed from: i, reason: collision with root package name */
    public final C0766j7 f6044i;

    /* renamed from: j, reason: collision with root package name */
    public final Ai f6045j;

    public Ki(Q1.K k3, Jp jp, Ei ei, Ci ci, Pi pi, Ti ti, Executor executor, C0260Dc c0260Dc, Ai ai) {
        this.f6038a = k3;
        this.f6039b = jp;
        this.f6044i = jp.f5914i;
        this.c = ei;
        this.d = ci;
        this.f6040e = pi;
        this.f6041f = ti;
        this.f6042g = executor;
        this.f6043h = c0260Dc;
        this.f6045j = ai;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i4) {
        if (i4 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i4 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i4 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(Ui ui) {
        if (ui == null) {
            return;
        }
        Context context = ui.d().getContext();
        if (com.google.android.gms.internal.play_billing.B.f0(context, this.c.f4913a)) {
            if (!(context instanceof Activity)) {
                Y9.m("Activity context is needed for policy validator.");
                return;
            }
            Ti ti = this.f6041f;
            if (ti == null || ui.f() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(ti.a(ui.f(), windowManager), com.google.android.gms.internal.play_billing.B.X());
            } catch (C0333Rd e4) {
                Q1.I.x("web view can not be obtained", e4);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z4) {
        View view;
        View view2;
        if (z4) {
            view2 = this.d.G();
        } else {
            Ci ci = this.d;
            synchronized (ci) {
                view = ci.f4515p;
            }
            view2 = view;
        }
        if (view2 == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view2.getParent() instanceof ViewGroup) {
            ((ViewGroup) view2.getParent()).removeView(view2);
        }
        viewGroup.addView(view2, ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10261n3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
