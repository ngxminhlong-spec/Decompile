package b0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0179M extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public c0 f3197a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3198b;
    public boolean c;
    public boolean d;

    public C0179M(int i4, int i5) {
        super(i4, i5);
        this.f3198b = new Rect();
        this.c = true;
        this.d = false;
    }

    public C0179M(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3198b = new Rect();
        this.c = true;
        this.d = false;
    }

    public C0179M(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3198b = new Rect();
        this.c = true;
        this.d = false;
    }

    public C0179M(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3198b = new Rect();
        this.c = true;
        this.d = false;
    }

    public C0179M(C0179M c0179m) {
        super((ViewGroup.LayoutParams) c0179m);
        this.f3198b = new Rect();
        this.c = true;
        this.d = false;
    }
}
