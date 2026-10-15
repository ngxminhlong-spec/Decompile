package b0;

import H.C0027b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d0 extends C0027b {
    public final e0 d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f3264e = new WeakHashMap();

    public d0(e0 e0Var) {
        this.d = e0Var;
    }

    @Override // H.C0027b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0027b c0027b = (C0027b) this.f3264e.get(view);
        return c0027b != null ? c0027b.a(view, accessibilityEvent) : this.f812a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // H.C0027b
    public final x0.f b(View view) {
        C0027b c0027b = (C0027b) this.f3264e.get(view);
        return c0027b != null ? c0027b.b(view) : super.b(view);
    }

    @Override // H.C0027b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0027b c0027b = (C0027b) this.f3264e.get(view);
        if (c0027b != null) {
            c0027b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // H.C0027b
    public final void d(View view, I.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f918a;
        e0 e0Var = this.d;
        RecyclerView recyclerView = e0Var.d;
        RecyclerView recyclerView2 = e0Var.d;
        boolean L4 = recyclerView.L();
        View.AccessibilityDelegate accessibilityDelegate = this.f812a;
        if (L4 || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().T(view, gVar);
        C0027b c0027b = (C0027b) this.f3264e.get(view);
        if (c0027b != null) {
            c0027b.d(view, gVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // H.C0027b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0027b c0027b = (C0027b) this.f3264e.get(view);
        if (c0027b != null) {
            c0027b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // H.C0027b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0027b c0027b = (C0027b) this.f3264e.get(viewGroup);
        return c0027b != null ? c0027b.f(viewGroup, view, accessibilityEvent) : this.f812a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // H.C0027b
    public final boolean g(View view, int i4, Bundle bundle) {
        e0 e0Var = this.d;
        RecyclerView recyclerView = e0Var.d;
        RecyclerView recyclerView2 = e0Var.d;
        if (recyclerView.L() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i4, bundle);
        }
        C0027b c0027b = (C0027b) this.f3264e.get(view);
        if (c0027b != null) {
            if (c0027b.g(view, i4, bundle)) {
                return true;
            }
        } else if (super.g(view, i4, bundle)) {
            return true;
        }
        C0185T c0185t = recyclerView2.getLayoutManager().f3185b.f3072p;
        return false;
    }

    @Override // H.C0027b
    public final void h(View view, int i4) {
        C0027b c0027b = (C0027b) this.f3264e.get(view);
        if (c0027b != null) {
            c0027b.h(view, i4);
        } else {
            super.h(view, i4);
        }
    }

    @Override // H.C0027b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0027b c0027b = (C0027b) this.f3264e.get(view);
        if (c0027b != null) {
            c0027b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
