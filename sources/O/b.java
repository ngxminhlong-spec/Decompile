package O;

import H.A;
import H.C0027b;
import W2.l;
import W2.n;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.datepicker.i;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends C0027b {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1239e;

    public /* synthetic */ b(int i4, Object obj) {
        this.d = i4;
        this.f1239e = obj;
    }

    public b(DrawerLayout drawerLayout) {
        this.d = 0;
        this.f1239e = drawerLayout;
        new Rect();
    }

    @Override // H.C0027b
    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                DrawerLayout drawerLayout = (DrawerLayout) this.f1239e;
                if (accessibilityEvent.getEventType() != 32) {
                    return this.f812a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }
                accessibilityEvent.getText();
                View g4 = drawerLayout.g();
                if (g4 != null) {
                    int i4 = drawerLayout.i(g4);
                    drawerLayout.getClass();
                    WeakHashMap weakHashMap = A.f779a;
                    Gravity.getAbsoluteGravity(i4, drawerLayout.getLayoutDirection());
                }
                return true;
            default:
                return super.a(view, accessibilityEvent);
        }
    }

    @Override // H.C0027b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(DrawerLayout.class.getName());
                return;
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1239e).f12437q);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // H.C0027b
    public final void d(View view, I.g gVar) {
        int i4 = this.d;
        Object obj = this.f1239e;
        View.AccessibilityDelegate accessibilityDelegate = this.f812a;
        switch (i4) {
            case 0:
                int[] iArr = DrawerLayout.f2716P;
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f918a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                gVar.i(DrawerLayout.class.getName());
                accessibilityNodeInfo.setFocusable(false);
                accessibilityNodeInfo.setFocused(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) I.d.f906e.f916a);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) I.d.f907f.f916a);
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f918a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f12438r);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f12437q);
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = gVar.f918a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f12443L);
                return;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = gVar.f918a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                gVar.a(1048576);
                accessibilityNodeInfo4.setDismissable(true);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f918a);
                i iVar = (i) obj;
                gVar.k(iVar.f12386p0.getVisibility() == 0 ? iVar.m().getString(R.string.mtrl_picker_toggle_to_year_selection) : iVar.m().getString(R.string.mtrl_picker_toggle_to_day_selection));
                return;
        }
    }

    @Override // H.C0027b
    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                int[] iArr = DrawerLayout.f2716P;
                return this.f812a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            default:
                return super.f(viewGroup, view, accessibilityEvent);
        }
    }

    @Override // H.C0027b
    public boolean g(View view, int i4, Bundle bundle) {
        switch (this.d) {
            case 3:
                if (i4 != 1048576) {
                    return super.g(view, i4, bundle);
                }
                ((n) ((l) this.f1239e)).a(3);
                return true;
            default:
                return super.g(view, i4, bundle);
        }
    }
}
