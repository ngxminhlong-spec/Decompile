package Q2;

import H.A;
import P2.p;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewTreeObserver;
import com.duracodefactory.logiccircuitsimulatorpro.ui.NavigationViewFit;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C1749f;
import k.E;
import k.g;
import l.C1770h0;
import l.F;
import l.I;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1739o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1740p;

    public /* synthetic */ a(int i4, Object obj) {
        this.f1739o = i4;
        this.f1740p = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i4 = this.f1739o;
        boolean z4 = false;
        int i5 = 0;
        z4 = false;
        Object obj = this.f1740p;
        switch (i4) {
            case 0:
                NavigationViewFit navigationViewFit = (NavigationViewFit) obj;
                int[] iArr = navigationViewFit.f1747w;
                navigationViewFit.getLocationOnScreen(iArr);
                boolean z5 = iArr[1] == 0;
                p pVar = navigationViewFit.f1745u;
                if (pVar.f1583D != z5) {
                    pVar.f1583D = z5;
                    int i6 = (pVar.f1590p.getChildCount() == 0 && pVar.f1583D) ? pVar.f1585F : 0;
                    NavigationMenuView navigationMenuView = pVar.f1589o;
                    navigationMenuView.setPadding(0, i6, 0, navigationMenuView.getPaddingBottom());
                }
                navigationViewFit.setDrawTopInsetForeground(z5);
                Context context = navigationViewFit.getContext();
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    Object[] objArr = activity.findViewById(R.id.content).getHeight() == navigationViewFit.getHeight();
                    Object[] objArr2 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                    if (objArr != false && objArr2 != false) {
                        z4 = true;
                    }
                    navigationViewFit.setDrawBottomInsetForeground(z4);
                    return;
                }
                return;
            case 1:
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f13408v;
                if (!gVar.b() || arrayList.size() <= 0 || ((C1749f) arrayList.get(0)).f13387a.f13739L) {
                    return;
                }
                View view = gVar.f13391C;
                if (view == null || !view.isShown()) {
                    gVar.dismiss();
                    return;
                }
                int size = arrayList.size();
                while (i5 < size) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    ((C1749f) obj2).f13387a.e();
                }
                return;
            case 2:
                E e4 = (E) obj;
                C1770h0 c1770h0 = e4.f13362v;
                if (!e4.b() || c1770h0.f13739L) {
                    return;
                }
                View view2 = e4.f13348A;
                if (view2 == null || !view2.isShown()) {
                    e4.dismiss();
                    return;
                } else {
                    c1770h0.e();
                    return;
                }
            case 3:
                I i7 = (I) obj;
                if (!i7.getInternalPopup().b()) {
                    i7.f13624t.m(i7.getTextDirection(), i7.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = i7.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                F f4 = (F) obj;
                I i8 = f4.f13599U;
                f4.getClass();
                WeakHashMap weakHashMap = A.f779a;
                if (!i8.isAttachedToWindow() || !i8.getGlobalVisibleRect(f4.f13597S)) {
                    f4.dismiss();
                    return;
                } else {
                    f4.s();
                    f4.e();
                    return;
                }
        }
    }
}
