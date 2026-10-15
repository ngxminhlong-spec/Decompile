package androidx.fragment.app;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import f.AbstractActivityC1671f;
import java.util.HashMap;
import java.util.UUID;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0157f implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.i, androidx.lifecycle.w, f0.d {

    /* renamed from: f0, reason: collision with root package name */
    public static final Object f2818f0 = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f2819A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2820B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2821C;

    /* renamed from: D, reason: collision with root package name */
    public int f2822D;

    /* renamed from: E, reason: collision with root package name */
    public s f2823E;

    /* renamed from: F, reason: collision with root package name */
    public C0158g f2824F;

    /* renamed from: H, reason: collision with root package name */
    public AbstractComponentCallbacksC0157f f2826H;

    /* renamed from: I, reason: collision with root package name */
    public int f2827I;

    /* renamed from: J, reason: collision with root package name */
    public int f2828J;

    /* renamed from: K, reason: collision with root package name */
    public String f2829K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2830L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f2831M;
    public boolean N;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2833P;

    /* renamed from: Q, reason: collision with root package name */
    public ViewGroup f2834Q;

    /* renamed from: R, reason: collision with root package name */
    public View f2835R;

    /* renamed from: S, reason: collision with root package name */
    public View f2836S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f2837T;

    /* renamed from: V, reason: collision with root package name */
    public C0156e f2839V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2840W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f2841X;

    /* renamed from: Y, reason: collision with root package name */
    public float f2842Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2843Z;

    /* renamed from: c0, reason: collision with root package name */
    public J f2846c0;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f2850p;

    /* renamed from: q, reason: collision with root package name */
    public SparseArray f2851q;

    /* renamed from: s, reason: collision with root package name */
    public Bundle f2853s;

    /* renamed from: t, reason: collision with root package name */
    public AbstractComponentCallbacksC0157f f2854t;

    /* renamed from: v, reason: collision with root package name */
    public int f2856v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2858x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2859z;

    /* renamed from: o, reason: collision with root package name */
    public int f2849o = 0;

    /* renamed from: r, reason: collision with root package name */
    public String f2852r = UUID.randomUUID().toString();

    /* renamed from: u, reason: collision with root package name */
    public String f2855u = null;

    /* renamed from: w, reason: collision with root package name */
    public Boolean f2857w = null;

    /* renamed from: G, reason: collision with root package name */
    public s f2825G = new s();

    /* renamed from: O, reason: collision with root package name */
    public final boolean f2832O = true;

    /* renamed from: U, reason: collision with root package name */
    public boolean f2838U = true;

    /* renamed from: a0, reason: collision with root package name */
    public androidx.lifecycle.g f2844a0 = androidx.lifecycle.g.f2972s;

    /* renamed from: d0, reason: collision with root package name */
    public final androidx.lifecycle.o f2847d0 = new androidx.lifecycle.o();

    /* renamed from: b0, reason: collision with root package name */
    public androidx.lifecycle.k f2845b0 = new androidx.lifecycle.k(this);

    /* renamed from: e0, reason: collision with root package name */
    public A2.o f2848e0 = new A2.o(this);

    public AbstractComponentCallbacksC0157f() {
        this.f2845b0.a(new Fragment$2(this));
    }

    public void A() {
        this.f2833P = true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.fragment.app.J] */
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2825G.Z();
        this.f2821C = true;
        ?? obj = new Object();
        obj.f2767o = null;
        this.f2846c0 = obj;
        View r4 = r(layoutInflater, viewGroup, bundle);
        this.f2835R = r4;
        if (r4 == null) {
            if (this.f2846c0.f2767o != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f2846c0 = null;
        } else {
            J j4 = this.f2846c0;
            if (j4.f2767o == null) {
                j4.f2767o = new androidx.lifecycle.k(j4);
            }
            this.f2847d0.a(this.f2846c0);
        }
    }

    public final void C(String[] strArr) {
        C0158g c0158g = this.f2824F;
        if (c0158g == null) {
            throw new IllegalStateException(U.a.j("Fragment ", this, " not attached to Activity"));
        }
        AbstractActivityC1671f abstractActivityC1671f = c0158g.f2864t;
        AbstractActivityC1671f.m(0);
        try {
            abstractActivityC1671f.f12833B = true;
            AbstractC1895f.v(abstractActivityC1671f, strArr, (abstractActivityC1671f.l(this) + 1) << 16);
        } finally {
            abstractActivityC1671f.f12833B = false;
        }
    }

    public final Context D() {
        Context l4 = l();
        if (l4 != null) {
            return l4;
        }
        throw new IllegalStateException(U.a.j("Fragment ", this, " not attached to a context."));
    }

    public final View E() {
        View view = this.f2835R;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(U.a.j("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void F(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f2825G.e0(parcelable);
        s sVar = this.f2825G;
        sVar.f2893I = false;
        sVar.f2894J = false;
        sVar.F(1);
    }

    public final void G(Bundle bundle) {
        s sVar = this.f2823E;
        if (sVar != null) {
            if (sVar == null ? false : sVar.S()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f2853s = bundle;
    }

    public final void H(int i4) {
        if (this.f2839V == null && i4 == 0) {
            return;
        }
        b().d = i4;
    }

    public final void I(Intent intent) {
        C0158g c0158g = this.f2824F;
        if (c0158g == null) {
            throw new IllegalStateException(U.a.j("Fragment ", this, " not attached to Activity"));
        }
        c0158g.d(this, intent, -1);
    }

    public final void J(Intent intent, int i4) {
        C0158g c0158g = this.f2824F;
        if (c0158g == null) {
            throw new IllegalStateException(U.a.j("Fragment ", this, " not attached to Activity"));
        }
        c0158g.d(this, intent, i4);
    }

    @Override // f0.d
    public final Q1.H a() {
        return (Q1.H) this.f2848e0.f37r;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.e, java.lang.Object] */
    public final C0156e b() {
        if (this.f2839V == null) {
            ?? obj = new Object();
            Object obj2 = f2818f0;
            obj.f2814g = obj2;
            obj.f2815h = obj2;
            obj.f2816i = obj2;
            this.f2839V = obj;
        }
        return this.f2839V;
    }

    @Override // androidx.lifecycle.w
    public final androidx.lifecycle.v e() {
        s sVar = this.f2823E;
        if (sVar == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        HashMap hashMap = sVar.f2901R.f2918e;
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) hashMap.get(this.f2852r);
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v();
        hashMap.put(this.f2852r, vVar2);
        return vVar2;
    }

    @Override // androidx.lifecycle.i
    public final androidx.lifecycle.k f() {
        return this.f2845b0;
    }

    public final AbstractActivityC1671f h() {
        C0158g c0158g = this.f2824F;
        if (c0158g == null) {
            return null;
        }
        return c0158g.f2860p;
    }

    public final View i() {
        C0156e c0156e = this.f2839V;
        if (c0156e == null) {
            return null;
        }
        return c0156e.f2810a;
    }

    public final Animator j() {
        C0156e c0156e = this.f2839V;
        if (c0156e == null) {
            return null;
        }
        return c0156e.f2811b;
    }

    public final s k() {
        if (this.f2824F != null) {
            return this.f2825G;
        }
        throw new IllegalStateException(U.a.j("Fragment ", this, " has not been attached yet."));
    }

    public final Context l() {
        C0158g c0158g = this.f2824F;
        if (c0158g == null) {
            return null;
        }
        return c0158g.f2861q;
    }

    public final Resources m() {
        return D().getResources();
    }

    public void n(Bundle bundle) {
        this.f2833P = true;
    }

    public void o(int i4, int i5, Intent intent) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f2833P = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AbstractActivityC1671f h4 = h();
        if (h4 == null) {
            throw new IllegalStateException(U.a.j("Fragment ", this, " not attached to an activity."));
        }
        h4.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f2833P = true;
    }

    public void p(Context context) {
        this.f2833P = true;
        C0158g c0158g = this.f2824F;
        if ((c0158g == null ? null : c0158g.f2860p) != null) {
            this.f2833P = true;
        }
    }

    public void q(Bundle bundle) {
        this.f2833P = true;
        F(bundle);
        s sVar = this.f2825G;
        if (sVar.f2887C >= 1) {
            return;
        }
        sVar.f2893I = false;
        sVar.f2894J = false;
        sVar.F(1);
    }

    public View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void s() {
        this.f2833P = true;
    }

    public void t() {
        this.f2833P = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        android.support.v4.media.session.a.a(this, sb);
        sb.append(" (");
        sb.append(this.f2852r);
        sb.append(")");
        if (this.f2827I != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2827I));
        }
        if (this.f2829K != null) {
            sb.append(" ");
            sb.append(this.f2829K);
        }
        sb.append('}');
        return sb.toString();
    }

    public LayoutInflater u(Bundle bundle) {
        C0158g c0158g = this.f2824F;
        if (c0158g == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC1671f abstractActivityC1671f = c0158g.f2864t;
        LayoutInflater cloneInContext = abstractActivityC1671f.getLayoutInflater().cloneInContext(abstractActivityC1671f);
        s sVar = this.f2825G;
        sVar.getClass();
        cloneInContext.setFactory2(sVar);
        return cloneInContext;
    }

    public void v() {
        this.f2833P = true;
    }

    public void w(int i4, String[] strArr, int[] iArr) {
    }

    public void x() {
        this.f2833P = true;
    }

    public void y(Bundle bundle) {
    }

    public void z() {
        this.f2833P = true;
    }
}
