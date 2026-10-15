package Y2;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h extends n {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(TextInputLayout textInputLayout, int i4) {
        super(textInputLayout);
        this.d = i4;
    }

    @Override // Y2.n
    public final void a() {
        switch (this.d) {
            case 0:
                TextInputLayout textInputLayout = this.f2184a;
                textInputLayout.setEndIconOnClickListener(null);
                textInputLayout.setEndIconOnLongClickListener(null);
                return;
            default:
                TextInputLayout textInputLayout2 = this.f2184a;
                textInputLayout2.setEndIconOnClickListener(null);
                textInputLayout2.setEndIconDrawable((Drawable) null);
                textInputLayout2.setEndIconContentDescription((CharSequence) null);
                return;
        }
    }
}
