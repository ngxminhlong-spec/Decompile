package b0;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3421a;

    /* renamed from: b, reason: collision with root package name */
    public int f3422b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3423e;

    /* renamed from: f, reason: collision with root package name */
    public int f3424f;

    /* renamed from: g, reason: collision with root package name */
    public int f3425g;

    /* renamed from: h, reason: collision with root package name */
    public int f3426h;

    /* renamed from: i, reason: collision with root package name */
    public int f3427i;

    /* renamed from: j, reason: collision with root package name */
    public int f3428j;

    /* renamed from: k, reason: collision with root package name */
    public List f3429k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3430l;

    public final void a(View view) {
        int c;
        int size = this.f3429k.size();
        View view2 = null;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < size; i5++) {
            View view3 = ((c0) this.f3429k.get(i5)).f3244a;
            C0179M c0179m = (C0179M) view3.getLayoutParams();
            if (view3 != view && !c0179m.f3197a.i() && (c = (c0179m.f3197a.c() - this.d) * this.f3423e) >= 0 && c < i4) {
                view2 = view3;
                if (c == 0) {
                    break;
                } else {
                    i4 = c;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((C0179M) view2.getLayoutParams()).f3197a.c();
        }
    }

    public final View b(C0185T c0185t) {
        List list = this.f3429k;
        if (list == null) {
            View view = c0185t.i(this.d, Long.MAX_VALUE).f3244a;
            this.d += this.f3423e;
            return view;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = ((c0) this.f3429k.get(i4)).f3244a;
            C0179M c0179m = (C0179M) view2.getLayoutParams();
            if (!c0179m.f3197a.i() && this.d == c0179m.f3197a.c()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
