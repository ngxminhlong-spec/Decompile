package C0;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.I3;
import h1.AbstractC1698a;
import l.C1764e0;
import l.C1788v;
import l.RunnableC1760c0;
import p1.C1921g;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0007g implements View.OnTouchListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f316o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f317p;

    public /* synthetic */ ViewOnTouchListenerC0007g(int i4, Object obj) {
        this.f316o = i4;
        this.f317p = obj;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [t2.b, java.lang.Object] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f316o) {
            case 0:
                D d = (D) this.f317p;
                AbstractC1698a selectedElement = d.f202i0.getSelectedElement();
                if (!(selectedElement instanceof C1921g) && !(selectedElement instanceof p1.b0)) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    selectedElement.v();
                } else if (motionEvent.getActionMasked() == 1) {
                    selectedElement.w();
                }
                Context l4 = d.l();
                if (l4 == null) {
                    return false;
                }
                if (d.f183R0 == null) {
                    d.f183R0 = new Object();
                }
                d.f183R0.k(l4, selectedElement);
                return false;
            case 1:
                I3 i32 = ((N1.m) this.f317p).f1202v;
                if (i32 == null) {
                    return false;
                }
                i32.f5531b.a(motionEvent);
                return false;
            default:
                C1764e0 c1764e0 = (C1764e0) this.f317p;
                RunnableC1760c0 runnableC1760c0 = c1764e0.f13732E;
                Handler handler = c1764e0.f13736I;
                C1788v c1788v = c1764e0.f13740M;
                int action = motionEvent.getAction();
                int x4 = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && c1788v != null && c1788v.isShowing() && x4 >= 0 && x4 < c1788v.getWidth() && y >= 0 && y < c1788v.getHeight()) {
                    handler.postDelayed(runnableC1760c0, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                handler.removeCallbacks(runnableC1760c0);
                return false;
        }
    }
}
