package androidx.appcompat.widget;

import H.F;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import f.k;
import f.q;
import k.m;
import l.C1763e;
import l.C1773j;
import l.G0;
import l.P;
import l.Q;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public TypedValue f2547o;

    /* renamed from: p, reason: collision with root package name */
    public TypedValue f2548p;

    /* renamed from: q, reason: collision with root package name */
    public TypedValue f2549q;

    /* renamed from: r, reason: collision with root package name */
    public TypedValue f2550r;

    /* renamed from: s, reason: collision with root package name */
    public TypedValue f2551s;

    /* renamed from: t, reason: collision with root package name */
    public TypedValue f2552t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f2553u;

    /* renamed from: v, reason: collision with root package name */
    public P f2554v;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2553u = new Rect();
    }

    public final void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2551s == null) {
            this.f2551s = new TypedValue();
        }
        return this.f2551s;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2552t == null) {
            this.f2552t = new TypedValue();
        }
        return this.f2552t;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2549q == null) {
            this.f2549q = new TypedValue();
        }
        return this.f2549q;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2550r == null) {
            this.f2550r = new TypedValue();
        }
        return this.f2550r;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2547o == null) {
            this.f2547o = new TypedValue();
        }
        return this.f2547o;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2548p == null) {
            this.f2548p = new TypedValue();
        }
        return this.f2548p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        P p3 = this.f2554v;
        if (p3 != null) {
            p3.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1773j c1773j;
        super.onDetachedFromWindow();
        P p3 = this.f2554v;
        if (p3 != null) {
            q qVar = ((k) p3).f12847o;
            Q q4 = qVar.f12915z;
            if (q4 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) q4;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((G0) actionBarOverlayLayout.f2525s).f13603a.f2624o;
                if (actionMenuView != null && (c1773j = actionMenuView.f2536H) != null) {
                    c1773j.e();
                    C1763e c1763e = c1773j.f13773I;
                    if (c1763e != null && c1763e.b()) {
                        c1763e.f13494i.dismiss();
                    }
                }
            }
            if (qVar.f12875E != null) {
                qVar.f12910t.getDecorView().removeCallbacks(qVar.f12876F);
                if (qVar.f12875E.isShowing()) {
                    try {
                        qVar.f12875E.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                qVar.f12875E = null;
            }
            F f4 = qVar.f12877G;
            if (f4 != null) {
                f4.b();
            }
            m mVar = qVar.t(0).f12859h;
            if (mVar != null) {
                mVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(P p3) {
        this.f2554v = p3;
    }
}
