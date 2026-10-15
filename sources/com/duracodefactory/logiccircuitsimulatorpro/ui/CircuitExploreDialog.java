package com.duracodefactory.logiccircuitsimulatorpro.ui;

import P0.a;
import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import com.google.android.gms.internal.ads.C0831kn;
import e1.d;
import e1.f;
import f1.b;
import java.util.ArrayList;
import o1.InterfaceC1854c;
import o1.ViewOnClickListenerC1850a;
import o1.ViewOnLayoutChangeListenerC1852b;
import s1.C1971a;
import s1.C1972b;
import s1.C1975e;
import s1.C1976f;
import s1.C1977g;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class CircuitExploreDialog extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1854c f3585o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f3586p;

    /* renamed from: q, reason: collision with root package name */
    public View f3587q;

    /* renamed from: r, reason: collision with root package name */
    public View f3588r;

    /* renamed from: s, reason: collision with root package name */
    public C1977g f3589s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3590t;

    /* renamed from: u, reason: collision with root package name */
    public View f3591u;

    /* renamed from: v, reason: collision with root package name */
    public C1995b f3592v;

    /* renamed from: w, reason: collision with root package name */
    public ViewGroup f3593w;

    public CircuitExploreDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.view.View, com.duracodefactory.logiccircuitsimulatorpro.view.BoardView, java.lang.Object] */
    public final void a(a aVar, C1977g c1977g) {
        this.f3589s = c1977g;
        this.f3586p.setText(aVar.f1479x);
        this.f3588r.setVisibility(4);
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt instanceof BoardView) {
                childAt.setVisibility(8);
                i4++;
            }
        }
        Context context = getContext();
        ?? view = new View(context);
        view.f3825s = 1.0f;
        view.f3828v = new C1975e(view);
        view.f3829w = new C1976f(view);
        view.f3830x = 0.1f;
        view.f3796B = 0.3f;
        view.f3797C = 4.5f;
        view.f3802H = new RectF();
        view.f3806L = new f(new Handler());
        view.f3807M = new b(new C1971a(view));
        view.N = new RectF();
        view.f3818b0 = new C1972b(view, 0);
        view.f3819c0 = new C1972b(view, 1);
        view.f3820d0 = new C1972b(view, 2);
        view.f(context);
        addView((View) view, i4, new FrameLayout.LayoutParams(-1, -1));
        view.g(aVar);
        view.f3803I = true;
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1852b(this, view.getCircuit().O(), view));
        if (this.f3589s != null) {
            view.setGridVisibility(true);
            view.setGridProperties(this.f3589s);
        }
        view.setListener(new C0831kn(this, view, 15, false));
        view.n();
        c();
    }

    public final boolean b() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof BoardView) {
                arrayList.add(childAt);
            }
        }
        if (arrayList.size() < 2) {
            if (getVisibility() == 0) {
                return this.f3585o.d();
            }
            return false;
        }
        View view = (View) arrayList.get(arrayList.size() - 2);
        view.setVisibility(0);
        TextView textView = this.f3586p;
        d circuit = ((BoardView) view).getCircuit();
        String str = circuit.f12696e0;
        String str2 = circuit.f13132z;
        if (str2 != null) {
            str = str2;
        } else if (TextUtils.isEmpty(str)) {
            str = circuit.y;
        }
        textView.setText(str);
        View view2 = (View) arrayList.get(arrayList.size() - 1);
        removeView(view2);
        ((BoardView) view2).p();
        this.f3588r.setVisibility(4);
        if (this.f3593w.getChildCount() > 0) {
            this.f3593w.removeAllViews();
        }
        c();
        return true;
    }

    public final void c() {
        if (this.f3590t) {
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                if (getChildAt(i5) instanceof BoardView) {
                    i4++;
                }
            }
            this.f3587q.setVisibility(i4 == 1 ? 8 : 0);
        }
    }

    public final void d() {
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof BoardView) {
                ((BoardView) childAt).p();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [t2.b, java.lang.Object] */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3586p = (TextView) findViewById(R.id.explore_circuit_name);
        this.f3587q = findViewById(R.id.explore_circuit_back);
        this.f3588r = findViewById(R.id.explore_circuit_bino);
        this.f3591u = findViewById(R.id.header_container);
        this.f3593w = (ViewGroup) findViewById(R.id.balloon_cont);
        this.f3587q.setOnClickListener(new ViewOnClickListenerC1850a(this, 0));
        this.f3588r.setOnClickListener(new ViewOnClickListenerC1850a(this, 1));
        this.f3592v = new Object();
    }

    public void setListener(InterfaceC1854c interfaceC1854c) {
        this.f3585o = interfaceC1854c;
    }
}
