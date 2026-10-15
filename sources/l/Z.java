package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import e.AbstractC1657a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Z extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public float f13700a;

    /* renamed from: b, reason: collision with root package name */
    public int f13701b;

    public Z(int i4) {
        super(i4, -2);
        this.f13701b = -1;
        this.f13700a = 0.0f;
    }

    public Z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13701b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1657a.f12646n);
        this.f13700a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f13701b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public Z(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f13701b = -1;
    }
}
