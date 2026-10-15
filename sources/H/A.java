package H;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f779a;

    /* renamed from: b, reason: collision with root package name */
    public static Field f780b;
    public static boolean c;

    static {
        new WeakHashMap();
    }

    public static F a(View view) {
        if (f779a == null) {
            f779a = new WeakHashMap();
        }
        F f4 = (F) f779a.get(view);
        if (f4 != null) {
            return f4;
        }
        F f5 = new F(view);
        f779a.put(view, f5);
        return f5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [H.z, java.lang.Object] */
    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C0050z.d;
        C0050z c0050z = (C0050z) view.getTag(R.id.tag_unhandled_key_event_manager);
        C0050z c0050z2 = c0050z;
        if (c0050z == null) {
            ?? obj = new Object();
            obj.f837a = null;
            obj.f838b = null;
            obj.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            c0050z2 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c0050z2.f837a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C0050z.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c0050z2.f837a == null) {
                            c0050z2.f837a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C0050z.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c0050z2.f837a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c0050z2.f837a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a4 = c0050z2.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a4 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c0050z2.f838b == null) {
                    c0050z2.f838b = new SparseArray();
                }
                c0050z2.f838b.put(keyCode, new WeakReference(a4));
            }
        }
        return a4 != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0048x.a(view);
        }
        if (c) {
            return null;
        }
        if (f780b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f780b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = f780b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC0047w.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static void e(View view, int i4) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z4 = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z4) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z4 ? 32 : 2048);
                obtain.setContentChangeTypes(i4);
                if (z4) {
                    obtain.getText().add(d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i4 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i4);
                        return;
                    } catch (AbstractMethodError e4) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e4);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i4);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static void f(View view, int i4) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList);
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (((I.d) arrayList.get(i5)).a() == i4) {
                arrayList.remove(i5);
                return;
            }
        }
    }

    public static void g(View view, I.d dVar, I.q qVar) {
        I.d dVar2 = new I.d(null, dVar.f917b, qVar, dVar.c);
        View.AccessibilityDelegate c2 = c(view);
        C0027b c0027b = c2 != null ? c2 instanceof C0026a ? ((C0026a) c2).f809a : new C0027b(c2) : null;
        if (c0027b == null) {
            c0027b = new C0027b();
        }
        h(view, c0027b);
        f(view, dVar2.a());
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList);
        }
        arrayList.add(dVar2);
        e(view, 0);
    }

    public static void h(View view, C0027b c0027b) {
        if (c0027b == null && (c(view) instanceof C0026a)) {
            c0027b = new C0027b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0027b == null ? null : c0027b.f813b);
    }
}
