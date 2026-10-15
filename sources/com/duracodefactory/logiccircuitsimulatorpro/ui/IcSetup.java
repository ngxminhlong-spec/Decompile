package com.duracodefactory.logiccircuitsimulatorpro.ui;

import C0.DialogInterfaceOnClickListenerC0025z;
import C0.h0;
import C0.i0;
import D3.d;
import L2.b;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0201n;
import b0.C0202o;
import b0.C0205r;
import b0.C0206s;
import c1.C0234c;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.textfield.TextInputLayout;
import f.C1667b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import o1.C1881r;
import o1.C1884u;
import o1.InterfaceC1883t;
import o1.ViewOnClickListenerC1879p;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class IcSetup extends LinearLayout {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f3618E = 0;

    /* renamed from: A, reason: collision with root package name */
    public C1881r f3619A;

    /* renamed from: B, reason: collision with root package name */
    public ArrayList f3620B;

    /* renamed from: C, reason: collision with root package name */
    public HashMap f3621C;

    /* renamed from: D, reason: collision with root package name */
    public String f3622D;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f3623o;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f3624p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f3625q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayout f3626r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f3627s;

    /* renamed from: t, reason: collision with root package name */
    public LinearLayout f3628t;

    /* renamed from: u, reason: collision with root package name */
    public LinearLayout f3629u;

    /* renamed from: v, reason: collision with root package name */
    public LinearLayout f3630v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f3631w;

    /* renamed from: x, reason: collision with root package name */
    public View f3632x;
    public InterfaceC1883t y;

    /* renamed from: z, reason: collision with root package name */
    public RecyclerView f3633z;

    public IcSetup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3620B = new ArrayList();
        this.f3621C = new HashMap();
    }

    public static void a(IcSetup icSetup, int i4) {
        b bVar = new b(icSetup.getContext());
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(icSetup.getContext()).inflate(R.layout.node_rename_dialog, (ViewGroup) null);
        EditText editText = (EditText) viewGroup.findViewById(R.id.edit_text);
        C0234c c0234c = (C0234c) icSetup.f3620B.get(i4);
        editText.setText(c0234c.f3546o);
        bVar.s(R.string.node_name_title);
        ((C1667b) bVar.f113p).f12797n = viewGroup;
        ((TextInputLayout) viewGroup.findViewById(R.id.hint_layout)).setHint(icSetup.getContext().getString(R.string.label));
        bVar.q(R.string.save, new h0(icSetup, editText, c0234c, i4, 2));
        bVar.p(R.string.cancel, new DialogInterfaceOnClickListenerC0025z(4));
        bVar.k();
    }

    public final void b() {
        if (this.f3619A == null) {
            C1881r c1881r = new C1881r(this);
            this.f3619A = c1881r;
            this.f3633z.setAdapter(c1881r);
            RecyclerView recyclerView = this.f3633z;
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            C0206s c0206s = new C0206s(new C1884u(this, this.f3619A));
            RecyclerView recyclerView2 = this.f3633z;
            RecyclerView recyclerView3 = c0206s.f3399q;
            if (recyclerView3 != recyclerView2) {
                C0201n c0201n = c0206s.y;
                if (recyclerView3 != null) {
                    recyclerView3.X(c0206s);
                    RecyclerView recyclerView4 = c0206s.f3399q;
                    recyclerView4.f3029C.remove(c0201n);
                    if (recyclerView4.f3031D == c0201n) {
                        recyclerView4.f3031D = null;
                    }
                    ArrayList arrayList = c0206s.f3399q.f3047O;
                    if (arrayList != null) {
                        arrayList.remove(c0206s);
                    }
                    ArrayList arrayList2 = c0206s.f3398p;
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        c0206s.f3395m.e(((C0202o) arrayList2.get(0)).f3363e);
                    }
                    arrayList2.clear();
                    c0206s.f3404v = null;
                    VelocityTracker velocityTracker = c0206s.f3401s;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        c0206s.f3401s = null;
                    }
                    C0205r c0205r = c0206s.f3406x;
                    if (c0205r != null) {
                        c0205r.f3382a = false;
                        c0206s.f3406x = null;
                    }
                    if (c0206s.f3405w != null) {
                        c0206s.f3405w = null;
                    }
                }
                c0206s.f3399q = recyclerView2;
                if (recyclerView2 != null) {
                    Resources resources = recyclerView2.getResources();
                    c0206s.f3388f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                    c0206s.f3389g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                    ViewConfiguration.get(c0206s.f3399q.getContext()).getScaledTouchSlop();
                    c0206s.f3399q.g(c0206s);
                    c0206s.f3399q.f3029C.add(c0201n);
                    RecyclerView recyclerView5 = c0206s.f3399q;
                    if (recyclerView5.f3047O == null) {
                        recyclerView5.f3047O = new ArrayList();
                    }
                    recyclerView5.f3047O.add(c0206s);
                    c0206s.f3406x = new C0205r(c0206s);
                    c0206s.f3405w = new d(c0206s.f3399q.getContext(), c0206s.f3406x);
                }
            }
        }
        this.f3631w.setText(this.f3622D);
        ArrayList arrayList3 = this.f3620B;
        int size2 = arrayList3.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i8 < size2) {
            Object obj = arrayList3.get(i8);
            i8++;
            int i9 = ((C0234c) obj).f3547p;
            if (i9 == 1) {
                i4++;
            } else if (i9 == 2) {
                i5++;
            } else if (i9 == 3) {
                i7++;
            } else {
                i6++;
            }
        }
        this.f3627s.removeAllViews();
        this.f3630v.removeAllViews();
        this.f3628t.removeAllViews();
        this.f3629u.removeAllViews();
        for (int i10 = 0; i10 < i4; i10++) {
            this.f3627s.addView(LayoutInflater.from(getContext()).inflate(R.layout.ic_setup_node_vertical_layout, (ViewGroup) this.f3627s, false));
        }
        for (int i11 = 0; i11 < i5; i11++) {
            this.f3628t.addView(LayoutInflater.from(getContext()).inflate(R.layout.ic_setup_node_horizontal_layout, (ViewGroup) this.f3628t, false));
        }
        for (int i12 = 0; i12 < i7; i12++) {
            this.f3629u.addView(LayoutInflater.from(getContext()).inflate(R.layout.ic_setup_node_horizontal_layout, (ViewGroup) this.f3629u, false));
        }
        for (int i13 = 0; i13 < i6; i13++) {
            this.f3630v.addView(LayoutInflater.from(getContext()).inflate(R.layout.ic_setup_node_vertical_layout, (ViewGroup) this.f3630v, false));
        }
        this.f3623o.removeAllViews();
        this.f3624p.removeAllViews();
        this.f3625q.removeAllViews();
        this.f3626r.removeAllViews();
        ArrayList arrayList4 = this.f3620B;
        int size3 = arrayList4.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj2 = arrayList4.get(i14);
            i14++;
            C0234c c0234c = (C0234c) obj2;
            int i15 = c0234c.f3547p;
            if (i15 == 1) {
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.ic_setup_node_text_layout, (ViewGroup) this.f3623o, false);
                textView.setText(c0234c.f3546o);
                this.f3623o.addView(textView);
            } else if (i15 == 2) {
                TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.ic_setup_node_text_layout, (ViewGroup) this.f3624p, false);
                textView2.setText(c0234c.f3546o);
                this.f3624p.addView(textView2);
            } else if (i15 == 3) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.ic_setup_node_text_layout, (ViewGroup) this.f3625q, false);
                textView3.setText(c0234c.f3546o);
                this.f3625q.addView(textView3);
            } else {
                TextView textView4 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.ic_setup_node_text_layout, (ViewGroup) this.f3626r, false);
                textView4.setText(c0234c.f3546o);
                this.f3626r.addView(textView4);
            }
        }
    }

    public final void c(ArrayList arrayList, HashMap hashMap, String str) {
        this.f3620B = arrayList;
        this.f3621C = hashMap;
        Collections.sort(arrayList, new i0(4));
        C1881r c1881r = this.f3619A;
        c1881r.d = this.f3620B;
        c1881r.d();
        this.f3622D = str;
        b();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3623o = (LinearLayout) findViewById(R.id.top_labels);
        this.f3624p = (LinearLayout) findViewById(R.id.left_labels);
        this.f3625q = (LinearLayout) findViewById(R.id.right_labels);
        this.f3626r = (LinearLayout) findViewById(R.id.bottom_labels);
        this.f3627s = (LinearLayout) findViewById(R.id.top_nodes);
        this.f3628t = (LinearLayout) findViewById(R.id.left_nodes);
        this.f3629u = (LinearLayout) findViewById(R.id.right_nodes);
        this.f3630v = (LinearLayout) findViewById(R.id.bottom_nodes);
        this.f3633z = (RecyclerView) findViewById(R.id.inputs_recycler);
        this.f3631w = (TextView) findViewById(R.id.ic_setup_name);
        View findViewById = findViewById(R.id.add);
        this.f3632x = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC1879p(this, 0));
        findViewById(R.id.io_setup_help_button).setOnClickListener(new ViewOnClickListenerC1879p(this, 1));
        b();
    }

    public void setListener(InterfaceC1883t interfaceC1883t) {
        this.y = interfaceC1883t;
    }
}
