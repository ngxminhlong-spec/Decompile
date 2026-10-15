package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13488a;

    /* renamed from: b, reason: collision with root package name */
    public final m f13489b;
    public final boolean c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f13490e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13492g;

    /* renamed from: h, reason: collision with root package name */
    public y f13493h;

    /* renamed from: i, reason: collision with root package name */
    public v f13494i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f13495j;

    /* renamed from: f, reason: collision with root package name */
    public int f13491f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final w f13496k = new w(this);

    public x(Context context, m mVar, View view, boolean z4, int i4, int i5) {
        this.f13488a = context;
        this.f13489b = mVar;
        this.f13490e = view;
        this.c = z4;
        this.d = i4;
    }

    public final v a() {
        v e4;
        if (this.f13494i == null) {
            Context context = this.f13488a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                e4 = new g(context, this.f13490e, this.d, this.c);
            } else {
                e4 = new E(this.f13488a, this.f13489b, this.f13490e, this.d, this.c);
            }
            e4.n(this.f13489b);
            e4.t(this.f13496k);
            e4.p(this.f13490e);
            e4.j(this.f13493h);
            e4.q(this.f13492g);
            e4.r(this.f13491f);
            this.f13494i = e4;
        }
        return this.f13494i;
    }

    public final boolean b() {
        v vVar = this.f13494i;
        return vVar != null && vVar.b();
    }

    public void c() {
        this.f13494i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f13495j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i4, int i5, boolean z4, boolean z5) {
        v a4 = a();
        a4.u(z5);
        if (z4) {
            int i6 = this.f13491f;
            View view = this.f13490e;
            WeakHashMap weakHashMap = H.A.f779a;
            if ((Gravity.getAbsoluteGravity(i6, view.getLayoutDirection()) & 7) == 5) {
                i4 -= this.f13490e.getWidth();
            }
            a4.s(i4);
            a4.v(i5);
            int i7 = (int) ((this.f13488a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a4.f13486o = new Rect(i4 - i7, i5 - i7, i4 + i7, i5 + i7);
        }
        a4.e();
    }
}
