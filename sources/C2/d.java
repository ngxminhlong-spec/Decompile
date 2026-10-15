package C2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import r.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final i f512a = new i(0);

    /* renamed from: b, reason: collision with root package name */
    public final i f513b = new i(0);

    public static d a(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        if (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static d b(Context context, int i4) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i4);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e4) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i4), e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [C2.e, java.lang.Object] */
    public static d c(ArrayList arrayList) {
        d dVar = new d();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = (Animator) arrayList.get(i4);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            dVar.f513b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.f508b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = a.c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = a.d;
            }
            ?? obj = new Object();
            obj.d = 0;
            obj.f516e = 1;
            obj.f514a = startDelay;
            obj.f515b = duration;
            obj.c = interpolator;
            obj.d = objectAnimator.getRepeatCount();
            obj.f516e = objectAnimator.getRepeatMode();
            dVar.f512a.put(propertyName, obj);
        }
        return dVar;
    }

    public final e d(String str) {
        i iVar = this.f512a;
        if (iVar.get(str) != null) {
            return (e) iVar.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f512a.equals(((d) obj).f512a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f512a.hashCode();
    }

    public final String toString() {
        return "\n" + d.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f512a + "}\n";
    }
}
