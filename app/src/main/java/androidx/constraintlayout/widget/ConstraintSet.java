package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.p013io.IOUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.C0769Lu;
import p000.C0786MA;
import p000.C0832Mu;
import p000.C1262Tc;
import p000.C1300UC;
import p000.C5144ou;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintSet {
    private static final int ALPHA = 43;
    private static final int ANIMATE_RELATIVE_TO = 64;
    private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
    private static final int BARRIER_DIRECTION = 72;
    private static final int BARRIER_MARGIN = 73;
    private static final int BARRIER_TYPE = 1;
    public static final int BASELINE = 5;
    private static final int BASELINE_TO_BASELINE = 1;
    public static final int BOTTOM = 4;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    private static final int CHAIN_USE_RTL = 71;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 63;
    private static final int CIRCLE_RADIUS = 62;
    private static final int CONSTRAINED_HEIGHT = 81;
    private static final int CONSTRAINED_WIDTH = 80;
    private static final int CONSTRAINT_REFERENCED_IDS = 74;
    private static final int CONSTRAINT_TAG = 77;
    private static final boolean DEBUG = false;
    private static final int DIMENSION_RATIO = 5;
    private static final int DRAW_PATH = 66;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int ELEVATION = 44;
    public static final int END = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    private static final String ERROR_MESSAGE = "XML parser error must be within a Constraint ";
    public static final int GONE = 8;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int HEIGHT_DEFAULT = 55;
    private static final int HEIGHT_MAX = 57;
    private static final int HEIGHT_MIN = 59;
    private static final int HEIGHT_PERCENT = 70;
    public static final int HORIZONTAL = 0;
    private static final int HORIZONTAL_BIAS = 20;
    public static final int HORIZONTAL_GUIDELINE = 0;
    private static final int HORIZONTAL_STYLE = 41;
    private static final int HORIZONTAL_WEIGHT = 39;
    public static final int INVISIBLE = 4;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_VISIBILITY = 22;
    private static final int LAYOUT_WIDTH = 23;
    public static final int LEFT = 1;
    private static final int LEFT_MARGIN = 24;
    private static final int LEFT_TO_LEFT = 25;
    private static final int LEFT_TO_RIGHT = 26;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    private static final int MOTION_STAGGER = 79;
    private static final int ORIENTATION = 27;
    public static final int PARENT_ID = 0;
    private static final int PATH_MOTION_ARC = 76;
    private static final int PROGRESS = 68;
    public static final int RIGHT = 2;
    private static final int RIGHT_MARGIN = 28;
    private static final int RIGHT_TO_LEFT = 29;
    private static final int RIGHT_TO_RIGHT = 30;
    private static final int ROTATION = 60;
    private static final int ROTATION_X = 45;
    private static final int ROTATION_Y = 46;
    private static final int SCALE_X = 47;
    private static final int SCALE_Y = 48;
    public static final int START = 6;
    private static final int START_MARGIN = 31;
    private static final int START_TO_END = 32;
    private static final int START_TO_START = 33;
    private static final String TAG = "ConstraintSet";
    public static final int TOP = 3;
    private static final int TOP_MARGIN = 34;
    private static final int TOP_TO_BOTTOM = 35;
    private static final int TOP_TO_TOP = 36;
    private static final int TRANSFORM_PIVOT_X = 49;
    private static final int TRANSFORM_PIVOT_Y = 50;
    private static final int TRANSITION_EASING = 65;
    private static final int TRANSITION_PATH_ROTATE = 67;
    private static final int TRANSLATION_X = 51;
    private static final int TRANSLATION_Y = 52;
    private static final int TRANSLATION_Z = 53;
    public static final int UNSET = -1;
    private static final int UNUSED = 82;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_BIAS = 37;
    public static final int VERTICAL_GUIDELINE = 1;
    private static final int VERTICAL_STYLE = 42;
    private static final int VERTICAL_WEIGHT = 40;
    private static final int VIEW_ID = 38;
    private static final int[] VISIBILITY_FLAGS = {0, 4, 8};
    private static final int VISIBILITY_MODE = 78;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    private static final int WIDTH_DEFAULT = 54;
    private static final int WIDTH_MAX = 56;
    private static final int WIDTH_MIN = 58;
    private static final int WIDTH_PERCENT = 69;
    public static final int WRAP_CONTENT = -2;
    private static SparseIntArray mapToConstant;
    private boolean mValidate;
    private HashMap<String, ConstraintAttribute> mSavedAttributes = new HashMap<>();
    private boolean mForceId = true;
    private HashMap<Integer, Constraint> mConstraints = new HashMap<>();

    public static class Constraint {
        int mViewId;
        public final PropertySet propertySet = new PropertySet();
        public final Motion motion = new Motion();
        public final Layout layout = new Layout();
        public final Transform transform = new Transform();
        public HashMap<String, ConstraintAttribute> mCustomConstraints = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFrom(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.mViewId = i;
            Layout layout = this.layout;
            layout.leftToLeft = layoutParams.leftToLeft;
            layout.leftToRight = layoutParams.leftToRight;
            layout.rightToLeft = layoutParams.rightToLeft;
            layout.rightToRight = layoutParams.rightToRight;
            layout.topToTop = layoutParams.topToTop;
            layout.topToBottom = layoutParams.topToBottom;
            layout.bottomToTop = layoutParams.bottomToTop;
            layout.bottomToBottom = layoutParams.bottomToBottom;
            layout.baselineToBaseline = layoutParams.baselineToBaseline;
            layout.startToEnd = layoutParams.startToEnd;
            layout.startToStart = layoutParams.startToStart;
            layout.endToStart = layoutParams.endToStart;
            layout.endToEnd = layoutParams.endToEnd;
            layout.horizontalBias = layoutParams.horizontalBias;
            layout.verticalBias = layoutParams.verticalBias;
            layout.dimensionRatio = layoutParams.dimensionRatio;
            layout.circleConstraint = layoutParams.circleConstraint;
            layout.circleRadius = layoutParams.circleRadius;
            layout.circleAngle = layoutParams.circleAngle;
            layout.editorAbsoluteX = layoutParams.editorAbsoluteX;
            layout.editorAbsoluteY = layoutParams.editorAbsoluteY;
            layout.orientation = layoutParams.orientation;
            layout.guidePercent = layoutParams.guidePercent;
            layout.guideBegin = layoutParams.guideBegin;
            layout.guideEnd = layoutParams.guideEnd;
            layout.mWidth = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            layout.mHeight = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            layout.leftMargin = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            layout.rightMargin = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            layout.topMargin = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            layout.bottomMargin = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layout.verticalWeight = layoutParams.verticalWeight;
            layout.horizontalWeight = layoutParams.horizontalWeight;
            layout.verticalChainStyle = layoutParams.verticalChainStyle;
            layout.horizontalChainStyle = layoutParams.horizontalChainStyle;
            layout.constrainedWidth = layoutParams.constrainedWidth;
            layout.constrainedHeight = layoutParams.constrainedHeight;
            layout.widthDefault = layoutParams.matchConstraintDefaultWidth;
            layout.heightDefault = layoutParams.matchConstraintDefaultHeight;
            layout.widthMax = layoutParams.matchConstraintMaxWidth;
            layout.heightMax = layoutParams.matchConstraintMaxHeight;
            layout.widthMin = layoutParams.matchConstraintMinWidth;
            layout.heightMin = layoutParams.matchConstraintMinHeight;
            layout.widthPercent = layoutParams.matchConstraintPercentWidth;
            layout.heightPercent = layoutParams.matchConstraintPercentHeight;
            layout.mConstraintTag = layoutParams.constraintTag;
            layout.goneTopMargin = layoutParams.goneTopMargin;
            layout.goneBottomMargin = layoutParams.goneBottomMargin;
            layout.goneLeftMargin = layoutParams.goneLeftMargin;
            layout.goneRightMargin = layoutParams.goneRightMargin;
            layout.goneStartMargin = layoutParams.goneStartMargin;
            layout.goneEndMargin = layoutParams.goneEndMargin;
            layout.endMargin = layoutParams.getMarginEnd();
            this.layout.startMargin = layoutParams.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFromConstraints(int i, Constraints.LayoutParams layoutParams) {
            fillFrom(i, layoutParams);
            this.propertySet.alpha = layoutParams.alpha;
            Transform transform = this.transform;
            transform.rotation = layoutParams.rotation;
            transform.rotationX = layoutParams.rotationX;
            transform.rotationY = layoutParams.rotationY;
            transform.scaleX = layoutParams.scaleX;
            transform.scaleY = layoutParams.scaleY;
            transform.transformPivotX = layoutParams.transformPivotX;
            transform.transformPivotY = layoutParams.transformPivotY;
            transform.translationX = layoutParams.translationX;
            transform.translationY = layoutParams.translationY;
            transform.translationZ = layoutParams.translationZ;
            transform.elevation = layoutParams.elevation;
            transform.applyElevation = layoutParams.applyElevation;
        }

        private ConstraintAttribute get(String str, ConstraintAttribute.AttributeType attributeType) {
            if (!this.mCustomConstraints.containsKey(str)) {
                ConstraintAttribute constraintAttribute = new ConstraintAttribute(str, attributeType);
                this.mCustomConstraints.put(str, constraintAttribute);
                return constraintAttribute;
            }
            ConstraintAttribute constraintAttribute2 = this.mCustomConstraints.get(str);
            if (constraintAttribute2.getType() == attributeType) {
                return constraintAttribute2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute2.getType().name());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorValue(String str, int i) {
            get(str, ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatValue(String str, float f) {
            get(str, ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(String str, int i) {
            get(str, ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(String str, String str2) {
            get(str, ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(str2);
        }

        public void applyTo(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout = this.layout;
            layoutParams.leftToLeft = layout.leftToLeft;
            layoutParams.leftToRight = layout.leftToRight;
            layoutParams.rightToLeft = layout.rightToLeft;
            layoutParams.rightToRight = layout.rightToRight;
            layoutParams.topToTop = layout.topToTop;
            layoutParams.topToBottom = layout.topToBottom;
            layoutParams.bottomToTop = layout.bottomToTop;
            layoutParams.bottomToBottom = layout.bottomToBottom;
            layoutParams.baselineToBaseline = layout.baselineToBaseline;
            layoutParams.startToEnd = layout.startToEnd;
            layoutParams.startToStart = layout.startToStart;
            layoutParams.endToStart = layout.endToStart;
            layoutParams.endToEnd = layout.endToEnd;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = layout.leftMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = layout.rightMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = layout.topMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = layout.bottomMargin;
            layoutParams.goneStartMargin = layout.goneStartMargin;
            layoutParams.goneEndMargin = layout.goneEndMargin;
            layoutParams.goneTopMargin = layout.goneTopMargin;
            layoutParams.goneBottomMargin = layout.goneBottomMargin;
            layoutParams.horizontalBias = layout.horizontalBias;
            layoutParams.verticalBias = layout.verticalBias;
            layoutParams.circleConstraint = layout.circleConstraint;
            layoutParams.circleRadius = layout.circleRadius;
            layoutParams.circleAngle = layout.circleAngle;
            layoutParams.dimensionRatio = layout.dimensionRatio;
            layoutParams.editorAbsoluteX = layout.editorAbsoluteX;
            layoutParams.editorAbsoluteY = layout.editorAbsoluteY;
            layoutParams.verticalWeight = layout.verticalWeight;
            layoutParams.horizontalWeight = layout.horizontalWeight;
            layoutParams.verticalChainStyle = layout.verticalChainStyle;
            layoutParams.horizontalChainStyle = layout.horizontalChainStyle;
            layoutParams.constrainedWidth = layout.constrainedWidth;
            layoutParams.constrainedHeight = layout.constrainedHeight;
            layoutParams.matchConstraintDefaultWidth = layout.widthDefault;
            layoutParams.matchConstraintDefaultHeight = layout.heightDefault;
            layoutParams.matchConstraintMaxWidth = layout.widthMax;
            layoutParams.matchConstraintMaxHeight = layout.heightMax;
            layoutParams.matchConstraintMinWidth = layout.widthMin;
            layoutParams.matchConstraintMinHeight = layout.heightMin;
            layoutParams.matchConstraintPercentWidth = layout.widthPercent;
            layoutParams.matchConstraintPercentHeight = layout.heightPercent;
            layoutParams.orientation = layout.orientation;
            layoutParams.guidePercent = layout.guidePercent;
            layoutParams.guideBegin = layout.guideBegin;
            layoutParams.guideEnd = layout.guideEnd;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = layout.mWidth;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = layout.mHeight;
            String str = layout.mConstraintTag;
            if (str != null) {
                layoutParams.constraintTag = str;
            }
            layoutParams.setMarginStart(layout.startMargin);
            layoutParams.setMarginEnd(this.layout.endMargin);
            layoutParams.validate();
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Constraint m30210clone() {
            Constraint constraint = new Constraint();
            constraint.layout.copyFrom(this.layout);
            constraint.motion.copyFrom(this.motion);
            constraint.propertySet.copyFrom(this.propertySet);
            constraint.transform.copyFrom(this.transform);
            constraint.mViewId = this.mViewId;
            return constraint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFromConstraints(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            fillFromConstraints(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                Layout layout = this.layout;
                layout.mHelperType = 1;
                Barrier barrier = (Barrier) constraintHelper;
                layout.mBarrierDirection = barrier.getType();
                this.layout.mReferenceIds = barrier.getReferencedIds();
                this.layout.mBarrierMargin = barrier.getMargin();
            }
        }
    }

    public static class Layout {
        private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
        private static final int BARRIER_DIRECTION = 72;
        private static final int BARRIER_MARGIN = 73;
        private static final int BASELINE_TO_BASELINE = 1;
        private static final int BOTTOM_MARGIN = 2;
        private static final int BOTTOM_TO_BOTTOM = 3;
        private static final int BOTTOM_TO_TOP = 4;
        private static final int CHAIN_USE_RTL = 71;
        private static final int CIRCLE = 61;
        private static final int CIRCLE_ANGLE = 63;
        private static final int CIRCLE_RADIUS = 62;
        private static final int CONSTRAINT_REFERENCED_IDS = 74;
        private static final int DIMENSION_RATIO = 5;
        private static final int EDITOR_ABSOLUTE_X = 6;
        private static final int EDITOR_ABSOLUTE_Y = 7;
        private static final int END_MARGIN = 8;
        private static final int END_TO_END = 9;
        private static final int END_TO_START = 10;
        private static final int GONE_BOTTOM_MARGIN = 11;
        private static final int GONE_END_MARGIN = 12;
        private static final int GONE_LEFT_MARGIN = 13;
        private static final int GONE_RIGHT_MARGIN = 14;
        private static final int GONE_START_MARGIN = 15;
        private static final int GONE_TOP_MARGIN = 16;
        private static final int GUIDE_BEGIN = 17;
        private static final int GUIDE_END = 18;
        private static final int GUIDE_PERCENT = 19;
        private static final int HEIGHT_PERCENT = 70;
        private static final int HORIZONTAL_BIAS = 20;
        private static final int HORIZONTAL_STYLE = 39;
        private static final int HORIZONTAL_WEIGHT = 37;
        private static final int LAYOUT_HEIGHT = 21;
        private static final int LAYOUT_WIDTH = 22;
        private static final int LEFT_MARGIN = 23;
        private static final int LEFT_TO_LEFT = 24;
        private static final int LEFT_TO_RIGHT = 25;
        private static final int ORIENTATION = 26;
        private static final int RIGHT_MARGIN = 27;
        private static final int RIGHT_TO_LEFT = 28;
        private static final int RIGHT_TO_RIGHT = 29;
        private static final int START_MARGIN = 30;
        private static final int START_TO_END = 31;
        private static final int START_TO_START = 32;
        private static final int TOP_MARGIN = 33;
        private static final int TOP_TO_BOTTOM = 34;
        private static final int TOP_TO_TOP = 35;
        public static final int UNSET = -1;
        private static final int UNUSED = 76;
        private static final int VERTICAL_BIAS = 36;
        private static final int VERTICAL_STYLE = 40;
        private static final int VERTICAL_WEIGHT = 38;
        private static final int WIDTH_PERCENT = 69;
        private static SparseIntArray mapToConstant;
        public String mConstraintTag;
        public int mHeight;
        public String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public boolean mIsGuideline = false;
        public boolean mApply = false;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int topToTop = -1;
        public int topToBottom = -1;
        public int bottomToTop = -1;
        public int bottomToBottom = -1;
        public int baselineToBaseline = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int endToStart = -1;
        public int endToEnd = -1;
        public float horizontalBias = 0.5f;
        public float verticalBias = 0.5f;
        public String dimensionRatio = null;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public float circleAngle = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int orientation = -1;
        public int leftMargin = -1;
        public int rightMargin = -1;
        public int topMargin = -1;
        public int bottomMargin = -1;
        public int endMargin = -1;
        public int startMargin = -1;
        public int goneLeftMargin = -1;
        public int goneTopMargin = -1;
        public int goneRightMargin = -1;
        public int goneBottomMargin = -1;
        public int goneEndMargin = -1;
        public int goneStartMargin = -1;
        public float verticalWeight = -1.0f;
        public float horizontalWeight = -1.0f;
        public int horizontalChainStyle = 0;
        public int verticalChainStyle = 0;
        public int widthDefault = 0;
        public int heightDefault = 0;
        public int widthMax = -1;
        public int heightMax = -1;
        public int widthMin = -1;
        public int heightMin = -1;
        public float widthPercent = 1.0f;
        public float heightPercent = 1.0f;
        public int mBarrierDirection = -1;
        public int mBarrierMargin = 0;
        public int mHelperType = -1;
        public boolean constrainedWidth = false;
        public boolean constrainedHeight = false;
        public boolean mBarrierAllowsGoneWidgets = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(C2567R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            mapToConstant.append(C2567R.styleable.Layout_layout_editor_absoluteX, 6);
            mapToConstant.append(C2567R.styleable.Layout_layout_editor_absoluteY, 7);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintGuide_begin, 17);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintGuide_end, 18);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintGuide_percent, 19);
            mapToConstant.append(C2567R.styleable.Layout_android_orientation, 26);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            mapToConstant.append(C2567R.styleable.Layout_layout_goneMarginLeft, 13);
            mapToConstant.append(C2567R.styleable.Layout_layout_goneMarginTop, 16);
            mapToConstant.append(C2567R.styleable.Layout_layout_goneMarginRight, 14);
            mapToConstant.append(C2567R.styleable.Layout_layout_goneMarginBottom, 11);
            mapToConstant.append(C2567R.styleable.Layout_layout_goneMarginStart, 15);
            mapToConstant.append(C2567R.styleable.Layout_layout_goneMarginEnd, 12);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintVertical_weight, 38);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintVertical_bias, 36);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintDimensionRatio, 5);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintLeft_creator, 76);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintTop_creator, 76);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintRight_creator, 76);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintBottom_creator, 76);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintBaseline_creator, 76);
            mapToConstant.append(C2567R.styleable.Layout_android_layout_marginLeft, 23);
            mapToConstant.append(C2567R.styleable.Layout_android_layout_marginRight, 27);
            mapToConstant.append(C2567R.styleable.Layout_android_layout_marginStart, 30);
            mapToConstant.append(C2567R.styleable.Layout_android_layout_marginEnd, 8);
            mapToConstant.append(C2567R.styleable.Layout_android_layout_marginTop, 33);
            mapToConstant.append(C2567R.styleable.Layout_android_layout_marginBottom, 2);
            mapToConstant.append(C2567R.styleable.Layout_android_layout_width, 22);
            mapToConstant.append(C2567R.styleable.Layout_android_layout_height, 21);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintCircle, CIRCLE);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintCircleRadius, 62);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintCircleAngle, 63);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintWidth_percent, WIDTH_PERCENT);
            mapToConstant.append(C2567R.styleable.Layout_layout_constraintHeight_percent, HEIGHT_PERCENT);
            mapToConstant.append(C2567R.styleable.Layout_chainUseRtl, 71);
            mapToConstant.append(C2567R.styleable.Layout_barrierDirection, BARRIER_DIRECTION);
            mapToConstant.append(C2567R.styleable.Layout_barrierMargin, BARRIER_MARGIN);
            mapToConstant.append(C2567R.styleable.Layout_constraint_referenced_ids, CONSTRAINT_REFERENCED_IDS);
            mapToConstant.append(C2567R.styleable.Layout_barrierAllowsGoneWidgets, BARRIER_ALLOWS_GONE_WIDGETS);
        }

        public void copyFrom(Layout layout) {
            this.mIsGuideline = layout.mIsGuideline;
            this.mWidth = layout.mWidth;
            this.mApply = layout.mApply;
            this.mHeight = layout.mHeight;
            this.guideBegin = layout.guideBegin;
            this.guideEnd = layout.guideEnd;
            this.guidePercent = layout.guidePercent;
            this.leftToLeft = layout.leftToLeft;
            this.leftToRight = layout.leftToRight;
            this.rightToLeft = layout.rightToLeft;
            this.rightToRight = layout.rightToRight;
            this.topToTop = layout.topToTop;
            this.topToBottom = layout.topToBottom;
            this.bottomToTop = layout.bottomToTop;
            this.bottomToBottom = layout.bottomToBottom;
            this.baselineToBaseline = layout.baselineToBaseline;
            this.startToEnd = layout.startToEnd;
            this.startToStart = layout.startToStart;
            this.endToStart = layout.endToStart;
            this.endToEnd = layout.endToEnd;
            this.horizontalBias = layout.horizontalBias;
            this.verticalBias = layout.verticalBias;
            this.dimensionRatio = layout.dimensionRatio;
            this.circleConstraint = layout.circleConstraint;
            this.circleRadius = layout.circleRadius;
            this.circleAngle = layout.circleAngle;
            this.editorAbsoluteX = layout.editorAbsoluteX;
            this.editorAbsoluteY = layout.editorAbsoluteY;
            this.orientation = layout.orientation;
            this.leftMargin = layout.leftMargin;
            this.rightMargin = layout.rightMargin;
            this.topMargin = layout.topMargin;
            this.bottomMargin = layout.bottomMargin;
            this.endMargin = layout.endMargin;
            this.startMargin = layout.startMargin;
            this.goneLeftMargin = layout.goneLeftMargin;
            this.goneTopMargin = layout.goneTopMargin;
            this.goneRightMargin = layout.goneRightMargin;
            this.goneBottomMargin = layout.goneBottomMargin;
            this.goneEndMargin = layout.goneEndMargin;
            this.goneStartMargin = layout.goneStartMargin;
            this.verticalWeight = layout.verticalWeight;
            this.horizontalWeight = layout.horizontalWeight;
            this.horizontalChainStyle = layout.horizontalChainStyle;
            this.verticalChainStyle = layout.verticalChainStyle;
            this.widthDefault = layout.widthDefault;
            this.heightDefault = layout.heightDefault;
            this.widthMax = layout.widthMax;
            this.heightMax = layout.heightMax;
            this.widthMin = layout.widthMin;
            this.heightMin = layout.heightMin;
            this.widthPercent = layout.widthPercent;
            this.heightPercent = layout.heightPercent;
            this.mBarrierDirection = layout.mBarrierDirection;
            this.mBarrierMargin = layout.mBarrierMargin;
            this.mHelperType = layout.mHelperType;
            this.mConstraintTag = layout.mConstraintTag;
            int[] iArr = layout.mReferenceIds;
            if (iArr != null) {
                this.mReferenceIds = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.mReferenceIds = null;
            }
            this.mReferenceIdString = layout.mReferenceIdString;
            this.constrainedWidth = layout.constrainedWidth;
            this.constrainedHeight = layout.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = layout.mBarrierAllowsGoneWidgets;
        }

        public void dump(MotionScene motionScene, StringBuilder sb) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb.append(IOUtils.f15646e);
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object objLookUpConstraintName = motionScene.lookUpConstraintName(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(objLookUpConstraintName == null ? num : objLookUpConstraintName);
                                sb.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f = (Float) obj;
                            if (f.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f);
                                sb.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2567R.styleable.Layout);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = mapToConstant.get(index);
                if (i2 == 80) {
                    this.constrainedWidth = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                } else if (i2 != ConstraintSet.CONSTRAINED_HEIGHT) {
                    switch (i2) {
                        case 1:
                            this.baselineToBaseline = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.baselineToBaseline);
                            break;
                        case 2:
                            this.bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.bottomMargin);
                            break;
                        case 3:
                            this.bottomToBottom = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.bottomToBottom);
                            break;
                        case 4:
                            this.bottomToTop = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.bottomToTop);
                            break;
                        case 5:
                            this.dimensionRatio = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.editorAbsoluteX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                            break;
                        case 7:
                            this.editorAbsoluteY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                            break;
                        case 8:
                            this.endMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.endMargin);
                            break;
                        case 9:
                            this.endToEnd = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.endToEnd);
                            break;
                        case 10:
                            this.endToStart = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.endToStart);
                            break;
                        case 11:
                            this.goneBottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                            break;
                        case 12:
                            this.goneEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                            break;
                        case 13:
                            this.goneLeftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                            break;
                        case 14:
                            this.goneRightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                            break;
                        case 15:
                            this.goneStartMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                            break;
                        case 16:
                            this.goneTopMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                            break;
                        case 17:
                            this.guideBegin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                            break;
                        case 18:
                            this.guideEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                            break;
                        case 19:
                            this.guidePercent = typedArrayObtainStyledAttributes.getFloat(index, this.guidePercent);
                            break;
                        case 20:
                            this.horizontalBias = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalBias);
                            break;
                        case 21:
                            this.mHeight = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.mHeight);
                            break;
                        case 22:
                            this.mWidth = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.mWidth);
                            break;
                        case 23:
                            this.leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.leftMargin);
                            break;
                        case 24:
                            this.leftToLeft = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.leftToLeft);
                            break;
                        case 25:
                            this.leftToRight = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.leftToRight);
                            break;
                        case 26:
                            this.orientation = typedArrayObtainStyledAttributes.getInt(index, this.orientation);
                            break;
                        case 27:
                            this.rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.rightMargin);
                            break;
                        case 28:
                            this.rightToLeft = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.rightToLeft);
                            break;
                        case 29:
                            this.rightToRight = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.rightToRight);
                            break;
                        case 30:
                            this.startMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.startMargin);
                            break;
                        case 31:
                            this.startToEnd = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.startToEnd);
                            break;
                        case 32:
                            this.startToStart = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.startToStart);
                            break;
                        case 33:
                            this.topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.topMargin);
                            break;
                        case 34:
                            this.topToBottom = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.topToBottom);
                            break;
                        case 35:
                            this.topToTop = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.topToTop);
                            break;
                        case 36:
                            this.verticalBias = typedArrayObtainStyledAttributes.getFloat(index, this.verticalBias);
                            break;
                        case 37:
                            this.horizontalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalWeight);
                            break;
                        case 38:
                            this.verticalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.verticalWeight);
                            break;
                        case 39:
                            this.horizontalChainStyle = typedArrayObtainStyledAttributes.getInt(index, this.horizontalChainStyle);
                            break;
                        case 40:
                            this.verticalChainStyle = typedArrayObtainStyledAttributes.getInt(index, this.verticalChainStyle);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.widthDefault = typedArrayObtainStyledAttributes.getInt(index, this.widthDefault);
                                    break;
                                case 55:
                                    this.heightDefault = typedArrayObtainStyledAttributes.getInt(index, this.heightDefault);
                                    break;
                                case 56:
                                    this.widthMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.widthMax);
                                    break;
                                case 57:
                                    this.heightMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.heightMax);
                                    break;
                                case 58:
                                    this.widthMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.widthMin);
                                    break;
                                case ConstraintSet.HEIGHT_MIN /* 59 */:
                                    this.heightMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.heightMin);
                                    break;
                                default:
                                    switch (i2) {
                                        case CIRCLE /* 61 */:
                                            this.circleConstraint = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.circleConstraint);
                                            break;
                                        case 62:
                                            this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                                            break;
                                        case 63:
                                            this.circleAngle = typedArrayObtainStyledAttributes.getFloat(index, this.circleAngle);
                                            break;
                                        default:
                                            switch (i2) {
                                                case WIDTH_PERCENT /* 69 */:
                                                    this.widthPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case HEIGHT_PERCENT /* 70 */:
                                                    this.heightPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e(ConstraintSet.TAG, "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case BARRIER_DIRECTION /* 72 */:
                                                    this.mBarrierDirection = typedArrayObtainStyledAttributes.getInt(index, this.mBarrierDirection);
                                                    continue;
                                                case BARRIER_MARGIN /* 73 */:
                                                    this.mBarrierMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mBarrierMargin);
                                                    continue;
                                                case CONSTRAINT_REFERENCED_IDS /* 74 */:
                                                    this.mReferenceIdString = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                case BARRIER_ALLOWS_GONE_WIDGETS /* 75 */:
                                                    this.mBarrierAllowsGoneWidgets = typedArrayObtainStyledAttributes.getBoolean(index, this.mBarrierAllowsGoneWidgets);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder("unused attribute 0x");
                                                    break;
                                                case 77:
                                                    this.mConstraintTag = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder("Unknown attribute 0x");
                                                    break;
                                            }
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(mapToConstant.get(index));
                                            Log.w(ConstraintSet.TAG, sb.toString());
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.constrainedHeight = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Motion {
        private static final int ANIMATE_RELATIVE_TO = 5;
        private static final int MOTION_DRAW_PATH = 4;
        private static final int MOTION_STAGGER = 6;
        private static final int PATH_MOTION_ARC = 2;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 1;
        private static SparseIntArray mapToConstant;
        public boolean mApply = false;
        public int mAnimateRelativeTo = -1;
        public String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public float mPathRotate = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(C2567R.styleable.Motion_motionPathRotate, 1);
            mapToConstant.append(C2567R.styleable.Motion_pathMotionArc, 2);
            mapToConstant.append(C2567R.styleable.Motion_transitionEasing, 3);
            mapToConstant.append(C2567R.styleable.Motion_drawPath, 4);
            mapToConstant.append(C2567R.styleable.Motion_animate_relativeTo, 5);
            mapToConstant.append(C2567R.styleable.Motion_motionStagger, 6);
        }

        public void copyFrom(Motion motion) {
            this.mApply = motion.mApply;
            this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
            this.mTransitionEasing = motion.mTransitionEasing;
            this.mPathMotionArc = motion.mPathMotionArc;
            this.mDrawPath = motion.mDrawPath;
            this.mPathRotate = motion.mPathRotate;
            this.mMotionStagger = motion.mMotionStagger;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2567R.styleable.Motion);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (mapToConstant.get(index)) {
                    case 1:
                        this.mPathRotate = typedArrayObtainStyledAttributes.getFloat(index, this.mPathRotate);
                        break;
                    case 2:
                        this.mPathMotionArc = typedArrayObtainStyledAttributes.getInt(index, this.mPathMotionArc);
                        break;
                    case 3:
                        this.mTransitionEasing = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : Easing.NAMED_EASING[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.mDrawPath = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.mAnimateRelativeTo = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.mAnimateRelativeTo);
                        break;
                    case 6:
                        this.mMotionStagger = typedArrayObtainStyledAttributes.getFloat(index, this.mMotionStagger);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class PropertySet {
        public boolean mApply = false;
        public int visibility = 0;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;

        public void copyFrom(PropertySet propertySet) {
            this.mApply = propertySet.mApply;
            this.visibility = propertySet.visibility;
            this.alpha = propertySet.alpha;
            this.mProgress = propertySet.mProgress;
            this.mVisibilityMode = propertySet.mVisibilityMode;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2567R.styleable.PropertySet);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C2567R.styleable.PropertySet_android_alpha) {
                    this.alpha = typedArrayObtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == C2567R.styleable.PropertySet_android_visibility) {
                    this.visibility = typedArrayObtainStyledAttributes.getInt(index, this.visibility);
                    this.visibility = ConstraintSet.VISIBILITY_FLAGS[this.visibility];
                } else if (index == C2567R.styleable.PropertySet_visibilityMode) {
                    this.mVisibilityMode = typedArrayObtainStyledAttributes.getInt(index, this.mVisibilityMode);
                } else if (index == C2567R.styleable.PropertySet_motionProgress) {
                    this.mProgress = typedArrayObtainStyledAttributes.getFloat(index, this.mProgress);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Transform {
        private static final int ELEVATION = 11;
        private static final int ROTATION = 1;
        private static final int ROTATION_X = 2;
        private static final int ROTATION_Y = 3;
        private static final int SCALE_X = 4;
        private static final int SCALE_Y = 5;
        private static final int TRANSFORM_PIVOT_X = 6;
        private static final int TRANSFORM_PIVOT_Y = 7;
        private static final int TRANSLATION_X = 8;
        private static final int TRANSLATION_Y = 9;
        private static final int TRANSLATION_Z = 10;
        private static SparseIntArray mapToConstant;
        public boolean mApply = false;
        public float rotation = 0.0f;
        public float rotationX = 0.0f;
        public float rotationY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float transformPivotX = Float.NaN;
        public float transformPivotY = Float.NaN;
        public float translationX = 0.0f;
        public float translationY = 0.0f;
        public float translationZ = 0.0f;
        public boolean applyElevation = false;
        public float elevation = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(C2567R.styleable.Transform_android_rotation, 1);
            mapToConstant.append(C2567R.styleable.Transform_android_rotationX, 2);
            mapToConstant.append(C2567R.styleable.Transform_android_rotationY, 3);
            mapToConstant.append(C2567R.styleable.Transform_android_scaleX, 4);
            mapToConstant.append(C2567R.styleable.Transform_android_scaleY, 5);
            mapToConstant.append(C2567R.styleable.Transform_android_transformPivotX, 6);
            mapToConstant.append(C2567R.styleable.Transform_android_transformPivotY, 7);
            mapToConstant.append(C2567R.styleable.Transform_android_translationX, 8);
            mapToConstant.append(C2567R.styleable.Transform_android_translationY, 9);
            mapToConstant.append(C2567R.styleable.Transform_android_translationZ, 10);
            mapToConstant.append(C2567R.styleable.Transform_android_elevation, 11);
        }

        public void copyFrom(Transform transform) {
            this.mApply = transform.mApply;
            this.rotation = transform.rotation;
            this.rotationX = transform.rotationX;
            this.rotationY = transform.rotationY;
            this.scaleX = transform.scaleX;
            this.scaleY = transform.scaleY;
            this.transformPivotX = transform.transformPivotX;
            this.transformPivotY = transform.transformPivotY;
            this.translationX = transform.translationX;
            this.translationY = transform.translationY;
            this.translationZ = transform.translationZ;
            this.applyElevation = transform.applyElevation;
            this.elevation = transform.elevation;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2567R.styleable.Transform);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (mapToConstant.get(index)) {
                    case 1:
                        this.rotation = typedArrayObtainStyledAttributes.getFloat(index, this.rotation);
                        break;
                    case 2:
                        this.rotationX = typedArrayObtainStyledAttributes.getFloat(index, this.rotationX);
                        break;
                    case 3:
                        this.rotationY = typedArrayObtainStyledAttributes.getFloat(index, this.rotationY);
                        break;
                    case 4:
                        this.scaleX = typedArrayObtainStyledAttributes.getFloat(index, this.scaleX);
                        break;
                    case 5:
                        this.scaleY = typedArrayObtainStyledAttributes.getFloat(index, this.scaleY);
                        break;
                    case 6:
                        this.transformPivotX = typedArrayObtainStyledAttributes.getDimension(index, this.transformPivotX);
                        break;
                    case 7:
                        this.transformPivotY = typedArrayObtainStyledAttributes.getDimension(index, this.transformPivotY);
                        break;
                    case 8:
                        this.translationX = typedArrayObtainStyledAttributes.getDimension(index, this.translationX);
                        break;
                    case 9:
                        this.translationY = typedArrayObtainStyledAttributes.getDimension(index, this.translationY);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.translationZ = typedArrayObtainStyledAttributes.getDimension(index, this.translationZ);
                        }
                        break;
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.applyElevation = true;
                            this.elevation = typedArrayObtainStyledAttributes.getDimension(index, this.elevation);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        mapToConstant = sparseIntArray;
        sparseIntArray.append(C2567R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        mapToConstant.append(C2567R.styleable.Constraint_layout_editor_absoluteX, 6);
        mapToConstant.append(C2567R.styleable.Constraint_layout_editor_absoluteY, 7);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintGuide_begin, 17);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintGuide_end, 18);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintGuide_percent, 19);
        mapToConstant.append(C2567R.styleable.Constraint_android_orientation, 27);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        mapToConstant.append(C2567R.styleable.Constraint_layout_goneMarginLeft, 13);
        mapToConstant.append(C2567R.styleable.Constraint_layout_goneMarginTop, 16);
        mapToConstant.append(C2567R.styleable.Constraint_layout_goneMarginRight, 14);
        mapToConstant.append(C2567R.styleable.Constraint_layout_goneMarginBottom, 11);
        mapToConstant.append(C2567R.styleable.Constraint_layout_goneMarginStart, 15);
        mapToConstant.append(C2567R.styleable.Constraint_layout_goneMarginEnd, 12);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintVertical_weight, 40);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintVertical_bias, 37);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintLeft_creator, UNUSED);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintTop_creator, UNUSED);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintRight_creator, UNUSED);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintBottom_creator, UNUSED);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintBaseline_creator, UNUSED);
        mapToConstant.append(C2567R.styleable.Constraint_android_layout_marginLeft, 24);
        mapToConstant.append(C2567R.styleable.Constraint_android_layout_marginRight, 28);
        mapToConstant.append(C2567R.styleable.Constraint_android_layout_marginStart, 31);
        mapToConstant.append(C2567R.styleable.Constraint_android_layout_marginEnd, 8);
        mapToConstant.append(C2567R.styleable.Constraint_android_layout_marginTop, 34);
        mapToConstant.append(C2567R.styleable.Constraint_android_layout_marginBottom, 2);
        mapToConstant.append(C2567R.styleable.Constraint_android_layout_width, 23);
        mapToConstant.append(C2567R.styleable.Constraint_android_layout_height, 21);
        mapToConstant.append(C2567R.styleable.Constraint_android_visibility, 22);
        mapToConstant.append(C2567R.styleable.Constraint_android_alpha, 43);
        mapToConstant.append(C2567R.styleable.Constraint_android_elevation, 44);
        mapToConstant.append(C2567R.styleable.Constraint_android_rotationX, 45);
        mapToConstant.append(C2567R.styleable.Constraint_android_rotationY, 46);
        mapToConstant.append(C2567R.styleable.Constraint_android_rotation, 60);
        mapToConstant.append(C2567R.styleable.Constraint_android_scaleX, 47);
        mapToConstant.append(C2567R.styleable.Constraint_android_scaleY, 48);
        mapToConstant.append(C2567R.styleable.Constraint_android_transformPivotX, 49);
        mapToConstant.append(C2567R.styleable.Constraint_android_transformPivotY, 50);
        mapToConstant.append(C2567R.styleable.Constraint_android_translationX, 51);
        mapToConstant.append(C2567R.styleable.Constraint_android_translationY, 52);
        mapToConstant.append(C2567R.styleable.Constraint_android_translationZ, 53);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintWidth_default, 54);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintHeight_default, 55);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintWidth_max, 56);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintHeight_max, 57);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintWidth_min, 58);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintHeight_min, HEIGHT_MIN);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintCircle, CIRCLE);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintCircleRadius, 62);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintCircleAngle, 63);
        mapToConstant.append(C2567R.styleable.Constraint_animate_relativeTo, 64);
        mapToConstant.append(C2567R.styleable.Constraint_transitionEasing, 65);
        mapToConstant.append(C2567R.styleable.Constraint_drawPath, 66);
        mapToConstant.append(C2567R.styleable.Constraint_transitionPathRotate, TRANSITION_PATH_ROTATE);
        mapToConstant.append(C2567R.styleable.Constraint_motionStagger, MOTION_STAGGER);
        mapToConstant.append(C2567R.styleable.Constraint_android_id, 38);
        mapToConstant.append(C2567R.styleable.Constraint_motionProgress, PROGRESS);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintWidth_percent, WIDTH_PERCENT);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintHeight_percent, HEIGHT_PERCENT);
        mapToConstant.append(C2567R.styleable.Constraint_chainUseRtl, 71);
        mapToConstant.append(C2567R.styleable.Constraint_barrierDirection, BARRIER_DIRECTION);
        mapToConstant.append(C2567R.styleable.Constraint_barrierMargin, BARRIER_MARGIN);
        mapToConstant.append(C2567R.styleable.Constraint_constraint_referenced_ids, CONSTRAINT_REFERENCED_IDS);
        mapToConstant.append(C2567R.styleable.Constraint_barrierAllowsGoneWidgets, BARRIER_ALLOWS_GONE_WIDGETS);
        mapToConstant.append(C2567R.styleable.Constraint_pathMotionArc, 76);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constraintTag, 77);
        mapToConstant.append(C2567R.styleable.Constraint_visibilityMode, VISIBILITY_MODE);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constrainedWidth, 80);
        mapToConstant.append(C2567R.styleable.Constraint_layout_constrainedHeight, CONSTRAINED_HEIGHT);
    }

    private void addAttributes(ConstraintAttribute.AttributeType attributeType, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (this.mSavedAttributes.containsKey(strArr[i])) {
                ConstraintAttribute constraintAttribute = this.mSavedAttributes.get(strArr[i]);
                if (constraintAttribute.getType() != attributeType) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.getType().name());
                }
            } else {
                this.mSavedAttributes.put(strArr[i], new ConstraintAttribute(strArr[i], attributeType));
            }
        }
    }

    private int[] convertReferenceString(View view, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(C1262Tc.f3278g);
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = C2567R.id.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    private Constraint fillFromAttributeList(Context context, AttributeSet attributeSet) {
        Constraint constraint = new Constraint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2567R.styleable.Constraint);
        populateConstraint(context, constraint, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    private Constraint get(int i) {
        if (!this.mConstraints.containsKey(Integer.valueOf(i))) {
            this.mConstraints.put(Integer.valueOf(i), new Constraint());
        }
        return this.mConstraints.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lookupID(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private void populateConstraint(Context context, Constraint constraint, TypedArray typedArray) {
        Motion motion;
        String string;
        StringBuilder sb;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != C2567R.styleable.Constraint_android_id && C2567R.styleable.Constraint_android_layout_marginStart != index && C2567R.styleable.Constraint_android_layout_marginEnd != index) {
                constraint.motion.mApply = true;
                constraint.layout.mApply = true;
                constraint.propertySet.mApply = true;
                constraint.transform.mApply = true;
            }
            switch (mapToConstant.get(index)) {
                case 1:
                    Layout layout = constraint.layout;
                    layout.baselineToBaseline = lookupID(typedArray, index, layout.baselineToBaseline);
                    continue;
                    break;
                case 2:
                    Layout layout2 = constraint.layout;
                    layout2.bottomMargin = typedArray.getDimensionPixelSize(index, layout2.bottomMargin);
                    continue;
                    break;
                case 3:
                    Layout layout3 = constraint.layout;
                    layout3.bottomToBottom = lookupID(typedArray, index, layout3.bottomToBottom);
                    continue;
                    break;
                case 4:
                    Layout layout4 = constraint.layout;
                    layout4.bottomToTop = lookupID(typedArray, index, layout4.bottomToTop);
                    continue;
                    break;
                case 5:
                    constraint.layout.dimensionRatio = typedArray.getString(index);
                    continue;
                    break;
                case 6:
                    Layout layout5 = constraint.layout;
                    layout5.editorAbsoluteX = typedArray.getDimensionPixelOffset(index, layout5.editorAbsoluteX);
                    continue;
                    break;
                case 7:
                    Layout layout6 = constraint.layout;
                    layout6.editorAbsoluteY = typedArray.getDimensionPixelOffset(index, layout6.editorAbsoluteY);
                    continue;
                    break;
                case 8:
                    Layout layout7 = constraint.layout;
                    layout7.endMargin = typedArray.getDimensionPixelSize(index, layout7.endMargin);
                    continue;
                    break;
                case 9:
                    Layout layout8 = constraint.layout;
                    layout8.endToEnd = lookupID(typedArray, index, layout8.endToEnd);
                    continue;
                    break;
                case 10:
                    Layout layout9 = constraint.layout;
                    layout9.endToStart = lookupID(typedArray, index, layout9.endToStart);
                    continue;
                    break;
                case 11:
                    Layout layout10 = constraint.layout;
                    layout10.goneBottomMargin = typedArray.getDimensionPixelSize(index, layout10.goneBottomMargin);
                    continue;
                    break;
                case 12:
                    Layout layout11 = constraint.layout;
                    layout11.goneEndMargin = typedArray.getDimensionPixelSize(index, layout11.goneEndMargin);
                    continue;
                    break;
                case 13:
                    Layout layout12 = constraint.layout;
                    layout12.goneLeftMargin = typedArray.getDimensionPixelSize(index, layout12.goneLeftMargin);
                    continue;
                    break;
                case 14:
                    Layout layout13 = constraint.layout;
                    layout13.goneRightMargin = typedArray.getDimensionPixelSize(index, layout13.goneRightMargin);
                    continue;
                    break;
                case 15:
                    Layout layout14 = constraint.layout;
                    layout14.goneStartMargin = typedArray.getDimensionPixelSize(index, layout14.goneStartMargin);
                    continue;
                    break;
                case 16:
                    Layout layout15 = constraint.layout;
                    layout15.goneTopMargin = typedArray.getDimensionPixelSize(index, layout15.goneTopMargin);
                    continue;
                    break;
                case 17:
                    Layout layout16 = constraint.layout;
                    layout16.guideBegin = typedArray.getDimensionPixelOffset(index, layout16.guideBegin);
                    continue;
                    break;
                case 18:
                    Layout layout17 = constraint.layout;
                    layout17.guideEnd = typedArray.getDimensionPixelOffset(index, layout17.guideEnd);
                    continue;
                    break;
                case 19:
                    Layout layout18 = constraint.layout;
                    layout18.guidePercent = typedArray.getFloat(index, layout18.guidePercent);
                    continue;
                    break;
                case 20:
                    Layout layout19 = constraint.layout;
                    layout19.horizontalBias = typedArray.getFloat(index, layout19.horizontalBias);
                    continue;
                    break;
                case 21:
                    Layout layout20 = constraint.layout;
                    layout20.mHeight = typedArray.getLayoutDimension(index, layout20.mHeight);
                    continue;
                    break;
                case 22:
                    PropertySet propertySet = constraint.propertySet;
                    propertySet.visibility = typedArray.getInt(index, propertySet.visibility);
                    PropertySet propertySet2 = constraint.propertySet;
                    propertySet2.visibility = VISIBILITY_FLAGS[propertySet2.visibility];
                    continue;
                    break;
                case 23:
                    Layout layout21 = constraint.layout;
                    layout21.mWidth = typedArray.getLayoutDimension(index, layout21.mWidth);
                    continue;
                    break;
                case 24:
                    Layout layout22 = constraint.layout;
                    layout22.leftMargin = typedArray.getDimensionPixelSize(index, layout22.leftMargin);
                    continue;
                    break;
                case 25:
                    Layout layout23 = constraint.layout;
                    layout23.leftToLeft = lookupID(typedArray, index, layout23.leftToLeft);
                    continue;
                    break;
                case 26:
                    Layout layout24 = constraint.layout;
                    layout24.leftToRight = lookupID(typedArray, index, layout24.leftToRight);
                    continue;
                    break;
                case 27:
                    Layout layout25 = constraint.layout;
                    layout25.orientation = typedArray.getInt(index, layout25.orientation);
                    continue;
                    break;
                case 28:
                    Layout layout26 = constraint.layout;
                    layout26.rightMargin = typedArray.getDimensionPixelSize(index, layout26.rightMargin);
                    continue;
                    break;
                case 29:
                    Layout layout27 = constraint.layout;
                    layout27.rightToLeft = lookupID(typedArray, index, layout27.rightToLeft);
                    continue;
                    break;
                case 30:
                    Layout layout28 = constraint.layout;
                    layout28.rightToRight = lookupID(typedArray, index, layout28.rightToRight);
                    continue;
                    break;
                case 31:
                    Layout layout29 = constraint.layout;
                    layout29.startMargin = typedArray.getDimensionPixelSize(index, layout29.startMargin);
                    continue;
                    break;
                case 32:
                    Layout layout30 = constraint.layout;
                    layout30.startToEnd = lookupID(typedArray, index, layout30.startToEnd);
                    continue;
                    break;
                case 33:
                    Layout layout31 = constraint.layout;
                    layout31.startToStart = lookupID(typedArray, index, layout31.startToStart);
                    continue;
                    break;
                case 34:
                    Layout layout32 = constraint.layout;
                    layout32.topMargin = typedArray.getDimensionPixelSize(index, layout32.topMargin);
                    continue;
                    break;
                case 35:
                    Layout layout33 = constraint.layout;
                    layout33.topToBottom = lookupID(typedArray, index, layout33.topToBottom);
                    continue;
                    break;
                case 36:
                    Layout layout34 = constraint.layout;
                    layout34.topToTop = lookupID(typedArray, index, layout34.topToTop);
                    continue;
                    break;
                case 37:
                    Layout layout35 = constraint.layout;
                    layout35.verticalBias = typedArray.getFloat(index, layout35.verticalBias);
                    continue;
                    break;
                case 38:
                    constraint.mViewId = typedArray.getResourceId(index, constraint.mViewId);
                    continue;
                    break;
                case 39:
                    Layout layout36 = constraint.layout;
                    layout36.horizontalWeight = typedArray.getFloat(index, layout36.horizontalWeight);
                    continue;
                    break;
                case 40:
                    Layout layout37 = constraint.layout;
                    layout37.verticalWeight = typedArray.getFloat(index, layout37.verticalWeight);
                    continue;
                    break;
                case 41:
                    Layout layout38 = constraint.layout;
                    layout38.horizontalChainStyle = typedArray.getInt(index, layout38.horizontalChainStyle);
                    continue;
                    break;
                case 42:
                    Layout layout39 = constraint.layout;
                    layout39.verticalChainStyle = typedArray.getInt(index, layout39.verticalChainStyle);
                    continue;
                    break;
                case 43:
                    PropertySet propertySet3 = constraint.propertySet;
                    propertySet3.alpha = typedArray.getFloat(index, propertySet3.alpha);
                    continue;
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        Transform transform = constraint.transform;
                        transform.applyElevation = true;
                        transform.elevation = typedArray.getDimension(index, transform.elevation);
                    } else {
                        continue;
                    }
                    break;
                case 45:
                    Transform transform2 = constraint.transform;
                    transform2.rotationX = typedArray.getFloat(index, transform2.rotationX);
                    continue;
                    break;
                case 46:
                    Transform transform3 = constraint.transform;
                    transform3.rotationY = typedArray.getFloat(index, transform3.rotationY);
                    continue;
                    break;
                case 47:
                    Transform transform4 = constraint.transform;
                    transform4.scaleX = typedArray.getFloat(index, transform4.scaleX);
                    continue;
                    break;
                case 48:
                    Transform transform5 = constraint.transform;
                    transform5.scaleY = typedArray.getFloat(index, transform5.scaleY);
                    continue;
                    break;
                case 49:
                    Transform transform6 = constraint.transform;
                    transform6.transformPivotX = typedArray.getDimension(index, transform6.transformPivotX);
                    continue;
                    break;
                case 50:
                    Transform transform7 = constraint.transform;
                    transform7.transformPivotY = typedArray.getDimension(index, transform7.transformPivotY);
                    continue;
                    break;
                case 51:
                    Transform transform8 = constraint.transform;
                    transform8.translationX = typedArray.getDimension(index, transform8.translationX);
                    continue;
                    break;
                case 52:
                    Transform transform9 = constraint.transform;
                    transform9.translationY = typedArray.getDimension(index, transform9.translationY);
                    continue;
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        Transform transform10 = constraint.transform;
                        transform10.translationZ = typedArray.getDimension(index, transform10.translationZ);
                    } else {
                        continue;
                    }
                    break;
                case 54:
                    Layout layout40 = constraint.layout;
                    layout40.widthDefault = typedArray.getInt(index, layout40.widthDefault);
                    continue;
                    break;
                case 55:
                    Layout layout41 = constraint.layout;
                    layout41.heightDefault = typedArray.getInt(index, layout41.heightDefault);
                    continue;
                    break;
                case 56:
                    Layout layout42 = constraint.layout;
                    layout42.widthMax = typedArray.getDimensionPixelSize(index, layout42.widthMax);
                    continue;
                    break;
                case 57:
                    Layout layout43 = constraint.layout;
                    layout43.heightMax = typedArray.getDimensionPixelSize(index, layout43.heightMax);
                    continue;
                    break;
                case 58:
                    Layout layout44 = constraint.layout;
                    layout44.widthMin = typedArray.getDimensionPixelSize(index, layout44.widthMin);
                    continue;
                    break;
                case HEIGHT_MIN /* 59 */:
                    Layout layout45 = constraint.layout;
                    layout45.heightMin = typedArray.getDimensionPixelSize(index, layout45.heightMin);
                    continue;
                    break;
                case 60:
                    Transform transform11 = constraint.transform;
                    transform11.rotation = typedArray.getFloat(index, transform11.rotation);
                    continue;
                    break;
                case CIRCLE /* 61 */:
                    Layout layout46 = constraint.layout;
                    layout46.circleConstraint = lookupID(typedArray, index, layout46.circleConstraint);
                    continue;
                    break;
                case 62:
                    Layout layout47 = constraint.layout;
                    layout47.circleRadius = typedArray.getDimensionPixelSize(index, layout47.circleRadius);
                    continue;
                    break;
                case 63:
                    Layout layout48 = constraint.layout;
                    layout48.circleAngle = typedArray.getFloat(index, layout48.circleAngle);
                    continue;
                    break;
                case 64:
                    Motion motion2 = constraint.motion;
                    motion2.mAnimateRelativeTo = lookupID(typedArray, index, motion2.mAnimateRelativeTo);
                    continue;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        motion = constraint.motion;
                        string = typedArray.getString(index);
                    } else {
                        motion = constraint.motion;
                        string = Easing.NAMED_EASING[typedArray.getInteger(index, 0)];
                    }
                    motion.mTransitionEasing = string;
                    continue;
                    break;
                case 66:
                    constraint.motion.mDrawPath = typedArray.getInt(index, 0);
                    continue;
                    break;
                case TRANSITION_PATH_ROTATE /* 67 */:
                    Motion motion3 = constraint.motion;
                    motion3.mPathRotate = typedArray.getFloat(index, motion3.mPathRotate);
                    continue;
                    break;
                case PROGRESS /* 68 */:
                    PropertySet propertySet4 = constraint.propertySet;
                    propertySet4.mProgress = typedArray.getFloat(index, propertySet4.mProgress);
                    continue;
                    break;
                case WIDTH_PERCENT /* 69 */:
                    constraint.layout.widthPercent = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case HEIGHT_PERCENT /* 70 */:
                    constraint.layout.heightPercent = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 71:
                    Log.e(TAG, "CURRENTLY UNSUPPORTED");
                    continue;
                    break;
                case BARRIER_DIRECTION /* 72 */:
                    Layout layout49 = constraint.layout;
                    layout49.mBarrierDirection = typedArray.getInt(index, layout49.mBarrierDirection);
                    continue;
                    break;
                case BARRIER_MARGIN /* 73 */:
                    Layout layout50 = constraint.layout;
                    layout50.mBarrierMargin = typedArray.getDimensionPixelSize(index, layout50.mBarrierMargin);
                    continue;
                    break;
                case CONSTRAINT_REFERENCED_IDS /* 74 */:
                    constraint.layout.mReferenceIdString = typedArray.getString(index);
                    continue;
                    break;
                case BARRIER_ALLOWS_GONE_WIDGETS /* 75 */:
                    Layout layout51 = constraint.layout;
                    layout51.mBarrierAllowsGoneWidgets = typedArray.getBoolean(index, layout51.mBarrierAllowsGoneWidgets);
                    continue;
                    break;
                case 76:
                    Motion motion4 = constraint.motion;
                    motion4.mPathMotionArc = typedArray.getInt(index, motion4.mPathMotionArc);
                    continue;
                    break;
                case 77:
                    constraint.layout.mConstraintTag = typedArray.getString(index);
                    continue;
                    break;
                case VISIBILITY_MODE /* 78 */:
                    PropertySet propertySet5 = constraint.propertySet;
                    propertySet5.mVisibilityMode = typedArray.getInt(index, propertySet5.mVisibilityMode);
                    continue;
                    break;
                case MOTION_STAGGER /* 79 */:
                    Motion motion5 = constraint.motion;
                    motion5.mMotionStagger = typedArray.getFloat(index, motion5.mMotionStagger);
                    continue;
                    break;
                case 80:
                    Layout layout52 = constraint.layout;
                    layout52.constrainedWidth = typedArray.getBoolean(index, layout52.constrainedWidth);
                    continue;
                    break;
                case CONSTRAINED_HEIGHT /* 81 */:
                    Layout layout53 = constraint.layout;
                    layout53.constrainedHeight = typedArray.getBoolean(index, layout53.constrainedHeight);
                    continue;
                    break;
                case UNUSED /* 82 */:
                    sb = new StringBuilder("unused attribute 0x");
                    break;
                default:
                    sb = new StringBuilder("Unknown attribute 0x");
                    break;
            }
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(mapToConstant.get(index));
            Log.w(TAG, sb.toString());
        }
    }

    private String sideToString(int i) {
        switch (i) {
            case 1:
                return TtmlNode.LEFT;
            case 2:
                return TtmlNode.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    private static String[] splitString(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            if (c == ',' && !z) {
                arrayList.add(new String(charArray, i, i2 - i));
                i = i2 + 1;
            } else if (c == '\"') {
                z = !z;
            }
        }
        arrayList.add(new String(charArray, i, charArray.length - i));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void addColorAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.COLOR_TYPE, strArr);
    }

    public void addFloatAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.FLOAT_TYPE, strArr);
    }

    public void addIntAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.INT_TYPE, strArr);
    }

    public void addStringAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.STRING_TYPE, strArr);
    }

    public void addToHorizontalChain(int i, int i2, int i3) {
        connect(i, 1, i2, i2 == 0 ? 1 : 2, 0);
        connect(i, 2, i3, i3 == 0 ? 2 : 1, 0);
        if (i2 != 0) {
            connect(i2, 2, i, 1, 0);
        }
        if (i3 != 0) {
            connect(i3, 1, i, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int i, int i2, int i3) {
        connect(i, 6, i2, i2 == 0 ? 6 : 7, 0);
        connect(i, 7, i3, i3 == 0 ? 7 : 6, 0);
        if (i2 != 0) {
            connect(i2, 7, i, 6, 0);
        }
        if (i3 != 0) {
            connect(i3, 6, i, 7, 0);
        }
    }

    public void addToVerticalChain(int i, int i2, int i3) {
        connect(i, 3, i2, i2 == 0 ? 3 : 4, 0);
        connect(i, 4, i3, i3 == 0 ? 4 : 3, 0);
        if (i2 != 0) {
            connect(i2, 4, i, 3, 0);
        }
        if (i3 != 0) {
            connect(i3, 3, i, 4, 0);
        }
    }

    public void applyCustomAttributes(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                Log.v(TAG, "id unknown " + Debug.getName(childAt));
            } else {
                if (this.mForceId && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.mConstraints.containsKey(Integer.valueOf(id))) {
                    ConstraintAttribute.setAttributes(childAt, this.mConstraints.get(Integer.valueOf(id)).mCustomConstraints);
                }
            }
        }
    }

    public void applyTo(ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void applyToHelper(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        int id = constraintHelper.getId();
        if (this.mConstraints.containsKey(Integer.valueOf(id))) {
            Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
            if (constraintWidget instanceof HelperWidget) {
                constraintHelper.loadParameters(constraint, (HelperWidget) constraintWidget, layoutParams, sparseArray);
            }
        }
    }

    public void applyToInternal(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.mConstraints.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                Log.w(TAG, "id unknown " + Debug.getName(childAt));
            } else {
                if (this.mForceId && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.mConstraints.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            constraint.layout.mHelperType = 1;
                        }
                        int i2 = constraint.layout.mHelperType;
                        if (i2 != -1 && i2 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(constraint.layout.mBarrierDirection);
                            barrier.setMargin(constraint.layout.mBarrierMargin);
                            barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
                            Layout layout = constraint.layout;
                            int[] iArr = layout.mReferenceIds;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = layout.mReferenceIdString;
                                if (str != null) {
                                    layout.mReferenceIds = convertReferenceString(barrier, str);
                                    barrier.setReferencedIds(constraint.layout.mReferenceIds);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.validate();
                        constraint.applyTo(layoutParams);
                        if (z) {
                            ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                        }
                        childAt.setLayoutParams(layoutParams);
                        PropertySet propertySet = constraint.propertySet;
                        if (propertySet.mVisibilityMode == 0) {
                            childAt.setVisibility(propertySet.visibility);
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        childAt.setAlpha(constraint.propertySet.alpha);
                        childAt.setRotation(constraint.transform.rotation);
                        childAt.setRotationX(constraint.transform.rotationX);
                        childAt.setRotationY(constraint.transform.rotationY);
                        childAt.setScaleX(constraint.transform.scaleX);
                        childAt.setScaleY(constraint.transform.scaleY);
                        if (!Float.isNaN(constraint.transform.transformPivotX)) {
                            childAt.setPivotX(constraint.transform.transformPivotX);
                        }
                        if (!Float.isNaN(constraint.transform.transformPivotY)) {
                            childAt.setPivotY(constraint.transform.transformPivotY);
                        }
                        childAt.setTranslationX(constraint.transform.translationX);
                        childAt.setTranslationY(constraint.transform.translationY);
                        if (i3 >= 21) {
                            C0832Mu.m3895a(childAt, constraint.transform.translationZ);
                            Transform transform = constraint.transform;
                            if (transform.applyElevation) {
                                C5144ou.m27336a(childAt, transform.elevation);
                            }
                        }
                    } else {
                        Log.v(TAG, "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            Constraint constraint2 = this.mConstraints.get(num);
            int i4 = constraint2.layout.mHelperType;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                Layout layout2 = constraint2.layout;
                int[] iArr2 = layout2.mReferenceIds;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = layout2.mReferenceIdString;
                    if (str2 != null) {
                        layout2.mReferenceIds = convertReferenceString(barrier2, str2);
                        barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                    }
                }
                barrier2.setType(constraint2.layout.mBarrierDirection);
                barrier2.setMargin(constraint2.layout.mBarrierMargin);
                ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.validateParams();
                constraint2.applyTo(layoutParamsGenerateDefaultLayoutParams);
                constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
            }
            if (constraint2.layout.mIsGuideline) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                constraint2.applyTo(layoutParamsGenerateDefaultLayoutParams2);
                constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
            }
        }
    }

    public void applyToLayoutParams(int i, ConstraintLayout.LayoutParams layoutParams) {
        if (this.mConstraints.containsKey(Integer.valueOf(i))) {
            this.mConstraints.get(Integer.valueOf(i)).applyTo(layoutParams);
        }
    }

    public void applyToWithoutCustom(ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public void center(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        ConstraintSet constraintSet;
        int i8;
        int i9;
        if (i4 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i3 == 1 || i3 == 2) {
            constraintSet = this;
            i8 = i;
            constraintSet.connect(i8, 1, i2, i3, i4);
            i9 = 2;
        } else if (i3 != 6 && i3 != 7) {
            connect(i, 3, i2, i3, i4);
            connect(i, 4, i5, i6, i7);
            this.mConstraints.get(Integer.valueOf(i)).layout.verticalBias = f;
            return;
        } else {
            constraintSet = this;
            i8 = i;
            constraintSet.connect(i8, 6, i2, i3, i4);
            i9 = 7;
        }
        constraintSet.connect(i8, i9, i5, i6, i7);
        this.mConstraints.get(Integer.valueOf(i)).layout.horizontalBias = f;
    }

    public void centerHorizontally(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i2 == 0) {
            i6 = 0;
            i3 = 1;
            i4 = 0;
            i7 = 0;
            i5 = 2;
        } else {
            i3 = 2;
            i4 = 0;
            i5 = 1;
            i6 = i2;
            i7 = i2;
        }
        center(i, i6, i3, i4, i7, i5, 0, 0.5f);
    }

    public void centerHorizontallyRtl(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i2 == 0) {
            i6 = 0;
            i3 = 6;
            i4 = 0;
            i7 = 0;
            i5 = 7;
        } else {
            i3 = 7;
            i4 = 0;
            i5 = 6;
            i6 = i2;
            i7 = i2;
        }
        center(i, i6, i3, i4, i7, i5, 0, 0.5f);
    }

    public void centerVertically(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i2 == 0) {
            i6 = 0;
            i3 = 3;
            i4 = 0;
            i7 = 0;
            i5 = 4;
        } else {
            i3 = 4;
            i4 = 0;
            i5 = 3;
            i6 = i2;
            i7 = i2;
        }
        center(i, i6, i3, i4, i7, i5, 0, 0.5f);
    }

    public void clear(int i) {
        this.mConstraints.remove(Integer.valueOf(i));
    }

    public void clone(Context context, int i) {
        clone((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void connect(int i, int i2, int i3, int i4) {
        Layout layout;
        if (!this.mConstraints.containsKey(Integer.valueOf(i))) {
            this.mConstraints.put(Integer.valueOf(i), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    Layout layout2 = constraint.layout;
                    layout2.leftToLeft = i3;
                    layout2.leftToRight = -1;
                    return;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("left to "), sideToString(i4), " undefined"));
                    }
                    Layout layout3 = constraint.layout;
                    layout3.leftToRight = i3;
                    layout3.leftToLeft = -1;
                    return;
                }
            case 2:
                if (i4 == 1) {
                    Layout layout4 = constraint.layout;
                    layout4.rightToLeft = i3;
                    layout4.rightToRight = -1;
                    return;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("right to "), sideToString(i4), " undefined"));
                    }
                    Layout layout5 = constraint.layout;
                    layout5.rightToRight = i3;
                    layout5.rightToLeft = -1;
                    return;
                }
            case 3:
                if (i4 == 3) {
                    layout = constraint.layout;
                    layout.topToTop = i3;
                    layout.topToBottom = -1;
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("right to "), sideToString(i4), " undefined"));
                    }
                    layout = constraint.layout;
                    layout.topToBottom = i3;
                    layout.topToTop = -1;
                }
                break;
            case 4:
                if (i4 == 4) {
                    layout = constraint.layout;
                    layout.bottomToBottom = i3;
                    layout.bottomToTop = -1;
                } else {
                    if (i4 != 3) {
                        throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("right to "), sideToString(i4), " undefined"));
                    }
                    layout = constraint.layout;
                    layout.bottomToTop = i3;
                    layout.bottomToBottom = -1;
                }
                break;
            case 5:
                if (i4 != 5) {
                    throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("right to "), sideToString(i4), " undefined"));
                }
                Layout layout6 = constraint.layout;
                layout6.baselineToBaseline = i3;
                layout6.bottomToBottom = -1;
                layout6.bottomToTop = -1;
                layout6.topToTop = -1;
                layout6.topToBottom = -1;
                return;
            case 6:
                if (i4 == 6) {
                    Layout layout7 = constraint.layout;
                    layout7.startToStart = i3;
                    layout7.startToEnd = -1;
                    return;
                } else {
                    if (i4 != 7) {
                        throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("right to "), sideToString(i4), " undefined"));
                    }
                    Layout layout8 = constraint.layout;
                    layout8.startToEnd = i3;
                    layout8.startToStart = -1;
                    return;
                }
            case 7:
                if (i4 == 7) {
                    Layout layout9 = constraint.layout;
                    layout9.endToEnd = i3;
                    layout9.endToStart = -1;
                    return;
                } else {
                    if (i4 != 6) {
                        throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("right to "), sideToString(i4), " undefined"));
                    }
                    Layout layout10 = constraint.layout;
                    layout10.endToStart = i3;
                    layout10.endToEnd = -1;
                    return;
                }
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(sideToString(i2));
                sb.append(" to ");
                throw new IllegalArgumentException(C0786MA.m3668a(sb, sideToString(i4), " unknown"));
        }
        layout.baselineToBaseline = -1;
    }

    public void constrainCircle(int i, int i2, int i3, float f) {
        Layout layout = get(i).layout;
        layout.circleConstraint = i2;
        layout.circleRadius = i3;
        layout.circleAngle = f;
    }

    public void constrainDefaultHeight(int i, int i2) {
        get(i).layout.heightDefault = i2;
    }

    public void constrainDefaultWidth(int i, int i2) {
        get(i).layout.widthDefault = i2;
    }

    public void constrainHeight(int i, int i2) {
        get(i).layout.mHeight = i2;
    }

    public void constrainMaxHeight(int i, int i2) {
        get(i).layout.heightMax = i2;
    }

    public void constrainMaxWidth(int i, int i2) {
        get(i).layout.widthMax = i2;
    }

    public void constrainMinHeight(int i, int i2) {
        get(i).layout.heightMin = i2;
    }

    public void constrainMinWidth(int i, int i2) {
        get(i).layout.widthMin = i2;
    }

    public void constrainPercentHeight(int i, float f) {
        get(i).layout.heightPercent = f;
    }

    public void constrainPercentWidth(int i, float f) {
        get(i).layout.widthPercent = f;
    }

    public void constrainWidth(int i, int i2) {
        get(i).layout.mWidth = i2;
    }

    public void constrainedHeight(int i, boolean z) {
        get(i).layout.constrainedHeight = z;
    }

    public void constrainedWidth(int i, boolean z) {
        get(i).layout.constrainedWidth = z;
    }

    public void create(int i, int i2) {
        Layout layout = get(i).layout;
        layout.mIsGuideline = true;
        layout.orientation = i2;
    }

    public void createBarrier(int i, int i2, int i3, int... iArr) {
        Layout layout = get(i).layout;
        layout.mHelperType = 1;
        layout.mBarrierDirection = i2;
        layout.mBarrierMargin = i3;
        layout.mIsGuideline = false;
        layout.mReferenceIds = iArr;
    }

    public void createHorizontalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        createHorizontalChain(i, i2, i3, i4, iArr, fArr, i5, 1, 2);
    }

    public void createHorizontalChainRtl(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        createHorizontalChain(i, i2, i3, i4, iArr, fArr, i5, 6, 7);
    }

    public void createVerticalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            get(iArr[0]).layout.verticalWeight = fArr[0];
        }
        get(iArr[0]).layout.verticalChainStyle = i5;
        connect(iArr[0], 3, i, i2, 0);
        for (int i6 = 1; i6 < iArr.length; i6++) {
            int i7 = i6 - 1;
            connect(iArr[i6], 3, iArr[i7], 4, 0);
            connect(iArr[i7], 4, iArr[i6], 3, 0);
            if (fArr != null) {
                get(iArr[i6]).layout.verticalWeight = fArr[i6];
            }
        }
        connect(iArr[iArr.length - 1], 4, i3, i4, 0);
    }

    public void dump(MotionScene motionScene, int... iArr) {
        HashSet hashSet;
        Set<Integer> setKeySet = this.mConstraints.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i : iArr) {
                hashSet.add(Integer.valueOf(i));
            }
        } else {
            hashSet = new HashSet(setKeySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            Constraint constraint = this.mConstraints.get(num);
            sb.append("<Constraint id=");
            sb.append(num);
            sb.append(" \n");
            constraint.layout.dump(motionScene, sb);
            sb.append("/>\n");
        }
        System.out.println(sb.toString());
    }

    public boolean getApplyElevation(int i) {
        return get(i).transform.applyElevation;
    }

    public Constraint getConstraint(int i) {
        if (this.mConstraints.containsKey(Integer.valueOf(i))) {
            return this.mConstraints.get(Integer.valueOf(i));
        }
        return null;
    }

    public HashMap<String, ConstraintAttribute> getCustomAttributeSet() {
        return this.mSavedAttributes;
    }

    public int getHeight(int i) {
        return get(i).layout.mHeight;
    }

    public int[] getKnownIds() {
        Integer[] numArr = (Integer[]) this.mConstraints.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public Constraint getParameters(int i) {
        return get(i);
    }

    public int[] getReferencedIds(int i) {
        int[] iArr = get(i).layout.mReferenceIds;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public int getVisibility(int i) {
        return get(i).propertySet.visibility;
    }

    public int getVisibilityMode(int i) {
        return get(i).propertySet.mVisibilityMode;
    }

    public int getWidth(int i) {
        return get(i).layout.mWidth;
    }

    public boolean isForceId() {
        return this.mForceId;
    }

    public void load(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    Constraint constraintFillFromAttributeList = fillFromAttributeList(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        constraintFillFromAttributeList.layout.mIsGuideline = true;
                    }
                    this.mConstraints.put(Integer.valueOf(constraintFillFromAttributeList.mViewId), constraintFillFromAttributeList);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public void parseColorAttributes(Constraint constraint, String str) {
        String[] strArrSplit = str.split(C1262Tc.f3278g);
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(TAG, " Unable to parse " + strArrSplit[i]);
            } else {
                constraint.setColorValue(strArrSplit2[0], Color.parseColor(strArrSplit2[1]));
            }
        }
    }

    public void parseFloatAttributes(Constraint constraint, String str) {
        String[] strArrSplit = str.split(C1262Tc.f3278g);
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(TAG, " Unable to parse " + strArrSplit[i]);
            } else {
                constraint.setFloatValue(strArrSplit2[0], Float.parseFloat(strArrSplit2[1]));
            }
        }
    }

    public void parseIntAttributes(Constraint constraint, String str) {
        String[] strArrSplit = str.split(C1262Tc.f3278g);
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(TAG, " Unable to parse " + strArrSplit[i]);
            } else {
                constraint.setFloatValue(strArrSplit2[0], Integer.decode(strArrSplit2[1]).intValue());
            }
        }
    }

    public void parseStringAttributes(Constraint constraint, String str) {
        String[] strArrSplitString = splitString(str);
        for (int i = 0; i < strArrSplitString.length; i++) {
            String[] strArrSplit = strArrSplitString[i].split("=");
            Log.w(TAG, " Unable to parse " + strArrSplitString[i]);
            constraint.setStringValue(strArrSplit[0], strArrSplit[1]);
        }
    }

    public void readFallback(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                this.mConstraints.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
            if (!constraint.layout.mApply) {
                constraint.fillFrom(id, layoutParams);
                if (childAt instanceof ConstraintHelper) {
                    constraint.layout.mReferenceIds = ((ConstraintHelper) childAt).getReferencedIds();
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        constraint.layout.mBarrierAllowsGoneWidgets = barrier.allowsGoneWidget();
                        constraint.layout.mBarrierDirection = barrier.getType();
                        constraint.layout.mBarrierMargin = barrier.getMargin();
                    }
                }
                constraint.layout.mApply = true;
            }
            PropertySet propertySet = constraint.propertySet;
            if (!propertySet.mApply) {
                propertySet.visibility = childAt.getVisibility();
                constraint.propertySet.alpha = childAt.getAlpha();
                constraint.propertySet.mApply = true;
            }
            int i2 = Build.VERSION.SDK_INT;
            Transform transform = constraint.transform;
            if (!transform.mApply) {
                transform.mApply = true;
                transform.rotation = childAt.getRotation();
                constraint.transform.rotationX = childAt.getRotationX();
                constraint.transform.rotationY = childAt.getRotationY();
                constraint.transform.scaleX = childAt.getScaleX();
                constraint.transform.scaleY = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    Transform transform2 = constraint.transform;
                    transform2.transformPivotX = pivotX;
                    transform2.transformPivotY = pivotY;
                }
                constraint.transform.translationX = childAt.getTranslationX();
                constraint.transform.translationY = childAt.getTranslationY();
                if (i2 >= 21) {
                    constraint.transform.translationZ = C0769Lu.m3612a(childAt);
                    Transform transform3 = constraint.transform;
                    if (transform3.applyElevation) {
                        transform3.elevation = C1300UC.m6197a(childAt);
                    }
                }
            }
        }
    }

    public void removeAttribute(String str) {
        this.mSavedAttributes.remove(str);
    }

    public void removeFromHorizontalChain(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        ConstraintSet constraintSet;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ConstraintSet constraintSet2;
        int i12;
        if (this.mConstraints.containsKey(Integer.valueOf(i))) {
            Layout layout = this.mConstraints.get(Integer.valueOf(i)).layout;
            int i13 = layout.leftToRight;
            int i14 = layout.rightToLeft;
            if (i13 == -1 && i14 == -1) {
                int i15 = layout.startToEnd;
                int i16 = layout.endToStart;
                if (i15 != -1 || i16 != -1) {
                    if (i15 != -1 && i16 != -1) {
                        i10 = 0;
                        constraintSet2 = this;
                        constraintSet2.connect(i15, 7, i16, 6, 0);
                        i9 = 7;
                        i11 = 6;
                        i12 = i16;
                        i8 = i13;
                    } else if (i13 != -1 || i16 != -1) {
                        i8 = layout.rightToRight;
                        if (i8 != -1) {
                            i9 = 7;
                            i10 = 0;
                            i11 = 7;
                            constraintSet2 = this;
                            i12 = i13;
                        } else {
                            i8 = layout.leftToLeft;
                            if (i8 != -1) {
                                i9 = 6;
                                i10 = 0;
                                i11 = 6;
                                constraintSet2 = this;
                                i12 = i16;
                            }
                        }
                    }
                    constraintSet2.connect(i12, i11, i8, i9, i10);
                }
                clear(i, 6);
                i7 = 7;
            } else {
                if (i13 == -1 || i14 == -1) {
                    if (i13 != -1 || i14 != -1) {
                        i2 = layout.rightToRight;
                        if (i2 != -1) {
                            i3 = 2;
                            i4 = 0;
                            i5 = 2;
                            constraintSet = this;
                            i6 = i13;
                        } else {
                            i2 = layout.leftToLeft;
                            if (i2 != -1) {
                                i3 = 1;
                                i4 = 0;
                                i5 = 1;
                                constraintSet = this;
                                i6 = i14;
                            }
                        }
                    }
                    clear(i, 1);
                    i7 = 2;
                } else {
                    i4 = 0;
                    constraintSet = this;
                    constraintSet.connect(i13, 2, i14, 1, 0);
                    i3 = 2;
                    i5 = 1;
                    i6 = i14;
                    i2 = i13;
                }
                constraintSet.connect(i6, i5, i2, i3, i4);
                clear(i, 1);
                i7 = 2;
            }
            clear(i, i7);
        }
    }

    public void removeFromVerticalChain(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        ConstraintSet constraintSet;
        int i6;
        if (this.mConstraints.containsKey(Integer.valueOf(i))) {
            Layout layout = this.mConstraints.get(Integer.valueOf(i)).layout;
            int i7 = layout.topToBottom;
            int i8 = layout.bottomToTop;
            if (i7 != -1 || i8 != -1) {
                if (i7 != -1 && i8 != -1) {
                    i4 = 0;
                    constraintSet = this;
                    constraintSet.connect(i7, 4, i8, 3, 0);
                    i3 = 4;
                    i5 = 3;
                    i6 = i8;
                    i2 = i7;
                } else if (i7 != -1 || i8 != -1) {
                    i2 = layout.bottomToBottom;
                    if (i2 != -1) {
                        i3 = 4;
                        i4 = 0;
                        i5 = 4;
                        constraintSet = this;
                        i6 = i7;
                    } else {
                        i2 = layout.topToTop;
                        if (i2 != -1) {
                            i3 = 3;
                            i4 = 0;
                            i5 = 3;
                            constraintSet = this;
                            i6 = i8;
                        }
                    }
                }
                constraintSet.connect(i6, i5, i2, i3, i4);
            }
        }
        clear(i, 3);
        clear(i, 4);
    }

    public void setAlpha(int i, float f) {
        get(i).propertySet.alpha = f;
    }

    public void setApplyElevation(int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            get(i).transform.applyElevation = z;
        }
    }

    public void setBarrierType(int i, int i2) {
        get(i).layout.mHelperType = i2;
    }

    public void setColorValue(int i, String str, int i2) {
        get(i).setColorValue(str, i2);
    }

    public void setDimensionRatio(int i, String str) {
        get(i).layout.dimensionRatio = str;
    }

    public void setEditorAbsoluteX(int i, int i2) {
        get(i).layout.editorAbsoluteX = i2;
    }

    public void setEditorAbsoluteY(int i, int i2) {
        get(i).layout.editorAbsoluteY = i2;
    }

    public void setElevation(int i, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            get(i).transform.elevation = f;
            get(i).transform.applyElevation = true;
        }
    }

    public void setFloatValue(int i, String str, float f) {
        get(i).setFloatValue(str, f);
    }

    public void setForceId(boolean z) {
        this.mForceId = z;
    }

    public void setGoneMargin(int i, int i2, int i3) {
        Constraint constraint = get(i);
        switch (i2) {
            case 1:
                constraint.layout.goneLeftMargin = i3;
                return;
            case 2:
                constraint.layout.goneRightMargin = i3;
                return;
            case 3:
                constraint.layout.goneTopMargin = i3;
                return;
            case 4:
                constraint.layout.goneBottomMargin = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                constraint.layout.goneStartMargin = i3;
                return;
            case 7:
                constraint.layout.goneEndMargin = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setGuidelineBegin(int i, int i2) {
        get(i).layout.guideBegin = i2;
        get(i).layout.guideEnd = -1;
        get(i).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int i, int i2) {
        get(i).layout.guideEnd = i2;
        get(i).layout.guideBegin = -1;
        get(i).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int i, float f) {
        get(i).layout.guidePercent = f;
        get(i).layout.guideEnd = -1;
        get(i).layout.guideBegin = -1;
    }

    public void setHorizontalBias(int i, float f) {
        get(i).layout.horizontalBias = f;
    }

    public void setHorizontalChainStyle(int i, int i2) {
        get(i).layout.horizontalChainStyle = i2;
    }

    public void setHorizontalWeight(int i, float f) {
        get(i).layout.horizontalWeight = f;
    }

    public void setIntValue(int i, String str, int i2) {
        get(i).setIntValue(str, i2);
    }

    public void setMargin(int i, int i2, int i3) {
        Constraint constraint = get(i);
        switch (i2) {
            case 1:
                constraint.layout.leftMargin = i3;
                return;
            case 2:
                constraint.layout.rightMargin = i3;
                return;
            case 3:
                constraint.layout.topMargin = i3;
                return;
            case 4:
                constraint.layout.bottomMargin = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                constraint.layout.startMargin = i3;
                return;
            case 7:
                constraint.layout.endMargin = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setReferencedIds(int i, int... iArr) {
        get(i).layout.mReferenceIds = iArr;
    }

    public void setRotation(int i, float f) {
        get(i).transform.rotation = f;
    }

    public void setRotationX(int i, float f) {
        get(i).transform.rotationX = f;
    }

    public void setRotationY(int i, float f) {
        get(i).transform.rotationY = f;
    }

    public void setScaleX(int i, float f) {
        get(i).transform.scaleX = f;
    }

    public void setScaleY(int i, float f) {
        get(i).transform.scaleY = f;
    }

    public void setStringValue(int i, String str, String str2) {
        get(i).setStringValue(str, str2);
    }

    public void setTransformPivot(int i, float f, float f2) {
        Transform transform = get(i).transform;
        transform.transformPivotY = f2;
        transform.transformPivotX = f;
    }

    public void setTransformPivotX(int i, float f) {
        get(i).transform.transformPivotX = f;
    }

    public void setTransformPivotY(int i, float f) {
        get(i).transform.transformPivotY = f;
    }

    public void setTranslation(int i, float f, float f2) {
        Transform transform = get(i).transform;
        transform.translationX = f;
        transform.translationY = f2;
    }

    public void setTranslationX(int i, float f) {
        get(i).transform.translationX = f;
    }

    public void setTranslationY(int i, float f) {
        get(i).transform.translationY = f;
    }

    public void setTranslationZ(int i, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            get(i).transform.translationZ = f;
        }
    }

    public void setValidateOnParse(boolean z) {
        this.mValidate = z;
    }

    public void setVerticalBias(int i, float f) {
        get(i).layout.verticalBias = f;
    }

    public void setVerticalChainStyle(int i, int i2) {
        get(i).layout.verticalChainStyle = i2;
    }

    public void setVerticalWeight(int i, float f) {
        get(i).layout.verticalWeight = f;
    }

    public void setVisibility(int i, int i2) {
        get(i).propertySet.visibility = i2;
    }

    public void setVisibilityMode(int i, int i2) {
        get(i).propertySet.mVisibilityMode = i2;
    }

    private void createHorizontalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5, int i6, int i7) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            get(iArr[0]).layout.horizontalWeight = fArr[0];
        }
        get(iArr[0]).layout.horizontalChainStyle = i5;
        connect(iArr[0], i6, i, i2, -1);
        for (int i8 = 1; i8 < iArr.length; i8++) {
            int i9 = i8 - 1;
            connect(iArr[i8], i6, iArr[i9], i7, -1);
            connect(iArr[i9], i7, iArr[i8], i6, -1);
            if (fArr != null) {
                get(iArr[i8]).layout.horizontalWeight = fArr[i8];
            }
        }
        connect(iArr[iArr.length - 1], i7, i3, i4, -1);
    }

    public void centerHorizontally(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        connect(i, 1, i2, i3, i4);
        connect(i, 2, i5, i6, i7);
        this.mConstraints.get(Integer.valueOf(i)).layout.horizontalBias = f;
    }

    public void centerHorizontallyRtl(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        connect(i, 6, i2, i3, i4);
        connect(i, 7, i5, i6, i7);
        this.mConstraints.get(Integer.valueOf(i)).layout.horizontalBias = f;
    }

    public void centerVertically(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        connect(i, 3, i2, i3, i4);
        connect(i, 4, i5, i6, i7);
        this.mConstraints.get(Integer.valueOf(i)).layout.verticalBias = f;
    }

    public void clear(int i, int i2) {
        if (this.mConstraints.containsKey(Integer.valueOf(i))) {
            Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    Layout layout = constraint.layout;
                    layout.leftToRight = -1;
                    layout.leftToLeft = -1;
                    layout.leftMargin = -1;
                    layout.goneLeftMargin = -1;
                    return;
                case 2:
                    Layout layout2 = constraint.layout;
                    layout2.rightToRight = -1;
                    layout2.rightToLeft = -1;
                    layout2.rightMargin = -1;
                    layout2.goneRightMargin = -1;
                    return;
                case 3:
                    Layout layout3 = constraint.layout;
                    layout3.topToBottom = -1;
                    layout3.topToTop = -1;
                    layout3.topMargin = -1;
                    layout3.goneTopMargin = -1;
                    return;
                case 4:
                    Layout layout4 = constraint.layout;
                    layout4.bottomToTop = -1;
                    layout4.bottomToBottom = -1;
                    layout4.bottomMargin = -1;
                    layout4.goneBottomMargin = -1;
                    return;
                case 5:
                    constraint.layout.baselineToBaseline = -1;
                    return;
                case 6:
                    Layout layout5 = constraint.layout;
                    layout5.startToEnd = -1;
                    layout5.startToStart = -1;
                    layout5.startMargin = -1;
                    layout5.goneStartMargin = -1;
                    return;
                case 7:
                    Layout layout6 = constraint.layout;
                    layout6.endToStart = -1;
                    layout6.endToEnd = -1;
                    layout6.endMargin = -1;
                    layout6.goneEndMargin = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void clone(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.mConstraints.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                this.mConstraints.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
            constraint.mCustomConstraints = ConstraintAttribute.extractAttributes(this.mSavedAttributes, childAt);
            constraint.fillFrom(id, layoutParams);
            constraint.propertySet.visibility = childAt.getVisibility();
            int i2 = Build.VERSION.SDK_INT;
            constraint.propertySet.alpha = childAt.getAlpha();
            constraint.transform.rotation = childAt.getRotation();
            constraint.transform.rotationX = childAt.getRotationX();
            constraint.transform.rotationY = childAt.getRotationY();
            constraint.transform.scaleX = childAt.getScaleX();
            constraint.transform.scaleY = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                Transform transform = constraint.transform;
                transform.transformPivotX = pivotX;
                transform.transformPivotY = pivotY;
            }
            constraint.transform.translationX = childAt.getTranslationX();
            constraint.transform.translationY = childAt.getTranslationY();
            if (i2 >= 21) {
                constraint.transform.translationZ = C0769Lu.m3612a(childAt);
                Transform transform2 = constraint.transform;
                if (transform2.applyElevation) {
                    transform2.elevation = C1300UC.m6197a(childAt);
                }
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                constraint.layout.mBarrierAllowsGoneWidgets = barrier.allowsGoneWidget();
                constraint.layout.mReferenceIds = barrier.getReferencedIds();
                constraint.layout.mBarrierDirection = barrier.getType();
                constraint.layout.mBarrierMargin = barrier.getMargin();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    public void load(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            Constraint constraintFillFromAttributeList = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        switch (xmlPullParser.getName()) {
                            case "Constraint":
                                constraintFillFromAttributeList = fillFromAttributeList(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case "Guideline":
                                constraintFillFromAttributeList = fillFromAttributeList(context, Xml.asAttributeSet(xmlPullParser));
                                Layout layout = constraintFillFromAttributeList.layout;
                                layout.mIsGuideline = true;
                                layout.mApply = true;
                                break;
                            case "Barrier":
                                constraintFillFromAttributeList = fillFromAttributeList(context, Xml.asAttributeSet(xmlPullParser));
                                constraintFillFromAttributeList.layout.mHelperType = 1;
                                break;
                            case "PropertySet":
                                if (constraintFillFromAttributeList == null) {
                                    throw new RuntimeException(ERROR_MESSAGE + xmlPullParser.getLineNumber());
                                }
                                constraintFillFromAttributeList.propertySet.fillFromAttributeList(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "Transform":
                                if (constraintFillFromAttributeList == null) {
                                    throw new RuntimeException(ERROR_MESSAGE + xmlPullParser.getLineNumber());
                                }
                                constraintFillFromAttributeList.transform.fillFromAttributeList(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "Layout":
                                if (constraintFillFromAttributeList == null) {
                                    throw new RuntimeException(ERROR_MESSAGE + xmlPullParser.getLineNumber());
                                }
                                constraintFillFromAttributeList.layout.fillFromAttributeList(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "Motion":
                                if (constraintFillFromAttributeList == null) {
                                    throw new RuntimeException(ERROR_MESSAGE + xmlPullParser.getLineNumber());
                                }
                                constraintFillFromAttributeList.motion.fillFromAttributeList(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "CustomAttribute":
                                if (constraintFillFromAttributeList == null) {
                                    throw new RuntimeException(ERROR_MESSAGE + xmlPullParser.getLineNumber());
                                }
                                ConstraintAttribute.parse(context, xmlPullParser, constraintFillFromAttributeList.mCustomConstraints);
                                break;
                                break;
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        String name = xmlPullParser.getName();
                        if (TAG.equals(name)) {
                            return;
                        }
                        if (name.equalsIgnoreCase("Constraint")) {
                            this.mConstraints.put(Integer.valueOf(constraintFillFromAttributeList.mViewId), constraintFillFromAttributeList);
                            constraintFillFromAttributeList = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public void readFallback(ConstraintSet constraintSet) {
        for (Integer num : constraintSet.mConstraints.keySet()) {
            num.intValue();
            Constraint constraint = constraintSet.mConstraints.get(num);
            if (!this.mConstraints.containsKey(num)) {
                this.mConstraints.put(num, new Constraint());
            }
            Constraint constraint2 = this.mConstraints.get(num);
            Layout layout = constraint2.layout;
            if (!layout.mApply) {
                layout.copyFrom(constraint.layout);
            }
            PropertySet propertySet = constraint2.propertySet;
            if (!propertySet.mApply) {
                propertySet.copyFrom(constraint.propertySet);
            }
            Transform transform = constraint2.transform;
            if (!transform.mApply) {
                transform.copyFrom(constraint.transform);
            }
            Motion motion = constraint2.motion;
            if (!motion.mApply) {
                motion.copyFrom(constraint.motion);
            }
            for (String str : constraint.mCustomConstraints.keySet()) {
                if (!constraint2.mCustomConstraints.containsKey(str)) {
                    constraint2.mCustomConstraints.put(str, constraint.mCustomConstraints.get(str));
                }
            }
        }
    }

    public void clone(ConstraintSet constraintSet) {
        this.mConstraints.clear();
        for (Integer num : constraintSet.mConstraints.keySet()) {
            this.mConstraints.put(num, constraintSet.mConstraints.get(num).m30210clone());
        }
    }

    public void clone(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.mConstraints.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                this.mConstraints.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
            if (childAt instanceof ConstraintHelper) {
                constraint.fillFromConstraints((ConstraintHelper) childAt, id, layoutParams);
            }
            constraint.fillFromConstraints(id, layoutParams);
        }
    }

    public void connect(int i, int i2, int i3, int i4, int i5) {
        Layout layout;
        Layout layout2;
        if (!this.mConstraints.containsKey(Integer.valueOf(i))) {
            this.mConstraints.put(Integer.valueOf(i), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    Layout layout3 = constraint.layout;
                    layout3.leftToLeft = i3;
                    layout3.leftToRight = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("Left to "), sideToString(i4), " undefined"));
                    }
                    Layout layout4 = constraint.layout;
                    layout4.leftToRight = i3;
                    layout4.leftToLeft = -1;
                }
                constraint.layout.leftMargin = i5;
                return;
            case 2:
                if (i4 == 1) {
                    Layout layout5 = constraint.layout;
                    layout5.rightToLeft = i3;
                    layout5.rightToRight = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("right to "), sideToString(i4), " undefined"));
                    }
                    Layout layout6 = constraint.layout;
                    layout6.rightToRight = i3;
                    layout6.rightToLeft = -1;
                }
                constraint.layout.rightMargin = i5;
                return;
            case 3:
                if (i4 == 3) {
                    layout = constraint.layout;
                    layout.topToTop = i3;
                    layout.topToBottom = -1;
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("right to "), sideToString(i4), " undefined"));
                    }
                    layout = constraint.layout;
                    layout.topToBottom = i3;
                    layout.topToTop = -1;
                }
                layout.baselineToBaseline = -1;
                constraint.layout.topMargin = i5;
                return;
            case 4:
                if (i4 == 4) {
                    layout2 = constraint.layout;
                    layout2.bottomToBottom = i3;
                    layout2.bottomToTop = -1;
                } else {
                    if (i4 != 3) {
                        throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("right to "), sideToString(i4), " undefined"));
                    }
                    layout2 = constraint.layout;
                    layout2.bottomToTop = i3;
                    layout2.bottomToBottom = -1;
                }
                layout2.baselineToBaseline = -1;
                constraint.layout.bottomMargin = i5;
                return;
            case 5:
                if (i4 != 5) {
                    throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("right to "), sideToString(i4), " undefined"));
                }
                Layout layout7 = constraint.layout;
                layout7.baselineToBaseline = i3;
                layout7.bottomToBottom = -1;
                layout7.bottomToTop = -1;
                layout7.topToTop = -1;
                layout7.topToBottom = -1;
                return;
            case 6:
                if (i4 == 6) {
                    Layout layout8 = constraint.layout;
                    layout8.startToStart = i3;
                    layout8.startToEnd = -1;
                } else {
                    if (i4 != 7) {
                        throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("right to "), sideToString(i4), " undefined"));
                    }
                    Layout layout9 = constraint.layout;
                    layout9.startToEnd = i3;
                    layout9.startToStart = -1;
                }
                constraint.layout.startMargin = i5;
                return;
            case 7:
                if (i4 == 7) {
                    Layout layout10 = constraint.layout;
                    layout10.endToEnd = i3;
                    layout10.endToStart = -1;
                } else {
                    if (i4 != 6) {
                        throw new IllegalArgumentException(C0786MA.m3668a(new StringBuilder("right to "), sideToString(i4), " undefined"));
                    }
                    Layout layout11 = constraint.layout;
                    layout11.endToStart = i3;
                    layout11.endToEnd = -1;
                }
                constraint.layout.endMargin = i5;
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(sideToString(i2));
                sb.append(" to ");
                throw new IllegalArgumentException(C0786MA.m3668a(sb, sideToString(i4), " unknown"));
        }
    }
}
