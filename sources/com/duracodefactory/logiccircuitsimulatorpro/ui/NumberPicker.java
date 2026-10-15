package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;
import java.util.Objects;
import o1.ViewOnClickListenerC1828D;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class NumberPicker extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f3665o;

    /* renamed from: p, reason: collision with root package name */
    public int f3666p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f3667q;

    /* renamed from: r, reason: collision with root package name */
    public View f3668r;

    /* renamed from: s, reason: collision with root package name */
    public View f3669s;

    public NumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3665o = new ArrayList();
    }

    public final void a(String str, ArrayList arrayList) {
        this.f3665o = arrayList;
        this.f3666p = 0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (Objects.equals((String) obj, str)) {
                break;
            } else {
                this.f3666p++;
            }
        }
        if (this.f3666p == arrayList.size()) {
            this.f3666p = 0;
        }
        this.f3667q.setText((CharSequence) arrayList.get(this.f3666p));
        int i5 = this.f3666p;
        if (i5 == 0) {
            this.f3669s.setAlpha(0.5f);
        } else if (i5 == arrayList.size() - 1) {
            this.f3668r.setAlpha(0.5f);
        }
    }

    public int getSelection() {
        return this.f3666p;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3667q = (TextView) findViewById(R.id.num_picker_text_view);
        View findViewById = findViewById(R.id.num_picker_pos);
        this.f3668r = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC1828D(this, 0));
        View findViewById2 = findViewById(R.id.num_picker_neg);
        this.f3669s = findViewById2;
        findViewById2.setOnClickListener(new ViewOnClickListenerC1828D(this, 1));
        if (this.f3666p < this.f3665o.size()) {
            this.f3667q.setText((CharSequence) this.f3665o.get(this.f3666p));
        }
    }
}
