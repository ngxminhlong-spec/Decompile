package com.duracodefactory.logiccircuitsimulatorpro.ui;

import C0.C0012l;
import C0.ViewOnClickListenerC0022w;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o1.InterfaceC1837M;
import o1.InterfaceC1855c0;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class TimerSetup extends LinearLayout implements InterfaceC1837M {

    /* renamed from: o, reason: collision with root package name */
    public Slider f3762o;

    /* renamed from: p, reason: collision with root package name */
    public int f3763p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1855c0 f3764q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f3765r;

    /* renamed from: s, reason: collision with root package name */
    public final C0012l f3766s;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.AbstractMap, C0.l, java.util.HashMap] */
    public TimerSetup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ?? hashMap = new HashMap();
        hashMap.put(0, 100);
        hashMap.put(1, 200);
        hashMap.put(2, 300);
        hashMap.put(3, 400);
        hashMap.put(4, 500);
        hashMap.put(5, 1000);
        hashMap.put(6, 2000);
        hashMap.put(7, 3000);
        hashMap.put(8, 4000);
        hashMap.put(9, 5000);
        hashMap.put(10, 6000);
        hashMap.put(11, 7000);
        hashMap.put(12, 8000);
        hashMap.put(13, 9000);
        hashMap.put(14, 10000);
        hashMap.put(15, 20000);
        hashMap.put(16, 30000);
        hashMap.put(17, 60000);
        hashMap.put(18, 90000);
        hashMap.put(19, 120000);
        this.f3766s = hashMap;
    }

    public static void b(TimerSetup timerSetup) {
        timerSetup.f3764q.e(timerSetup.getSelectedDelay());
    }

    private int getSelectedDelay() {
        Integer num = (Integer) this.f3766s.get(Integer.valueOf(this.f3762o.getSelectedPos()));
        if (num == null) {
            return 1000;
        }
        return num.intValue();
    }

    @Override // o1.InterfaceC1837M
    public final void a() {
        this.f3765r.setText(AbstractC1895f.q(getSelectedDelay() * 1000));
    }

    public final void c() {
        Iterator it = this.f3766s.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Integer) entry.getValue()).intValue() == this.f3763p) {
                this.f3762o.setSelectedPos(((Integer) entry.getKey()).intValue());
                break;
            }
        }
        this.f3765r.setText(AbstractC1895f.q(getSelectedDelay() * 1000));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Slider slider = (Slider) findViewById(R.id.timer_delay_slider);
        this.f3762o = slider;
        slider.setOnChangedListener(this);
        findViewById(R.id.timer_setup_submit).setOnClickListener(new ViewOnClickListenerC0022w(18, this));
        this.f3765r = (TextView) findViewById(R.id.setup_timer_delay_ms);
        c();
    }

    public void setData(int i4) {
        this.f3763p = i4;
        if (this.f3762o == null) {
            return;
        }
        c();
    }

    public void setListener(InterfaceC1855c0 interfaceC1855c0) {
        this.f3764q = interfaceC1855c0;
    }
}
