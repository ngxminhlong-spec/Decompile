package I;

import H.AbstractC0040o;
import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f906e = new d(null, 1, null, null);

    /* renamed from: f, reason: collision with root package name */
    public static final d f907f = new d(null, 2, null, null);

    /* renamed from: g, reason: collision with root package name */
    public static final d f908g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f909h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f910i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f911j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f912k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f913l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f914m;

    /* renamed from: n, reason: collision with root package name */
    public static final d f915n;

    /* renamed from: a, reason: collision with root package name */
    public final Object f916a;

    /* renamed from: b, reason: collision with root package name */
    public final int f917b;
    public final Class c;
    public final q d;

    static {
        new d(null, 4, null, null);
        new d(null, 8, null, null);
        f908g = new d(null, 16, null, null);
        new d(null, 32, null, null);
        new d(null, 64, null, null);
        new d(null, 128, null, null);
        new d(null, 256, null, j.class);
        new d(null, 512, null, j.class);
        new d(null, 1024, null, k.class);
        new d(null, 2048, null, k.class);
        f909h = new d(null, 4096, null, null);
        f910i = new d(null, 8192, null, null);
        new d(null, 16384, null, null);
        new d(null, 32768, null, null);
        new d(null, 65536, null, null);
        new d(null, 131072, null, o.class);
        f911j = new d(null, 262144, null, null);
        f912k = new d(null, 524288, null, null);
        f913l = new d(null, 1048576, null, null);
        new d(null, 2097152, null, p.class);
        int i4 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, m.class);
        f914m = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f915n = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new d(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new d(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new d(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new d(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new d(i4 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, n.class);
        new d(i4 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, l.class);
        new d(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new d(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new d(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new d(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new d(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.ALT, null, null);
        new d(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.CTRL, null, null);
        new d(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.FUNCTION, null, null);
        new d(i4 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.KEYCODE_0, null, null);
        new d(i4 >= 34 ? AbstractC0040o.a() : null, R.id.KEYCODE_3D_MODE, null, null);
    }

    public d(Object obj, int i4, q qVar, Class cls) {
        this.f917b = i4;
        this.d = qVar;
        if (obj == null) {
            this.f916a = new AccessibilityNodeInfo.AccessibilityAction(i4, null);
        } else {
            this.f916a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f916a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f916a;
        Object obj3 = this.f916a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f916a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d = g.d(this.f917b);
        if (d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f916a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d);
        return sb.toString();
    }
}
