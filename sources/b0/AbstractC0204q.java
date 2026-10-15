package b0;

import H.AbstractC0044t;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0204q {

    /* renamed from: b, reason: collision with root package name */
    public static final M.d f3380b = new M.d(1);
    public static final M.d c = new M.d(2);

    /* renamed from: a, reason: collision with root package name */
    public int f3381a;

    public static int a(int i4, int i5) {
        int i6;
        int i7 = i4 & 3158064;
        if (i7 == 0) {
            return i4;
        }
        int i8 = i4 & (~i7);
        if (i5 == 0) {
            i6 = i7 >> 2;
        } else {
            int i9 = i7 >> 1;
            i8 |= (-3158065) & i9;
            i6 = (i9 & 3158064) >> 2;
        }
        return i8 | i6;
    }

    public static int b(int i4, int i5) {
        int i6;
        int i7 = i4 & 789516;
        if (i7 == 0) {
            return i4;
        }
        int i8 = i4 & (~i7);
        if (i5 == 0) {
            i6 = i7 << 2;
        } else {
            int i9 = i7 << 1;
            i8 |= (-789517) & i9;
            i6 = (i9 & 789516) << 2;
        }
        return i8 | i6;
    }

    public static void d(RecyclerView recyclerView, c0 c0Var, float f4, float f5, boolean z4) {
        View view = c0Var.f3244a;
        if (z4 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = H.A.f779a;
            Float valueOf = Float.valueOf(AbstractC0044t.d(view));
            int childCount = recyclerView.getChildCount();
            float f6 = 0.0f;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = recyclerView.getChildAt(i4);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = H.A.f779a;
                    float d = AbstractC0044t.d(childAt);
                    if (d > f6) {
                        f6 = d;
                    }
                }
            }
            AbstractC0044t.j(view, f6 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f4);
        view.setTranslationY(f5);
    }

    public final int c(RecyclerView recyclerView, int i4, int i5, long j4) {
        if (this.f3381a == -1) {
            this.f3381a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (f3380b.getInterpolation(j4 <= 2000 ? ((float) j4) / 2000.0f : 1.0f) * ((int) (c.getInterpolation(Math.min(1.0f, (Math.abs(i5) * 1.0f) / i4)) * ((int) Math.signum(i5)) * this.f3381a)));
        return interpolation == 0 ? i5 > 0 ? 1 : -1 : interpolation;
    }
}
