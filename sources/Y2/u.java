package Y2;

import H.C0027b;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class u extends C0027b {
    public final TextInputLayout d;

    public u(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // H.C0027b
    public void d(View view, I.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f918a;
        this.f812a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean isEmpty3 = TextUtils.isEmpty(helperText);
        boolean isEmpty4 = TextUtils.isEmpty(error);
        boolean z4 = (isEmpty4 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        sb.append(((isEmpty4 && isEmpty3) || TextUtils.isEmpty(charSequence)) ? "" : ", ");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        if (!isEmpty4) {
            helperText = error;
        } else if (isEmpty3) {
            helperText = "";
        }
        sb3.append((Object) helperText);
        String sb4 = sb3.toString();
        if (!isEmpty) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(sb4)) {
            accessibilityNodeInfo.setText(sb4);
        }
        if (!TextUtils.isEmpty(sb4)) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 26) {
                gVar.k(sb4);
            } else {
                if (!isEmpty) {
                    sb4 = ((Object) text) + ", " + sb4;
                }
                accessibilityNodeInfo.setText(sb4);
            }
            if (i4 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                gVar.h(4, isEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z4) {
            if (isEmpty4) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
    }
}
