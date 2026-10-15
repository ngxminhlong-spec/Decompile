package I;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class h extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final x0.f f920a;

    public h(x0.f fVar) {
        this.f920a = fVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        g n4 = this.f920a.n(i4);
        if (n4 == null) {
            return null;
        }
        return n4.f918a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i4) {
        this.f920a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i4) {
        g v4 = this.f920a.v(i4);
        if (v4 == null) {
            return null;
        }
        return v4.f918a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i4, int i5, Bundle bundle) {
        return this.f920a.z(i4, i5, bundle);
    }
}
