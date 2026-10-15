package C2;

import android.util.Property;
import android.view.ViewGroup;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public static final b f509a = new Property(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Object get(Object obj) {
        Float f4 = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return f4 != null ? f4 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Float f4 = (Float) obj2;
        float floatValue = f4.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, f4);
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            viewGroup.getChildAt(i4).setAlpha(floatValue);
        }
    }
}
