package G2;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d3.AbstractC1654b;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends AbstractC1654b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f767h;

    public b(BottomSheetBehavior bottomSheetBehavior) {
        this.f767h = bottomSheetBehavior;
    }

    @Override // d3.AbstractC1654b
    public final int A() {
        BottomSheetBehavior bottomSheetBehavior = this.f767h;
        return bottomSheetBehavior.f12316u ? bottomSheetBehavior.f12288D : bottomSheetBehavior.f12314s;
    }

    @Override // d3.AbstractC1654b
    public final void K(int i4) {
        if (i4 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f767h;
            if (bottomSheetBehavior.f12318w) {
                bottomSheetBehavior.A(1);
            }
        }
    }

    @Override // d3.AbstractC1654b
    public final void L(View view, int i4, int i5) {
        this.f767h.u(i5);
    }

    @Override // d3.AbstractC1654b
    public final void M(View view, float f4, float f5) {
        int i4;
        int i5 = 6;
        BottomSheetBehavior bottomSheetBehavior = this.f767h;
        if (f5 < 0.0f) {
            if (bottomSheetBehavior.f12299b) {
                i4 = bottomSheetBehavior.f12311p;
            } else {
                int top = view.getTop();
                int i6 = bottomSheetBehavior.f12312q;
                if (top > i6) {
                    i4 = i6;
                } else {
                    i4 = bottomSheetBehavior.f12310o;
                }
            }
            i5 = 3;
        } else if (bottomSheetBehavior.f12316u && bottomSheetBehavior.C(view, f5)) {
            if (Math.abs(f4) >= Math.abs(f5) || f5 <= 500.0f) {
                if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f12288D) / 2) {
                    if (bottomSheetBehavior.f12299b) {
                        i4 = bottomSheetBehavior.f12311p;
                    } else if (Math.abs(view.getTop() - bottomSheetBehavior.f12310o) < Math.abs(view.getTop() - bottomSheetBehavior.f12312q)) {
                        i4 = bottomSheetBehavior.f12310o;
                    } else {
                        i4 = bottomSheetBehavior.f12312q;
                    }
                    i5 = 3;
                }
            }
            i4 = bottomSheetBehavior.f12288D;
            i5 = 5;
        } else if (f5 == 0.0f || Math.abs(f4) > Math.abs(f5)) {
            int top2 = view.getTop();
            if (!bottomSheetBehavior.f12299b) {
                int i7 = bottomSheetBehavior.f12312q;
                if (top2 < i7) {
                    if (top2 < Math.abs(top2 - bottomSheetBehavior.f12314s)) {
                        i4 = bottomSheetBehavior.f12310o;
                        i5 = 3;
                    } else {
                        i4 = bottomSheetBehavior.f12312q;
                    }
                } else if (Math.abs(top2 - i7) < Math.abs(top2 - bottomSheetBehavior.f12314s)) {
                    i4 = bottomSheetBehavior.f12312q;
                } else {
                    i4 = bottomSheetBehavior.f12314s;
                    i5 = 4;
                }
            } else if (Math.abs(top2 - bottomSheetBehavior.f12311p) < Math.abs(top2 - bottomSheetBehavior.f12314s)) {
                i4 = bottomSheetBehavior.f12311p;
                i5 = 3;
            } else {
                i4 = bottomSheetBehavior.f12314s;
                i5 = 4;
            }
        } else {
            if (bottomSheetBehavior.f12299b) {
                i4 = bottomSheetBehavior.f12314s;
            } else {
                int top3 = view.getTop();
                if (Math.abs(top3 - bottomSheetBehavior.f12312q) < Math.abs(top3 - bottomSheetBehavior.f12314s)) {
                    i4 = bottomSheetBehavior.f12312q;
                } else {
                    i4 = bottomSheetBehavior.f12314s;
                }
            }
            i5 = 4;
        }
        bottomSheetBehavior.D(view, i5, i4, true);
    }

    @Override // d3.AbstractC1654b
    public final boolean Q(View view, int i4) {
        BottomSheetBehavior bottomSheetBehavior = this.f767h;
        int i5 = bottomSheetBehavior.f12319x;
        if (i5 == 1 || bottomSheetBehavior.f12295K) {
            return false;
        }
        if (i5 == 3 && bottomSheetBehavior.f12293I == i4) {
            WeakReference weakReference = bottomSheetBehavior.f12290F;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference2 = bottomSheetBehavior.f12289E;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // d3.AbstractC1654b
    public final int f(View view, int i4) {
        return view.getLeft();
    }

    @Override // d3.AbstractC1654b
    public final int g(View view, int i4) {
        BottomSheetBehavior bottomSheetBehavior = this.f767h;
        int x4 = bottomSheetBehavior.x();
        int i5 = bottomSheetBehavior.f12316u ? bottomSheetBehavior.f12288D : bottomSheetBehavior.f12314s;
        return i4 < x4 ? x4 : i4 > i5 ? i5 : i4;
    }
}
