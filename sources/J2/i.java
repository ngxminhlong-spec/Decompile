package J2;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: o, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1025o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f1026p;

    public i(ChipGroup chipGroup) {
        this.f1026p = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f1026p;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            ((Chip) view2).setOnCheckedChangeListenerInternal(chipGroup.f12355w);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f1025o;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.f1026p && (view2 instanceof Chip)) {
            ((Chip) view2).setOnCheckedChangeListenerInternal(null);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f1025o;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
