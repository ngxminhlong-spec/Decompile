package com.duracodefactory.logiccircuitsimulatorpro.ui;

import C0.C0012l;
import J2.f;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o1.InterfaceC1837M;
import o1.InterfaceC1843T;
import o1.ViewOnClickListenerC1842S;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class TextSetup extends LinearLayout implements InterfaceC1837M {
    public static final /* synthetic */ int y = 0;

    /* renamed from: o, reason: collision with root package name */
    public Slider f3714o;

    /* renamed from: p, reason: collision with root package name */
    public Switch f3715p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f3716q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f3717r;

    /* renamed from: s, reason: collision with root package name */
    public String f3718s;

    /* renamed from: t, reason: collision with root package name */
    public int f3719t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3720u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC1843T f3721v;

    /* renamed from: w, reason: collision with root package name */
    public final C0012l f3722w;

    /* renamed from: x, reason: collision with root package name */
    public final C0012l f3723x;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.AbstractMap, C0.l, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.AbstractMap, C0.l, java.util.HashMap] */
    public TextSetup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ?? hashMap = new HashMap();
        hashMap.put(0, 10);
        hashMap.put(1, 50);
        hashMap.put(2, 100);
        hashMap.put(3, 200);
        hashMap.put(4, 300);
        this.f3722w = hashMap;
        ?? hashMap2 = new HashMap();
        hashMap2.put(0, 10);
        hashMap2.put(1, 20);
        hashMap2.put(2, 30);
        hashMap2.put(3, 35);
        hashMap2.put(4, 40);
        this.f3723x = hashMap2;
    }

    @Override // o1.InterfaceC1837M
    public final void a() {
        TextView textView = this.f3716q;
        Integer valueOf = Integer.valueOf(this.f3714o.getSelectedPos());
        C0012l c0012l = this.f3723x;
        textView.setTextSize(1, ((Integer) c0012l.get(valueOf)).intValue());
        this.f3717r.setTextSize(1, ((Integer) c0012l.get(Integer.valueOf(this.f3714o.getSelectedPos()))).intValue());
    }

    public final void b() {
        Iterator it = this.f3722w.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Integer) entry.getValue()).intValue() == this.f3719t) {
                this.f3714o.setSelectedPos(((Integer) entry.getKey()).intValue());
                break;
            }
        }
        this.f3716q.setText(this.f3718s);
        TextView textView = this.f3716q;
        Integer valueOf = Integer.valueOf(this.f3714o.getSelectedPos());
        C0012l c0012l = this.f3723x;
        textView.setTextSize(1, ((Integer) c0012l.get(valueOf)).intValue());
        this.f3717r.setText(this.f3718s);
        this.f3717r.setTextSize(1, ((Integer) c0012l.get(Integer.valueOf(this.f3714o.getSelectedPos()))).intValue());
        if (this.f3720u) {
            this.f3716q.setVisibility(4);
            this.f3717r.setVisibility(0);
        } else {
            this.f3716q.setVisibility(0);
            this.f3717r.setVisibility(4);
        }
        this.f3715p.setChecked(this.f3720u);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Slider slider = (Slider) findViewById(R.id.text_size_slider);
        this.f3714o = slider;
        slider.setOnChangedListener(this);
        this.f3715p = (Switch) findViewById(R.id.text_size_outline_switch);
        this.f3716q = (TextView) findViewById(R.id.text_size_preview_text);
        this.f3717r = (TextView) findViewById(R.id.text_size_preview_text_outline);
        findViewById(R.id.text_size_submit).setOnClickListener(new ViewOnClickListenerC1842S(this, 0));
        this.f3715p.setOnCheckedChangeListener(new f(2, this));
        ViewOnClickListenerC1842S viewOnClickListenerC1842S = new ViewOnClickListenerC1842S(this, 1);
        findViewById(R.id.text_size_hint).setOnClickListener(viewOnClickListenerC1842S);
        this.f3716q.setOnClickListener(viewOnClickListenerC1842S);
        this.f3717r.setOnClickListener(viewOnClickListenerC1842S);
        b();
    }

    public void setListener(InterfaceC1843T interfaceC1843T) {
        this.f3721v = interfaceC1843T;
    }
}
