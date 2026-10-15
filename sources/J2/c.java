package J2;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c extends M.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f963q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f963q = chip;
    }

    @Override // M.b
    public final void l(ArrayList arrayList) {
        e eVar;
        arrayList.add(0);
        Rect rect = Chip.f12333H;
        Chip chip = this.f963q;
        if (!chip.c() || (eVar = chip.f12343r) == null || !eVar.f995Y || chip.f12346u == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // M.b
    public final void o(int i4, I.g gVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f918a;
        if (i4 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f12333H);
            return;
        }
        Chip chip = this.f963q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        gVar.b(I.d.f908g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
