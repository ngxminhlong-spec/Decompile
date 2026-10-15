package f;

import H.A;
import H.H;
import H.I;
import H.InterfaceC0035j;
import H.J;
import H.K;
import H.L;
import H.M;
import H.W;
import H.a0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.appcompat.widget.ActionBarContextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.y;
import l.M0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j implements InterfaceC0035j, y {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f12846o;

    @Override // k.y
    public void a(k.m mVar, boolean z4) {
        this.f12846o.m(mVar);
    }

    @Override // k.y
    public boolean d(k.m mVar) {
        Window.Callback callback = this.f12846o.f12910t.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }

    @Override // H.InterfaceC0035j
    public a0 m(View view, a0 a0Var) {
        int i4;
        boolean z4;
        boolean z5;
        W w2 = a0Var.f811a;
        int b4 = a0Var.b();
        q qVar = this.f12846o;
        Context context = qVar.f12909s;
        ActionBarContextView actionBarContextView = qVar.f12874D;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i4 = b4;
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f12874D.getLayoutParams();
            if (qVar.f12874D.isShown()) {
                if (qVar.f12905j0 == null) {
                    qVar.f12905j0 = new Rect();
                    qVar.f12906k0 = new Rect();
                }
                Rect rect = qVar.f12905j0;
                Rect rect2 = qVar.f12906k0;
                rect.set(0, b4, 0, 0);
                ViewGroup viewGroup = qVar.f12879I;
                Method method = M0.f13663a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e4) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e4);
                    }
                }
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? b4 : 0)) {
                    marginLayoutParams.topMargin = b4;
                    View view2 = qVar.f12881K;
                    if (view2 == null) {
                        View view3 = new View(context);
                        qVar.f12881K = view3;
                        view3.setBackgroundColor(context.getResources().getColor(R.color.abc_input_method_navigation_guard));
                        qVar.f12879I.addView(qVar.f12881K, -1, new ViewGroup.LayoutParams(-1, b4));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams.height != b4) {
                            layoutParams.height = b4;
                            qVar.f12881K.setLayoutParams(layoutParams);
                        }
                    }
                    z5 = true;
                } else {
                    z5 = false;
                }
                r7 = qVar.f12881K != null;
                i4 = (qVar.f12885P || !r7) ? b4 : 0;
                boolean z6 = r7;
                r7 = z5;
                z4 = z6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                i4 = b4;
                z4 = false;
            } else {
                i4 = b4;
                z4 = false;
                r7 = false;
            }
            if (r7) {
                qVar.f12874D.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = qVar.f12881K;
        if (view4 != null) {
            view4.setVisibility(z4 ? 0 : 8);
        }
        if (b4 != i4) {
            int i5 = w2.j().f1a;
            int i6 = w2.j().c;
            int a4 = a0Var.a();
            int i7 = Build.VERSION.SDK_INT;
            M l4 = i7 >= 34 ? new L(a0Var) : i7 >= 31 ? new K(a0Var) : i7 >= 30 ? new J(a0Var) : i7 >= 29 ? new I(a0Var) : new H(a0Var);
            l4.c(A.d.a(i5, i4, i6, a4));
            a0Var = l4.b();
        }
        WeakHashMap weakHashMap = A.f779a;
        WindowInsets c = a0Var.c();
        if (c != null) {
            WindowInsets b5 = H.r.b(view, c);
            if (!b5.equals(c)) {
                return a0.d(b5, view);
            }
        }
        return a0Var;
    }
}
