package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.lang.reflect.Array;
import o1.InterfaceC1830F;
import o1.ViewOnClickListenerC1829E;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class PLADialog extends LinearLayout {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f3670C = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f3671A;

    /* renamed from: B, reason: collision with root package name */
    public View f3672B;

    /* renamed from: o, reason: collision with root package name */
    public View f3673o;

    /* renamed from: p, reason: collision with root package name */
    public View f3674p;

    /* renamed from: q, reason: collision with root package name */
    public View f3675q;

    /* renamed from: r, reason: collision with root package name */
    public View f3676r;

    /* renamed from: s, reason: collision with root package name */
    public View f3677s;

    /* renamed from: t, reason: collision with root package name */
    public ProgrammableArrayView f3678t;

    /* renamed from: u, reason: collision with root package name */
    public ProgrammableArrayView f3679u;

    /* renamed from: v, reason: collision with root package name */
    public boolean[][] f3680v;

    /* renamed from: w, reason: collision with root package name */
    public boolean[][] f3681w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1830F f3682x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3683z;

    public PLADialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Class cls = Boolean.TYPE;
        this.f3680v = (boolean[][]) Array.newInstance((Class<?>) cls, 1, 1);
        this.f3681w = (boolean[][]) Array.newInstance((Class<?>) cls, 1, 1);
    }

    public final void a(boolean[][] zArr, boolean[][] zArr2, boolean z4, boolean z5) {
        this.f3683z = z4;
        this.f3671A = z5;
        this.f3680v = AbstractC1895f.i(zArr);
        this.f3681w = AbstractC1895f.i(zArr2);
        ProgrammableArrayView programmableArrayView = this.f3678t;
        if (programmableArrayView != null) {
            programmableArrayView.a(this.f3680v, true);
            this.f3679u.a(this.f3681w, false);
            this.f3678t.f3690G = z4;
            this.f3679u.f3690G = z5;
        }
    }

    public final void b() {
        this.f3674p.setSelected(false);
        this.f3675q.setSelected(false);
        this.f3673o.setSelected(true);
        this.f3676r.setVisibility(0);
        this.f3677s.setVisibility(8);
        this.f3678t.setVisibility(0);
        this.f3679u.setVisibility(8);
        this.f3672B.setVisibility(this.f3683z ? 0 : 8);
    }

    public final void c() {
        this.f3674p.setSelected(true);
        this.f3675q.setSelected(false);
        this.f3673o.setSelected(false);
        this.f3676r.setVisibility(0);
        this.f3677s.setVisibility(8);
        this.f3679u.setVisibility(0);
        this.f3678t.setVisibility(8);
        this.f3672B.setVisibility(this.f3671A ? 0 : 8);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3673o = findViewById(R.id.and_array_button);
        this.f3674p = findViewById(R.id.or_array_button);
        this.f3675q = findViewById(R.id.info_array_button);
        this.f3676r = findViewById(R.id.pla_dots_container);
        this.f3677s = findViewById(R.id.pla_info_container);
        this.f3673o = findViewById(R.id.and_array_button);
        this.f3678t = (ProgrammableArrayView) findViewById(R.id.andDotsView);
        this.f3679u = (ProgrammableArrayView) findViewById(R.id.orDotsView);
        this.f3672B = findViewById(R.id.pla_setup_fixed_array);
        this.f3673o.setOnClickListener(new ViewOnClickListenerC1829E(this, 0));
        this.f3674p.setOnClickListener(new ViewOnClickListenerC1829E(this, 1));
        this.f3675q.setOnClickListener(new ViewOnClickListenerC1829E(this, 2));
        if (this.y) {
            findViewById(R.id.pla_interaction_container).setVisibility(0);
            if (this.f3683z) {
                c();
            } else {
                b();
            }
        }
        findViewById(R.id.pla_setup_submit).setOnClickListener(new ViewOnClickListenerC1829E(this, 3));
        this.f3678t.a(this.f3680v, true);
        this.f3679u.a(this.f3681w, false);
        this.f3678t.f3690G = this.f3683z;
        this.f3679u.f3690G = this.f3671A;
    }

    public void setInteractMode(boolean z4) {
        this.y = z4;
        if (findViewById(R.id.pla_interaction_container) != null) {
            findViewById(R.id.pla_interaction_container).setVisibility(z4 ? 0 : 8);
            if (this.f3683z) {
                c();
            } else {
                b();
            }
        }
    }

    public void setListener(InterfaceC1830F interfaceC1830F) {
        this.f3682x = interfaceC1830F;
    }
}
