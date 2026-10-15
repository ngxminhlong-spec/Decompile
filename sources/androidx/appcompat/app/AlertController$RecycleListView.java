package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import e.AbstractC1657a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: o, reason: collision with root package name */
    public final int f2446o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2447p;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1657a.f12652t);
        this.f2447p = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f2446o = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
