package H;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: H.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0027b {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f812a;

    /* renamed from: b, reason: collision with root package name */
    public final C0026a f813b;

    public C0027b() {
        this(c);
    }

    public C0027b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f812a = accessibilityDelegate;
        this.f813b = new C0026a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f812a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public x0.f b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f812a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new x0.f(14, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f812a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, I.g gVar) {
        this.f812a.onInitializeAccessibilityNodeInfo(view, gVar.f918a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f812a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f812a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i4, Bundle bundle) {
        boolean z4;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z5 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= list.size()) {
                break;
            }
            I.d dVar = (I.d) list.get(i5);
            if (dVar.a() == i4) {
                Class cls = dVar.c;
                I.q qVar = dVar.d;
                if (qVar != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e4) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e4);
                        }
                    }
                    z4 = qVar.f(view);
                }
            } else {
                i5++;
            }
        }
        z4 = false;
        if (!z4) {
            z4 = this.f812a.performAccessibilityAction(view, i4, bundle);
        }
        if (z4 || i4 != R.id.accessibility_action_clickable_span || bundle == null) {
            return z4;
        }
        int i6 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i6)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i7 = 0;
            while (true) {
                if (clickableSpanArr == null || i7 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i7])) {
                    clickableSpan.onClick(view);
                    z5 = true;
                    break;
                }
                i7++;
            }
        }
        return z5;
    }

    public void h(View view, int i4) {
        this.f812a.sendAccessibilityEvent(view, i4);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f812a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
