package M;

import H.A;
import H.C0027b;
import I.g;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v3.C2033d;
import x0.f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class b extends C0027b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f1103n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final V2.e f1104o = new V2.e(8);

    /* renamed from: p, reason: collision with root package name */
    public static final C2033d f1105p = new C2033d(8);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f1109h;

    /* renamed from: i, reason: collision with root package name */
    public final Chip f1110i;

    /* renamed from: j, reason: collision with root package name */
    public a f1111j;
    public final Rect d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f1106e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f1107f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1108g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f1112k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f1113l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f1114m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.f1110i = chip;
        this.f1109h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = A.f779a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // H.C0027b
    public final f b(View view) {
        if (this.f1111j == null) {
            this.f1111j = new a(this);
        }
        return this.f1111j;
    }

    @Override // H.C0027b
    public final void d(View view, g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f918a;
        this.f812a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((J2.c) this).f963q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        if (chip.d() || chip.isClickable()) {
            gVar.i(chip.d() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            gVar.i("android.view.View");
        }
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final boolean j(int i4) {
        if (this.f1113l != i4) {
            return false;
        }
        this.f1113l = Integer.MIN_VALUE;
        J2.c cVar = (J2.c) this;
        if (i4 == 1) {
            Chip chip = cVar.f963q;
            chip.f12350z = false;
            chip.refreshDrawableState();
        }
        q(i4, 8);
        return true;
    }

    public final g k(int i4) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        g gVar = new g(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        gVar.i("android.view.View");
        Rect rect = f1103n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.f1110i;
        obtain.setParent(chip);
        o(i4, gVar);
        if (gVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f1106e;
        gVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        gVar.f919b = i4;
        obtain.setSource(chip, i4);
        if (this.f1112k == i4) {
            obtain.setAccessibilityFocused(true);
            gVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            gVar.a(64);
        }
        boolean z4 = this.f1113l == i4;
        if (z4) {
            gVar.a(2);
        } else if (obtain.isFocusable()) {
            gVar.a(1);
        }
        obtain.setFocused(z4);
        int[] iArr = this.f1108g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            gVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f1107f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            gVar.f918a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return gVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M.b.m(int, android.graphics.Rect):boolean");
    }

    public final g n(int i4) {
        if (i4 != -1) {
            return k(i4);
        }
        Chip chip = this.f1110i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        g gVar = new g(obtain);
        WeakHashMap weakHashMap = A.f779a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            gVar.f918a.addChild(chip, ((Integer) arrayList.get(i5)).intValue());
        }
        return gVar;
    }

    public abstract void o(int i4, g gVar);

    public final boolean p(int i4) {
        int i5;
        Chip chip = this.f1110i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i5 = this.f1113l) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            j(i5);
        }
        this.f1113l = i4;
        J2.c cVar = (J2.c) this;
        if (i4 == 1) {
            Chip chip2 = cVar.f963q;
            chip2.f12350z = true;
            chip2.refreshDrawableState();
        }
        q(i4, 8);
        return true;
    }

    public final void q(int i4, int i5) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i4 == Integer.MIN_VALUE || !this.f1109h.isEnabled() || (parent = (view = this.f1110i).getParent()) == null) {
            return;
        }
        if (i4 != -1) {
            obtain = AccessibilityEvent.obtain(i5);
            g n4 = n(i4);
            obtain.getText().add(n4.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n4.f918a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i4);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i5);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }

    public final void r(int i4) {
        int i5 = this.f1114m;
        if (i5 == i4) {
            return;
        }
        this.f1114m = i4;
        q(i4, 128);
        q(i5, 256);
    }
}
