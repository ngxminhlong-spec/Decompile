package H;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: H.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0027b f809a;

    public C0026a(C0027b c0027b) {
        this.f809a = c0027b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f809a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        x0.f b4 = this.f809a.b(view);
        if (b4 != null) {
            return (AccessibilityNodeProvider) b4.f15212p;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f809a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object obj;
        Object tag2;
        int i4;
        I.g gVar = new I.g(accessibilityNodeInfo);
        WeakHashMap weakHashMap = A.f779a;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            tag = Boolean.valueOf(AbstractC0047w.c(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i6 = 0;
        boolean z4 = bool != null && bool.booleanValue();
        if (i5 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z4);
        } else {
            gVar.h(1, z4);
        }
        if (i5 >= 28) {
            obj = Boolean.valueOf(AbstractC0047w.b(view));
        } else {
            Object tag3 = view.getTag(R.id.tag_accessibility_heading);
            obj = Boolean.class.isInstance(tag3) ? tag3 : null;
        }
        Boolean bool2 = (Boolean) obj;
        boolean z5 = bool2 != null && bool2.booleanValue();
        if (i5 >= 28) {
            accessibilityNodeInfo.setHeading(z5);
        } else {
            gVar.h(2, z5);
        }
        CharSequence d = A.d(view);
        if (i5 >= 28) {
            accessibilityNodeInfo.setPaneTitle(d);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d);
        }
        if (i5 >= 30) {
            tag2 = AbstractC0049y.b(view);
        } else {
            tag2 = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag2;
        if (i5 >= 30) {
            B.c.f(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f809a.d(view, gVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i5 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                    if (((WeakReference) sparseArray.valueAt(i7)).get() == null) {
                        arrayList.add(Integer.valueOf(i7));
                    }
                }
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    sparseArray.remove(((Integer) arrayList.get(i8)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i9 = 0;
                while (i9 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i9];
                    int i10 = i6;
                    while (true) {
                        if (i10 >= sparseArray2.size()) {
                            i4 = I.g.c;
                            I.g.c = i4 + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i10)).get())) {
                                i4 = sparseArray2.keyAt(i10);
                                break;
                            }
                            i10++;
                        }
                    }
                    sparseArray2.put(i4, new WeakReference(clickableSpanArr[i9]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i9];
                    Spanned spanned = (Spanned) text;
                    gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i4));
                    i9++;
                    i6 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            gVar.b((I.d) list.get(i11));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f809a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f809a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
        return this.f809a.g(view, i4, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i4) {
        this.f809a.h(view, i4);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f809a.i(view, accessibilityEvent);
    }
}
