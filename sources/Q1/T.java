package Q1;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C1035pc;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class T extends Q {
    @Override // Q1.O
    public final int g(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }

    @Override // Q1.O
    public final void h(final Activity activity) {
        boolean isInMultiWindowMode;
        int i4;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10170U0)).booleanValue() && N1.n.f1204A.f1209g.c().A() == null) {
            isInMultiWindowMode = activity.isInMultiWindowMode();
            if (isInMultiWindowMode) {
                return;
            }
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            i4 = attributes.layoutInDisplayCutoutMode;
            if (1 != i4) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: Q1.S
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int i5;
                    DisplayCutout displayCutout;
                    List<Rect> boundingRects;
                    C1035pc c1035pc = N1.n.f1204A.f1209g;
                    if (c1035pc.c().A() == null) {
                        displayCutout = windowInsets.getDisplayCutout();
                        String str = "";
                        if (displayCutout != null) {
                            K c = c1035pc.c();
                            boundingRects = displayCutout.getBoundingRects();
                            for (Rect rect : boundingRects) {
                                Locale locale = Locale.US;
                                String str2 = rect.left + "," + rect.top + "," + rect.right + "," + rect.bottom;
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("|");
                                }
                                str = str.concat(str2);
                            }
                            c.c(str);
                        } else {
                            c1035pc.c().c("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    i5 = attributes2.layoutInDisplayCutoutMode;
                    if (2 != i5) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }
}
